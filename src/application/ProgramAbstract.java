package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class ProgramAbstract {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i =1; i <=n; i++) {
			System.out.println("Shape # "+i+ " data: ");
			System.out.print("Rectangle or Circle (r/c)? " );
			char ch = sc.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.println("Width: ");
				double width = sc.nextDouble();
				System.out.println("Height: ");
				double heigth = sc.nextDouble();
				list.add(new Rectangle(color, width, heigth)); 
			}else {
				System.out.println("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for(Shape shape : list ) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}
	/*	Locale.setDefault(Locale.US);
		List<AccountHerança> list  = new ArrayList<AccountHerança>();
		
		list.add( new SavingsAccount(1001, "Alex", 500.00, 0.01));
		list.add(new BusinessAccount(1002, "Carochinha", 1000.00, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.00, 0.01));
		list.add(new BusinessAccount(1004, "coisa", 500.00, 500.0));
		
		double sum = 0.0;
		for (AccountHerança acc : list ) {
			sum +=acc.getBalance();
		}
		System.out.printf("Total balance : %.2f%n", sum);
		
		for(AccountHerança acc : list) {
			acc.deposit(10.0);
		}
		for(AccountHerança acc : list ) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
	}
}
*/