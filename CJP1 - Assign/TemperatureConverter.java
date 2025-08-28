import java.util.Scanner;

public class TemperatureConverter {
    
    public static double celsiustoFahrenheit(double c){
        return (c*9/5) + 32;
    }

    public static  double fahrenheittoCelsius(double f){
        return (f-32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius: ");
        double c = sc.nextDouble();
        double fahrenheitResult = celsiustoFahrenheit(c);
        System.out.println(c+" °C = " + fahrenheitResult + " °F");


        System.out.println("Enter the temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        double celsiusResult = fahrenheittoCelsius(f);
        System.out.println(f+" °F = " + celsiusResult + " °C");

        sc.close();

        }
}
