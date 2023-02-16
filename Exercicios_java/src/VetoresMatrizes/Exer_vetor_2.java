package exercicios_java;

import java.util.Scanner;

public class Exer_vetor_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int x;
		int numero;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número:");
		numero = leia.nextInt();

		for (x = 0; x < 10; x++) {
			if (numero == vetor[x]) {
				System.out.println("O número " + numero + " está localizado na posição " + x);
			}

		}
		if (numero > 10) {
			System.out.println("Número não foi encontrado!");

		}

	}

}
