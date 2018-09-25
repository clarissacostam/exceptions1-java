package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import entities.AccountHerança;
import entities.Employee;
import entities.OutsourcedEmployee;
import entities.SavingsAccount;

public class ProgramHerança {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list  = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n  = sc.nextInt(); // digite o numero de funcionarios
		
		for (int i =1; i <= n; i++) {
			System.out.println("Employee #"+ i + " data: "); // para cada funcionario um código de ordem
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine(); //Consome quebra de linha 
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if(ch == 'y') {
				System.out.print("Additional charge");
				double additionalCharge = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}
			
			System.out.println("");
			System.out.println("PAYMENTS: ");
			for(Employee emp : list ) {
				System.out.println(emp.getName() + "- $" + String.format("%.2f", emp.payment())); //mostra nome do funcionario e o pagamento
			}
		}
		
		
		
		sc.close();
	}
}
	/*	AccountHerança x = new AccountHerança(1020, "Alex", 1000.0);
		AccountHerança y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withDraw(50.0); 
		y.withDraw(50.0);
		System.out.println("X: "+x.getBalance());
		System.out.println("Y: "+y.getBalance());
		
		}
	}
		
		AccountHerança acc1 = new AccountHerança(1001, "Clari", 1000.0);
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());
		
		AccountHerança acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withDraw(200.0);
		System.out.println(acc2.getBalance());
		
		AccountHerança acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withDraw(200.0);
		System.out.println(acc3.getBalance());
		
		
		
	}
}
		AccountHerança acc = new AccountHerança(1001, "Clari", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Pedro", 0.0, 500.0);
		
		//UPCASTING
		
		AccountHerança acc1 = bacc;
		AccountHerança acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		AccountHerança acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
	//	BusinessAccount acc5 = (BusinessAccount) acc3;
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc3;
			acc5.loan(200.0);
			System.out.print("Loan!");
		}
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Update!!");
		}
		
	} 

}*/
