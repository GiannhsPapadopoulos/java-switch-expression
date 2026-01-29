

public class Main {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(10);

        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
        printWeekDay(0);
        printWeekDay(10);

    }

    // Method
    public static void printDayOfWeek(int day) {

        String dayOfWeek = switch (day) {
          case 0 -> { yield "Sunday";}
          case 1 -> "Monday";
          case 2 -> "Tuesday";
          case 3 -> "Wednesday";
          case 4 -> "Thursday";
          case 5 -> "Friday";
          case 6 -> "Saturday";
          default -> "Invalid Day";
        };

        System.out.println(day + " stands for " + dayOfWeek);
    }

    public static void printWeekDay(int day) {

        String dayOfWeek = "Invalid Day";

        if (day == 0) {
            dayOfWeek = "Sunday";
        }
        else if (day == 1) {
            dayOfWeek = "Monday";
        }
        else if (day == 2) {
            dayOfWeek = "Tuesday";
        }
        else if (day == 3) {
            dayOfWeek = "Wednesday";
        }
        else if (day == 4) {
            dayOfWeek = "Thursday";
        }
        else if (day == 5) {
            dayOfWeek = "Friday";
        }
        else if (day == 6) {
            dayOfWeek = "Saturday";
        }
        System.out.println(day + " stands for " + dayOfWeek);
    }
//    public static void printWeekDay(int day) {
//        if (day == 0) {
//            System.out.println(day + " stands for Sunday");
//        }
//        else if (day == 1) {
//            System.out.println(day + " stands for Monday");
//        }
//        else if (day == 2) {
//            System.out.println(day + " stands for Tuesday");
//        }
//        else if (day == 3) {
//            System.out.println(day + " stands for Wednesday");
//        }
//        else if (day == 4) {
//            System.out.println(day + " stands for Thrusday");
//        }
//        else if (day == 5) {
//            System.out.println(day + " stands for Friday");
//        }
//        else if (day == 6) {
//            System.out.println(day + " stands for Sunday");
//        }
//        else {
//            System.out.println("Day of the week not found.");
//        }
//    }
}