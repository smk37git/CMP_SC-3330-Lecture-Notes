package mu.edu.todolist.tasks;

public class Task {
	private String title;
	private String description;
	private boolean isCompleted;
	
	
	/**
	 * Default Constructor
	 */
	public Task() {
		System.out.println("Task Object Created");
	}
	
	/**
	 * Parameterized Constructor
	 * @param title
	 * @param description
	 */
	public Task(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.isCompleted = false;
		
	}
	
	protected void printStatus() {
		System.out.println("This is just printing the status from class Task");
	}
	
	public void markCompleted() {
		this.isCompleted = true;
	}
	
	public void markIncomplete() {
		this.isCompleted = false;
	}
	
	public void displayTask() {
		System.out.println("\nTitle: " + this.title + ", Description: " + description);
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCompleted() {
		return isCompleted;
	}
	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}
	
	
}
