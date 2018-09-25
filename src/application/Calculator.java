package application;

public class Calculator {
	
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) { 
		return 2.0 * PI * radius; 
		}
	
	public static double volume(double radius) { 
		return 4.0 * PI * radius * radius * radius / 3.0; 
		}
	
/*
	System.out.print("Enter radius: "); 
	
	double radius = sc.nextDouble();
	
	double c = Calculator.circumference(radius);
	double v = Calculator.volume(radius);
	
	System.out.printf("Circumference: %.2f%n", c); 
	System.out.printf("Volume: %.2f%n", v); 
	System.out.printf("PI value: %.2f%n", Calculator.PI);

*/
}

