
public class Project {
	private String name;
	private String description;
	private double initialCost;
	public String elevatorPitch() {
		return this.name + "($" + this.initialCost + "): " + this.description;
	}
	public Project() {
		
	}
	public Project(String name) {
		this.name = name;
	}
	public Project(String name, String description)	{
		this.name = name;
		this.description = description;
	}
	public Project(String name, double initialCost, String description) {
		this.name = name;
		this.description = description;
		this.initialCost = initialCost;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	public void setCost(double initialCost) {
		this.initialCost = initialCost;
	}
	public double getCost() {
		return initialCost;
	}
	
	
}
