public class ConversorDeTemperatura{

	public static double fahrenheit;
	public static double celsius;

	public static double converterCelsiusParaFahrenheit(double temperaturaEmCelsius){
		fahrenheit = 9.0 / 5.0 * temperaturaEmCelsius + 32;
		return fahrenheit;
	}

	public static double converterFahrenheitParaCelsius(double temperaturaEmFarenheit){
		celsius = 5.0 / 9.0 * (temperaturaEmFarenheit - 32);
		return celsius;
	}
}