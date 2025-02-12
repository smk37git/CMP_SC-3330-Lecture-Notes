package edu.mu.todolist;

import java.time.LocalDateTime;

import mu.edu.todolist.tasks.Task;
import mu.edu.todolist.tasks.WorkTask;

public class Main {
	
	public static void main(String[] args) {
		//Task task = new Task();
		WorkTask workTask = new WorkTask("Pay Bills", "Don't forget to pay the ultilty bills", LocalDateTime.now(), 1);
		System.out.println("Description: " + workTask.getDescription());
		workTask.displayTask();

	}

}
