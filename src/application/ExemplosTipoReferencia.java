package application;
import java.util.Scanner;
import entities.Reserva;

public class ExemplosTipoReferencia {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		Reserva[] vect = new Reserva[10]; // declarando o vetor do tipo Produtcs

		System.out.print("How many rooms will be rented? "); 
		int n = sc.nextInt();

		
		for (int i = 1; i <= vect.length; i++) { // vect.lenght tamanho do vetor
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();

			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int vaga = sc.nextInt();

			vect[vaga] = new Reserva(name, email);
		}
		System.out.println();
		System.out.println("Busy vagas:");

		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
				sc.close();
			}
		}
	}
}
