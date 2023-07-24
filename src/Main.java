/*Date Time
        Using LocaleDate or another Date class calculate and print:
        How many days are left till the end of the month
        How many days are left till the end of the year, using the length() method from java.time.Year.of()*/

import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Main {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        Long daysBetween = ChronoUnit.DAYS.between(today, lastDayOfMonth);
        System.out.println("Alla fine del mese mancano " + daysBetween + " giorni");

        int dayOfYear = LocalDate.now().getDayOfYear();
        int lastDayOfYear = java.time.Year.of(dayOfYear).length();
        System.out.println("Alla fine dell'anno mancano " + (lastDayOfYear - dayOfYear) + " giorni");

    }
}