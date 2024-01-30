package JAN_Pac;

import java.time.LocalDate;
import java.time.Period;

public class Lab12_LocalDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate startDate = LocalDate.of(2022, 2, 1);
        LocalDate endDate = LocalDate.of(2023, 7, 3);

        // Calculate the period between the two dates
        Period period = Period.between(startDate, endDate);

        // Extract the years, months, and days from the period
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        // Print the result
        System.out.println("Duration: " + years + " years, " + months + " months, " + days + " days");
    }
}
