package OperadoresLogicos;

import java.util.Scanner;

public class Exer_if_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		String sinal = null;

		Scanner leia = new Scanner(System.in);

		System.out.println("Escreva o numero:");
		numero = leia.nextInt();

		if (numero >= 0) {
			sinal = "Positivo";

		} else {
			sinal = "Negativo";

		}
		if (numero % 2 == 0) {
			System.out.printf("O numero %d par e %s", numero, sinal);
		}

		else {
			System.out.printf("O numero %d é impár e %s ", numero, sinal);
		}

	}

}
