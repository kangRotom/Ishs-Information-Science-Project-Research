import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner scanner = new Scanner(System.in);
        // 1) FahrenheitToCelsius 2) CelsiusToFahrenheit 3)Exit :
        while (true){
            System.out.print("1) FahrenheitToCelsius 2) CelsiusToFahrenheit 3)Exit :");
            String menu = scanner.nextLine();
            //if(menu == "1"){
            if(menu.equals("1")){
                System.out.print("Enter temperature in Fahrenheit : ");
                fahrenheit = scanner.nextDouble();
                celsius = (fahrenheit-32.0)*(5.0/9.0);
                System.out.println(fahrenheit+" degrees Fahrenheit is "+celsius+" degrees Celsius.");
            } else if (menu.equals("2")) {
                System.out.print("Enter temperature in Celsius : ");
                celsius = scanner.nextDouble();
                fahrenheit = celsius*(9.0/5.0)+32.0;
                System.out.println(celsius+" degrees Celsius is "+fahrenheit+" degrees Fahrenheit.");
            } else if (menu.equals("3")) {
                System.out.println("Program Finished!");
                break;
            } else{
                System.out.println("Please choose from the given menu.");
            }
        }
    }
}
