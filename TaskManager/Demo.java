package task_manager;

import java.time.LocalDate;

import task_manager.Reminder.RepeatType;

public class Demo {

	public static void main(String[] args) {
		
		Task t1 = new Routine(false, "zad1", "eat", "16:45", "2017-03-03", 4);
		Task t2 = new Reminder(false, "zad2", "shower", "17:35", "2017-03-31", RepeatType.DAYLY);
		Task t3 = new Reminder(false, "zad3", "clean", "10:35", "2017-03-06", RepeatType.WEEKLY);
		Task t4 = new Routine(false, "zad4", "watch tv", "03:45", "2017-10-10", 2);
		Task t5 = new Routine(false, "zad5", "nz", "16:45", "2016-03-07", 5);
		Task t6 = new Routine(false, "zad6", "napishi domashnoto", "16:30", "2017-03-03", 6);
		Task t7 = new Reminder(false, "zad7", "izmii chiniite", "10:30", "2017-03-07", RepeatType.ONLY_ONCE);
		
		TaskManager tm = new TaskManager();
		tm.addTask(t1);
		tm.addTask(t2);
		tm.addTask(t3);
		tm.addTask(t4);
		tm.addTask(t5);
	/*	
		//лек проблем с едит-а, ако вкарваме една и съща задача няколко пъти
		tm.editTask(t3, t6);
		tm.editTask(t1, t7);
		
		
		tm.printAllTasks();
		System.out.println(tm.numOfUnfinishedTasks);
		
		tm.setCompleteness(true, t4);
		tm.setCompleteness(true, t5);
		
		tm.printAllTasks();
		System.out.println(tm.numOfUnfinishedTasks);
		System.out.println(tm.numOfFinishedTasks);
		
	*/
		tm.printAllTasks();
		tm.addMissedTasks();
		tm.printMissedTasks();
		
		
	}
}
