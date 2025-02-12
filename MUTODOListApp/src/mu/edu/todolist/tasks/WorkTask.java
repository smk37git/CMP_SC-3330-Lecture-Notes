package mu.edu.todolist.tasks;

import java.time.LocalDateTime;

public class WorkTask extends Task{
	
	private LocalDateTime deadline;
	private Integer priority;

	public WorkTask(String title, String description, LocalDateTime deadline, Integer priority) {
		super(title, description);
		this.deadline = deadline;
		this.priority = priority;
	}
	
	@Override
	public void displayTask() {
		super.displayTask();System.out.println("Deadline: " );
	}
	
	
}
