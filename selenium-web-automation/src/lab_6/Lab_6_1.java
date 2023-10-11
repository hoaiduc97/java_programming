package lab_6;


public class Lab_6_1 {
    public static void main(String[] args) {
        String timeString = "2hrs and 5 minutes";
        // Get index of value hour and minute
        int indexOfHour = timeString.indexOf("2");
        int indexOfMinute = timeString.indexOf("5");
        // Get value from index of hour and minute
        int hour = Integer.parseInt(String.valueOf(timeString.charAt(indexOfHour)));
        int minute = Integer.parseInt(String.valueOf(timeString.charAt(indexOfMinute)));
        System.out.printf("Time in minute: %d", (hour*60 + minute));
    }
}
