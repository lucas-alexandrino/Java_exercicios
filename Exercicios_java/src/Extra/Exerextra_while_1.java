package exercicios_java;

import java.util.Scanner;

public class Exerextra_while_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade = 0, idadeMenor = 0, idadeMaior = 0;

		Scanner leia = new Scanner(System.in);

		

		while (idade != -99) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if (idade > 0 && idade < 21) {
				idadeMenor+= 1;
			}
			if (idade > 50) {
				idadeMaior+= 1;
			}
		}
		System.out.println("Total menores de 21 anos: " + idadeMenor);
		System.out.println("Total maiores de 50 anos: " + idadeMaior);

	}

}
