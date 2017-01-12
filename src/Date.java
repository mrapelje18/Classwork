
public class Date {
	private int day;
	private int month;
	private int year;
	private int[] numDays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date (int month, int day, int year) {
		if (month > 12) {
			throw new IllegalArgumentException("There are 12 months in a year.");
		} else if (day > numDays[month - 1]) {
				throw new IllegalArgumentException("Choose a day within the number of days in the month.");
		} else {
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}
	
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public boolean isLeapYear() {
		if (year%4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	public void addDays(int days) {
		day += days;
		while (day > numDays[month - 1]) {
			day -= numDays[month - 1];
			
			if (month == 12) {
				month = 1;
				year++;
			} else {
				month++;
			}
		}
	}
	public void addWeeks(int weeks) {
		addDays(weeks*7);
	}
}
