
public class Date {
	private int day;
	private int month;
	private int year;
	private int[] numDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//constructor
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
	//methods
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public boolean isLeapYear() { //checks if leap year
		if (year%4 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public String toString() {
		return month + "/" + day + "/" + year;
	}
	public void addDays(int days) { //adds days to date
		day += days;
		if (isLeapYear() == false) {
			numDays[1] = 28;
		} else {
			numDays[1] = 29;
		}
		while (day > numDays[month - 1]) {
			if (isLeapYear() == false) {
				numDays[1] = 28;
			} else {
				numDays[1] = 29;
			}
			day -= numDays[month - 1];
			if (month == 12) {
				month = 1;
				year++;
			} else {
				month++;
			}
		}
	}
	public void addWeeks(int weeks) { //adds weeks to date
		addDays(weeks*7);
	}
	public int daysTo(Date other) { //calculates difference in days from this to other
		int sumDays = 0;
		while (!(other.toString()).equals(this.toString())) {
			this.addDays(1);
			sumDays++;
		}
		return sumDays;
	}
}
