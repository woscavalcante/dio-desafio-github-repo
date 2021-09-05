import java.util.Scanner;

public class TesteConversorDeTemperatura{

	public static void main(String[] args){

		double temperaturaEmCelsius, temperaturaEmFarenheit;

		Scanner ler = new Scanner(System.in);

		ConversorDeTemperatura temperatura = new ConversorDeTemperatura();

		System.out.print("\nDigite a temperatura em Celsius: ");
		temperaturaEmCelsius = ler.nextDouble();

		temperatura.converterCelsiusParaFahrenheit(temperaturaEmCelsius);
		System.out.print("\nA temperatura em fahrenheit e: ");
		System.out.printf("%.2f\n", temperatura.fahrenheit);

		System.out.print("\nDigite a temperatura em Farenheit: ");
		temperaturaEmFarenheit = ler.nextDouble();

		temperatura.converterFahrenheitParaCelsius(temperaturaEmFarenheit);
		System.out.print("\nA temperatura em celsius e: ");
		System.out.printf("%.2f\n", temperatura.celsius);

	}
}