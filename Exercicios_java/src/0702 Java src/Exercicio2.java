package exercicios_java;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2, nota3, nota4;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite suas notas");
		nota1 = leia.nextFloat();
		nota2 = leia.nextFloat();
		nota3 = leia.nextFloat();
		nota4 = leia.nextFloat();

		float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("\n Média final do participante: %.2f ",mediaFinal);

	}

}
