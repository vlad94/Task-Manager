package task_manager;
import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Task implements Comparable<Task>{

	public enum TaskType{Routine, Reminder}
	
	protected boolean hasNotification;
	protected String name;
	protected String description;
	protected LocalTime time;
	protected LocalDate date;
	protected TaskType taskType;
	
	
	public Task(boolean hasNotification, String name, String description, String time, String date) {

		//TODO validation /date and time must be future/
		this.hasNotification = hasNotification;
		this.name = name;
		this.description = description;
		this.time = LocalTime.parse(time);
		this.date = LocalDate.parse(date);
	}
	
	// when task day is over or task is done - calculate the next date to repeat the task
	protected abstract void calcNextDate();
	
	@Override
	public abstract String toString();
	
	@Override
	public int compareTo(Task o) {
		if(this.date.compareTo(o.date) == 0){
			if(this.time.equals(o.time)){
				return this.name.compareTo(o.name);
			}
			return this.time.compareTo(o.time);
		}
		return this.date.compareTo(o.date);
	}
}
