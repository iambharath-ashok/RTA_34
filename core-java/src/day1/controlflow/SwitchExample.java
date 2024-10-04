package day1.controlflow;

public class SwitchExample {

    public static void main(String[] args) {


        int day = 5;
        String dayName = null;

        /*
        if(day == 1 ) {
            dayName = "MONDAY";
        } else if(day == 2) {
            dayName = "TUESDAY";
        } else if(day == 3) {
            dayName = "WEDNESDAY";
        }
        ...
        ...
        ...
        else {
            System.out.println("invalid day nuumer");
        }*/

        switch (day) {
            case 1:
                dayName = "monday";
                break;
            case 2:
                dayName = "tuesday";
                break;
            case 3:
                dayName = "wednesday";
                break;
            case 4:
                dayName= "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "saturday";
                break;
            case 7:
                dayName = "sunday";
                break;
            default:
                System.out.println("Invalid Day");
        }

        System.out.println("The day is :: "+ dayName);

    }
}
