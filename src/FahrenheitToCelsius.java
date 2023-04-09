import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float temperatureInFahrenheit;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrencheit: ");

        temperatureInFahrenheit = in.nextInt();
        temperatureInFahrenheit = ((temperatureInFahrenheit -32) *5) /9;
        System.out.println("Temperature in Celsius = " + temperatureInFahrenheit);
    }
}
