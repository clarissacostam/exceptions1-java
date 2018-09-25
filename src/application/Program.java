package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		File file = new File("C:\\Users\\clarissa.martins\\Documents\\arq.txt");
		
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(FileNotFoundException e ) {
			System.out.println("Error opening file: " +e.getMessage());
			
		}finally {
		if (sc!= null) {
			sc.close();
			}
		System.out.println("Finally block executed");
		}
	}
}

	/*	method1();
		System.out.println("end of program");
		
	}

	public static void method1() {
		System.out.println("**Method1 start**");
		method2();
		
		System.out.println("**Method1 end**");
		
	}
	public static void method2() {
		System.out.println("**Method2 start**");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split("	");
			int position = sc.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		sc.close();
		System.out.println("**Method2 END**");
	}
}*/

/*
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
 * 
 * Triangle x, y;
 * 
 * // Para que seja criado um campo de memória ou objeto dentro do programa é //
 * necessário instanciar a variável. x = new Triangle(); // referencia para do
 * objeto ou endereço até os dados do Triangle. y = new Triangle();
 * 
 * System.out.println("Enter the measures of triangle X: "); x.a =
 * sc.nextDouble(); x.b = sc.nextDouble(); x.c = sc.nextDouble();
 * 
 * System.out.println("Enter the measures of triangle Y: "); y.a =
 * sc.nextDouble(); y.b = sc.nextDouble(); y.c = sc.nextDouble();
 * 
 * double areaX = x.area(); double areaY = y.area();
 * 
 * System.out.printf("Triangle X area: %.4f%n" , areaX);
 * System.out.printf("Triangle X area: %.4f%n" , areaY); if(areaX > areaY) {
 * System.out.printf("Larger area: X"); } else {
 * System.out.printf("Larger area: Y"); } sc.close(); }
 */
