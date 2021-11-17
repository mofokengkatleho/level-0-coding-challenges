public class task5 {
    public static double triangleArea(double sideA, double sideB, double sideC) {
        final double semiPerimeter = 0.5 * (sideA + sideB + sideC);
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));

    }

    public static void main(String[] args) {
        triangleArea(3, 5, 4);

    }
}