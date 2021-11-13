import java.util.Stack;

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
    public static void numberToTime(int number){
        if(number >= 60){
            int hour = number/60;
            System.out.printf("%d %s", hour, hour == 1? "hour": "hours");
        }
        int minutes = number % 60;
        if(minutes != 0) {
            System.out.printf("%s %d %s%n", number >= 60 ? "," : "",minutes,minutes==1?"minute":"minutes");
        }
    }

    public static void checkVowels(String word ){
        String[] vowels = new String[] {"a","e","i","o","u"};
        Stack<String> results = new Stack<>();

        for(String letter: word.split("")) {
            for (int index = 0; index < vowels.length; index++) {
                if (letter.toLowerCase().equals(vowels[index]) && !(results.contains(letter.toLowerCase()))) {
                    results.push(letter.toLowerCase());
                }
            }
        }
        System.out.printf("Vowels:");
        for(int index = 0; index < results.size(); index++){
           System.out.printf(" %s",results.elementAt(index));
           if(index != results.size()-1){
               System.out.printf(",");
           }
        }
    }
    public static void commonLetters(String word1, String word2){
        Stack<String> commonWords = new Stack<>();
        for(int index1 =0; index1 < word1.length();index1++){
            for(int index2 = 0; index2<word2.length();index2++){
                String letter1 = word1.split("")[index1].toLowerCase();
                String letter2 = word2.split("")[index2].toLowerCase();
                if(letter1.equals(letter2) && !commonWords.contains(letter1)){
                    commonWords.push(letter1);
                }

            }
        }
        System.out.printf("%nCommon words:");
        for(int index = 0; index < commonWords.size(); index++){
            System.out.printf(" %s",commonWords.elementAt(index));
            if(index != commonWords.size()-1){
                System.out.printf(",");
            }
        }


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
        numberToTime(133);
        checkVowels("Umuzi");
        commonLetters("house", "computers");
    }
}
