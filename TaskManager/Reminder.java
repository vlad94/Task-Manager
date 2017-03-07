package task_manager;
import java.time.Period;
public class Reminder extends Task{
	
	public enum RepeatType{ONLY_ONCE(Period.ofDays(0)), DAYLY(Period.ofDays(1)), WEEKLY(Period.ofWeeks(1)), MONTHLY(Period.ofMonths(1)), YEARLY(Period.ofYears(1));
		
		private Period period;
		private RepeatType(Period period) {
			this.period = period;
		}
	}
	private RepeatType repeatType;
	
	public Reminder(boolean hasNotification, String name, String description, String time, String date, RepeatType repeatType) {
		super(hasNotification, name, description, time, date);
		this.taskType = TaskType.Reminder;
	}
	
	
	@Override
	protected void calcNextDate(){
		this.date = this.date.plus(this.repeatType.period);
	}


	@Override
	public String toString() {
		return "Name: " + name + ", Description: " + description;
	}
}
