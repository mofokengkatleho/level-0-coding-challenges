public class task8 {
    public static void numberToTime(int number) {
        if (number >= 60) {
            int hour = number / 60;
            System.out.printf("%d %s", hour, hour == 1 ? "hour" : "hours");
        }
        int minutes = number % 60;
        if (minutes != 0) {
            System.out.printf("%s %d %s%n", number >= 60 ? "," : "", minutes, minutes == 1 ? "minute" : "minutes");
        }
    }

    public static void main(String[] args) {
        numberToTime(133);

    }
}