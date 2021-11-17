public class task6 {
    public static int maximum(int... args) {
        int highest = -2147483648;

        for (int arg : args) {
            if (arg > highest)
                highest = arg;
        }
        return highest;
    }

    public static void main(String[] args) {
        maximum(3, 2, 3, 5, 4, 5);

    }
}