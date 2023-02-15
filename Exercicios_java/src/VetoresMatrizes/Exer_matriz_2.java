package exercicios_java;

import java.util.Scanner;

public class Exer_matriz_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[][] nota = new float[10][5];
		float[] media = new float[10];
		int x = 0, linha, coluna;
		float totalNumerosNota = 0;

		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 2; linha++) {
			totalNumerosNota = 0;
			System.out.println("Digite suas notas: ");
			for (coluna = 0; coluna < 4; coluna++) {

				nota[linha][coluna] = leia.nextFloat();
				totalNumerosNota += nota[linha][coluna];
				media[linha] = totalNumerosNota / 4;

			}

			System.out.println("Total numeros" + totalNumerosNota + " X" + x + "Media" + media[x]);
		}

		System.out.printf("\n \t Média geral dos alunes: ");
		System.out.printf("\n Aluno 1: %.2f", media[0]);
		System.out.printf("\n Aluno 2: %.2f", media[1]);
		System.out.printf("\n Aluno 3: %.2f", media[2]);
		System.out.printf("\n Aluno 4: %.2f", media[3]);
		System.out.printf("\n Aluno 5: %.2f", media[4]);
		System.out.printf("\n Aluno 6: %.2f", media[5]);
		System.out.printf("\n Aluno 7: %.2f", media[6]);
		System.out.printf("\n Aluno 8: %.2f", media[7]);
		System.out.printf("\n Aluno 9: %.2f", media[8]);
		System.out.printf("\n Aluno 10: %.2f", media[9]);

	}

}
