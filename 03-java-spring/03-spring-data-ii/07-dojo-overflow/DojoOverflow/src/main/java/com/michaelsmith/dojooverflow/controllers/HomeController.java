package com.michaelsmith.dojooverflow.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.michaelsmith.dojooverflow.models.Answer;
import com.michaelsmith.dojooverflow.models.Question;
import com.michaelsmith.dojooverflow.models.User;
import com.michaelsmith.dojooverflow.services.AnswerService;
import com.michaelsmith.dojooverflow.services.QuestionService;
import com.michaelsmith.dojooverflow.services.UserService;
import com.michaelsmith.dojooverflow.validators.UserValidator;

@Controller
public class HomeController {
	@Autowired
	UserValidator validator;
	@Autowired
	UserService uSerivce;
	@Autowired
	QuestionService qService;
	@Autowired
	AnswerService aService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("user") User user) {
		return "index.jsp";
	}
	
	//create new user
	@PostMapping("/newUser")
	public String newUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session, Model viewModel) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";		
		}
		User newUser = this.uSerivce.registerUser(user);
		session.setAttribute("user_id", newUser.getId());
		viewModel.addAttribute(user);
		return "dashboard.jsp";
	}
	
	//login existing user
	@PostMapping("/login")
	public String login(@RequestParam("loginEmail") String email, @RequestParam("loginPassword")String password, RedirectAttributes redirectAttrs, HttpSession session, Model viewModel) {
		if(!this.uSerivce.authenticateUser(email, password)) {
			redirectAttrs.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
		}
		User user = this.uSerivce.getByEmail(email); 
		List<Question> questions = this.qService.allQuestions();
		session.setAttribute("user_id", user.getId());
		viewModel.addAttribute(user);
		viewModel.addAttribute("questions", questions);
		return "redirect:/dashboard";
	}
	
	//logout user and dump session
	@GetMapping("/logOut")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	//go to dashboard
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model viewModel) {
		Long userId = (Long) session.getAttribute("user_id");
		User user = this.uSerivce.findById(userId);
		List<Question> question = this.qService.allQuestions();
		viewModel.addAttribute("user", user);
		viewModel.addAttribute("questions", question);
		return "dashboard.jsp";
	}
	
	//Add a question
	@GetMapping("/newQuestion")
	public String newQuestion(@ModelAttribute("question") Question question, Model viewModel, HttpSession session) {
		Long userId = (Long) session.getAttribute("user_id");
		User user = this.uSerivce.findById(userId);
		viewModel.addAttribute("user", user); 
		return "newQuestion.jsp";
	}
	
	@PostMapping("/newQuestion")
	public String addQuestion(@Valid @ModelAttribute("question") Question question, BindingResult result, Model viewModel) {
		if(result.hasErrors()) {
			return "newQuestion.jsp";
		}
		qService.saveQuestion(question);
		viewModel.addAttribute("question", question);
		return "redirect:/dashboard";
	}
	
	//answer questions
	@GetMapping("/{id}")
	public String answerQuestions(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("answer") Answer answer)  {
		List<Answer> answers = this.aService.getAllAnswers();
		viewModel.addAttribute(answers);
		viewModel.addAttribute("question", qService.findQuestion(id));
		return "answerAQuestion.jsp";
	}
	
	@PostMapping("/{id}")
	public String submitAnswer(@Valid @ModelAttribute("answer") Answer answer, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			List<Answer> answers = this.aService.getAllAnswers();
			viewModel.addAttribute(answers);
			viewModel.addAttribute("question", qService.findQuestion(id));
			return "/answerAQuestion.jsp";
		}
		aService.saveAnswer(answer);
		return "redirect:/dashboard";
	}
}
