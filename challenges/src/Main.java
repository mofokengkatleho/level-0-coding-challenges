public class Main {
    public static void task1(){
        int x = 0;
        int y = 1;
        System.out.println(x);
        System.out.println(y);
        x += 3;
        y += x;
        System.out.println(x);
        System.out.println(y);
    }
    public static void task2(){
        int x = 1 + 1 * 2;
        int y = (1 + 1) * 2;
        int z = 1 + (1 * 2);
        double a = 1 + 1 * 2 / 2.0;
        double b = 3 / 2.0;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
    }
    public static void hello(String name){
        System.out.println("Hello "+name+"!");
    }

    public  static void evenOrOdd(int number){
        if(number%2 == 0) System.out.println("even");
        else System.out.println("odd");

    }
    public static double triangleArea(double sideA, double sideB, double sideC){
        final double semiPerimeter = 0.5*(sideA+sideB+sideC);
       return Math.sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC));


    }
    public static int maximum(int... args){
        int highest = -2147483648;

        for(int arg: args){
           if( arg > highest) highest = arg;
        }
        return highest;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32) * 5/9;
    }
    public static double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32 ;
    }



    public static void main(String[] args) {
        task1();
        task2();
        hello("Tshepo");
        evenOrOdd(27);
        triangleArea(3,5,4);
        maximum(3,2,3,5,4,5);
        fahrenheitToCelsius(86);
        celsiusToFahrenheit(150);
    }
}
