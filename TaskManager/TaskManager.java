package task_manager;

import java.util.HashMap;
import java.util.TreeSet;

import task_manager.Task.TaskType;

public class TaskManager {
	
	private HashMap<TaskType, TreeSet<Task>> allTasks;
	private HashMap<TaskType, Integer> numOfFinishedTasks;
	private HashMap<TaskType, Integer> numOfUnfinishedTasks;
	
	
	public TaskManager() {
		this.allTasks = new HashMap<TaskType, TreeSet<Task>>();
		this.numOfFinishedTasks = new HashMap<TaskType, Integer>();
		this.numOfUnfinishedTasks = new HashMap<TaskType, Integer>();
	}
	
	
	public void addTask(Task task){
		//TODO - add task to allTasks
	}
	
	public void removeTask(Task task){
		//TODO remove task from allTasks
	}
	
	public void editTask(Task oldTask, Task newTask){
		//TODO - edit task
	} 
	
	public void printHelpInfo(){
		//TODO - print description for the task manager
	}
	
	public void printTodayTasks(){
		//TODO - print all active tasks for today
	}
	
	public void printChart(){
		//TODO - print percent of finished tasks and percent of unfinished tasks and their type
	}
	
	public void setCompleteness(boolean isCompleted, Task task){
		// if isCompleted - add to numOfFinishedTasks and increment the integer
		//else - add to numOfUninishedTasks and increment the integer
	}
}


