package exercicios_java;

import java.util.Scanner;

public class Exer_matriz_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][] = new int[3][3];
		int linha = 0, coluna = 0;
		int somaPrincipal = 0, somaSecundaria = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 9 números: ");
		for (linha = 0; linha < 3; linha++) {

			for (coluna = 0; coluna < 3; coluna++) {

				matriz[linha][coluna] = leia.nextInt();

			}

		}

		System.out.println("\n Elementos da Diagonal Principal: " + matriz[0][0] + matriz[1][1] + matriz[2][2]);
		System.out.println("\n Elementos da Diagonal Secudária: " + matriz[0][2] + matriz[1][1] + matriz[2][0]);
		somaPrincipal = (matriz[0][0] + matriz[1][1] + matriz[2][2]);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
		somaSecundaria = (matriz[0][2] + matriz[1][1] + matriz[2][0]);
		System.out.println("Soma dos Elementos da Diagonal Secudária: " + somaSecundaria);

	}
}
