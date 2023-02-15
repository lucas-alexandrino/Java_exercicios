package exercicios_java;

import java.util.Scanner;

public class Exer_vetor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[] = new int[10];
		int x;
		int numeros, somaNumeros = 0;
		double media = 0;

		Scanner leia = new Scanner(System.in);

		for (x = 0; x < 10; x++) {
			System.out.println("Digite 10 numeros:");
			numeros = leia.nextInt();

			vetor[x] = numeros;
			somaNumeros += numeros;

		}
		media = somaNumeros / 10;
		System.out.println("\n Média: " + media);
		System.out.println("\n Indices impares: " + vetor[1] + "," + vetor[3] + "," + vetor[5] + "," + vetor[7] + "," + vetor[9]);
		for (x = 0; x < 10; x++) {
			if (vetor[x] % 2 == 0 && x < 10) {

				System.out.println("\n Elementos Pares:" + vetor[x]);

			}

		}
		System.out.println("\n Soma de todos os elementos do vetor: " + somaNumeros);
	}
}
