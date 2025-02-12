package mu.edu.todolist.tasks;

public class Task {
	private String title;
	private String description;
	private boolean isCompleted;
	
	public void markCompleted() {
		this.isCompleted = true;
	}
	
	public void markIncomplete() {
		this.isCompleted = false;
	}
	
	public void displayTask() {
		System.out.println("Title: " + this.title + ", Description: " + description);
	}
	
	public Task(String title, String description) {
		super();
		this.title = title;
		this.description = description;
		this.isCompleted = false;
		
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
