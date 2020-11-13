package exercicio08_12;

public final class DateAndTimeTest {
	public static void main(String[] args) {
		final int END_DATE = 2016;

		DateAndTime dt1 = new DateAndTime();
		DateAndTime dt2 = new DateAndTime(10, 28, 2015, 23, 58, 59);

		// increment DateAndTime
		do {
			dt2.incrementMinute();
			System.out.printf("%s | %s\n", dt2.toUniversalString(), dt2.toString());
		} while (dt2.getYear() < END_DATE);

	}

}
