package application;

import java.util.Locale;
import java.util.Scanner;

public class MembrosEstaticos {

	public static final double PI = 3.14159; //final indica que o valor � constante tudo maiusculo caso for separar seria P_I
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI: %.2f%n", PI);
				
		}
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	public static double volume (double radius) {
		return 4.0 * PI* radius * radius * radius / 3;
	}
	
	
	
}
