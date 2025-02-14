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
		super.displayTask();System.out.println();
		
		System.out.println("Deadline: " + deadline);
		System.out.println("Priority: " + priority);
	}
	
	public void extendDeadlineInDays(int days) {
		deadline = deadline.plusDays(days);
		System.out.print("You're task is extended, here is your new deadline: " + deadline);
	}
}
