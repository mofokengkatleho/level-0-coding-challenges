public class task6 {
    public static int maximum(int... args) {
        int highest = args[0];

        for (int arg : args) {
            if (arg > highest)
                highest = arg;
        }
        return highest;
    }

    public static void main(String[] args) {
        maximum(4, 6, 7, 5, 8, 7);

    }
}