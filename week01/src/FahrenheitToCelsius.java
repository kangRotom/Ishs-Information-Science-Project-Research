import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        fahrenheit = sc.nextDouble();
        //System.out.println(fahrenheit);
        //System.out.println(sc.nextDouble()); //shortcut
        //(°F − 32) × 5/9 = °C
        celsius=(fahrenheit-32.0)*(5.0/9.0);
        System.out.println("화씨: "+fahrenheit+"도는 섭씨 "+celsius+"도 입니다.");
    }
}
