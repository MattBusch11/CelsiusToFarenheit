import java.util.Scanner;
public class CelsiusToFarenheit {
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a value in degrees Celsius");
		String input = keyboard.nextLine();
		double degreesCelsius = Double.parseDouble(input);
		double degreesFarenheit = (9.0/5.0)*degreesCelsius+32;
		System.out.println(degreesCelsius + " degrees Celsius = " + degreesFarenheit + " degrees Farenheit");
	}

}

