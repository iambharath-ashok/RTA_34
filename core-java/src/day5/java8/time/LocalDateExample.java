package day5.java8.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalTime currentTime = LocalTime.now();

        System.out.println("Current Date:: "+ currentDate);


        LocalDate specificDate = LocalDate.of(1990, 9, 13);
        System.out.println("Specific Date:: "+ specificDate);


        LocalDate futureDate = currentDate.plusDays(10);
        System.out.println(futureDate);


        System.out.println(currentDate.minusMonths(2));


        int year = specificDate.getYear();
        int month = specificDate.getMonthValue();
        int day = specificDate.getDayOfMonth();

        System.out.println("Year::"+ year +" Month:: "+ month + " Day:: "+ day);
    }
}
