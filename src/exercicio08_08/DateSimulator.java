package exercicio08_08;

public final class DateSimulator {

	public static void main(String[] args) {

		final int END_DATE = 2017;

		Date date = new Date(26, 2, 2017);

		do {
			try {
				date.nextDay();
			}catch (IllegalArgumentException e) {
				System.out.printf("Error fetching next day: %s\n", e.getMessage());
				break;
			}

			System.out.printf("%s\n", date.toString());

		}while(date.getYear() != END_DATE);

	}//end main

}//end class
