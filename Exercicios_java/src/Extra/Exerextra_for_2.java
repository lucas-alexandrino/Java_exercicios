package exercicios_java;

import java.util.Scanner;

public class Exerextra_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0, quantPar = 0, quantImpar = 0,quantNumeros = 0;
		int x = 0;

		Scanner leia = new Scanner(System.in);

		

		for (x = n1; x != 10;x++) {
			System.out.println("Digite um número");
			n1 = leia.nextInt();

			if (n1 % 2 == 0) {
				quantPar++;
			} else {
				quantImpar++;
			}
		}
		System.out.println("Números pares: " + quantPar);
		System.out.println("Número ímpares: " + quantImpar);

	}

}
