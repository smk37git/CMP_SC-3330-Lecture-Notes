package edu.mu.todolist;

import java.time.LocalDateTime;

import mu.edu.todolist.tasks.PersonalTask;
import mu.edu.todolist.tasks.Task;
import mu.edu.todolist.tasks.WorkTask;

public class Main {
	
	public static void main(String[] args) {
		Task[] myTasks = new Task[5];
		//Task workTask = new WorkTask("Pay Bills", "Don't forget to pay the ultilty bills", LocalDateTime.now(), 1);
		//System.out.println("Description: " workTask.getDescription());
		//workTask.displayTask();+ 
		
		myTasks[0] = new WorkTask("Pay Bills", "Don't forget to pay the ultilty bills", LocalDateTime.now(), 1);
		myTasks[1] = new PersonalTask("Take Emma to vet", "Emma has a fever, and needs attention.", "MU Vet");
		myTasks[2] = new PersonalTask("Finished CS3330 Group Assignment 2", "I hate Dr. Ekin and this assignment (Not really)", "Valentines Day");
		
		for(int i=0; i<myTasks.length; i++) {
			if(myTasks[i] != null) {
				myTasks[i].displayTask();
				if(myTasks[i].getClass().getSimpleName().equals("WorkTask")) {
					System.out.println("Found a Work Task");
					((WorkTask)myTasks[i]).extendDeadlineInDays(5);
				}
				System.out.println();
			}
		}
				
		/*
		System.out.println();
		workTask.extendDeadlineInDays(4);
		workTask.displayTask();
		
		System.out.println();
		PersonalTask personalTask = new PersonalTask("Take Emma to vet", "Emma has a fever, and needs attention.", "MU Vet");
		personalTask.displayTask();
		*/
	}

}
