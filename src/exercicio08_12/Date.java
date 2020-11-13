package exercicio08_12;

public final class Date {

	private static final int MONTHS_IN_YEAR = 12;
	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	private int month;
	private int day;
	private int year;

	public Date() {
		setMonth(1);
		setDay(1);
		setYear(1900);
	}

	public Date(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
	}

	// SETTERS
	public void setMonth(int month) {
		this.month = checkMonth(month);
	}

	public void setDay(int day) {
		this.day = checkDay(day);
	}

	public void setYear(int year) {
		this.year = checkYear(year);
	}

	// GETTERS
	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	public int getYear() {
		return this.year;
	}

	// utility method to confirm proper month, day and year values
	private int checkMonth(int testMonth) {
		if (testMonth > 0 && testMonth <= MONTHS_IN_YEAR)
			return testMonth;
		else
			throw new IllegalArgumentException("month must be 1-12");
	}

	private int checkDay(int testDay) {
		if (testDay > 0 && testDay <= daysPerMonth[this.month])
			return testDay;

		// check for leap year
		else if (this.month == 2 && this.day == 29 && leapYear())
			return testDay;
		else
			throw new IllegalArgumentException("day out of range for the specified month and year");
	}

	private int checkYear(int testYear) {
		if (testYear > 0 && testYear < 9999)
			return testYear;
		else
			throw new IllegalArgumentException("year must be within the range 0-9999");
	}

	// increment day by one
	public void nextDay() {
		if (getDay() + 1 <= daysPerMonth[getMonth()])
			setDay(getDay() + 1);
		else {
			setDay(1);
			nextMonth();
		}
	}

	public void nextMonth() {
		if (getMonth() + 1 <= MONTHS_IN_YEAR)
			setMonth(getMonth() + 1);
		else {
			setMonth(1);
			setYear(getYear() + 1);
		}
	}

	// Leap year test
	// ----------------------------------------------------------------------------------------------
	private final boolean leapYear() {
		// check for leap year if month is 2 and day is 29
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true; // � um ano Bissexto!
		else
			return false;

	}

}// class
