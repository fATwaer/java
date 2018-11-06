package c4;

import java.time.LocalDate;

public class DataTest {

	public static void main(String[] args) {
		LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
		
		int year = newYearsEve.getYear();
		int month = newYearsEve.getMonthValue();
		int day	= newYearsEve.getDayOfMonth();
		
		System.out.printf("year: %d. month: %d, day: %d\n", year, month, day);
		
		LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
		year = aThousandDaysLater.getYear();
		month = aThousandDaysLater.getMonthValue();
		day = aThousandDaysLater.getDayOfMonth();
		System.out.printf("year: %d. month: %d, day: %d\n", year, month, day);
	}

}
