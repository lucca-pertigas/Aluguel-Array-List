package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Quarto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List <Quarto> list = new ArrayList<>();
		System.out.print("Quantos quartos voce vai preencher: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o email: ");
			String email = sc.nextLine();
			System.out.print("Qual quarto voce vai ficar: ");
			int numQuarto = sc.nextInt();
			Quarto quarto = new Quarto(nome, email, numQuarto);
			list.add(quarto);
		}
		
		for (Quarto x : list) {
			System.out.println(x);
		}
		
		
	}

}
