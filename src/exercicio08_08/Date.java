package exercicio08_08;

public final class Date {

	private final int  MONTHS_IN_YEAR = 12;
	private int month; // 1-12
	private int day; // 1-31 based on month
	private int year; // any year

	private static final int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// constructor: confirm proper value for month and day given the year
	public Date(int day, int month, int year) {

		setMonth(month);
		setYear(year);
		setDay(day);

		System.out.printf("Date object constructor for date %s%n", this);
	}

	//GETTERS -----------------------------------------------------------------------------------------------------

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public int getYear() {
		return year;
	}

	//SETTERS -----------------------------------------------------------------------------------------------------

	public void setDay(int day) {
		this.day = checkDay(day);
	}

	public void setMonth(int month) {
		this.month = checkMonth(month);
	}

	public void setYear(int year) {
		this.year = checkYear(year);
	}


	//VALIDATIONS -------------------------------------------------------------------------------------------------

	// utility method to confirm proper month value
	private final int checkMonth(int testMonth) {
		if(testMonth > 0 && testMonth <= MONTHS_IN_YEAR)
			return testMonth;
		else
			throw new IllegalArgumentException("month (" + month + ") must be 1-12");
	}

	// utility method to confirm proper day value based on month and year
	private final int checkDay(int testDay) {
		// check if day in range for month
		if(testDay > 0 && testDay <= daysPerMonth[this.month])
			return testDay;

		// check for leap year
		if(this.month == 2 && testDay == 29 && anoBissesto())
			return testDay;

		throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
	}

	// utility method to confirm proper year value
	private final int checkYear(int testYear) {
		// check year is a positive integer and does not exceed 9999
		if(testYear > 0 && testYear <= 9999)
			return testYear;
		else {
			throw new IllegalArgumentException("year must be within the range 0-9999");
		}
	}

	//INCREMENTATIONS ---------------------------------------------------------------------------------------------

	// increment day by one
	public void nextDay() {
		// check for end of month
		if(getMonth() == 2 && getDay() == 28 && anoBissesto()) {
			setDay(getDay() + 1);
		}else if(getDay() + 1 <= daysPerMonth[getMonth()])
			setDay(getDay() + 1);
		// if end of month reset day and increment month
		else {
			setDay(1);
			nextMonth();
		}
	}
	// increment month
	// see if month is within year range. If not reset to 1 and increment year
	private void nextMonth() {
		if(getMonth() + 1 <= MONTHS_IN_YEAR)
			setMonth(getMonth() + 1);
		else {
			setMonth(1);
			setYear(getYear() + 1);
		}

	}


	//Leap year test ----------------------------------------------------------------------------------------------
	private final boolean anoBissesto() {
		// check for leap year if month is 2 and day is 29
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true; //  é um ano Bissexto!
		else
			return false;

	}

	// return a String of the form month/day/year
	public String toString() {
		return String.format("%d/%d/%d", day, month, year);
	}

}// end class
