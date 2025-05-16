package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the year of your birth");
        int year = sc.nextInt();
        System.out.println("Insert the month of your birth");
        int month = sc.nextInt();
        System.out.println("Insert the day of your birth");
        int day = sc.nextInt();

        LocalDate now = LocalDate.now();

        LocalDate Year = LocalDate.of(year, month, day);


        Period duration = Period.between(Year, now);

        System.out.println("Years old: " + duration.getYears());
        System.out.println("Months old: " + duration.getMonths());
        System.out.println("Days old: " + duration.getDays());


    }
}
