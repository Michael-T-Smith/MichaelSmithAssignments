import java.util.ArrayList;

public class listOfExceptions {
	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("Hello world");
		myList.add(48);
		myList.add("Goodbye World");

		for (int i = 0; i < myList.size(); i++) {
			try {
			Integer castedValue = (Integer) myList.get(i);
			} catch (ClassCastException e) { 
				System.out.println("This didnt work");
				System.out.println("Location of breakage: " + myList.indexOf(myList.get(i)));
				System.out.println("Value that broken index: " + myList.get(i) + "\n");
				
			}
		}
	}
}
