package exercicios_java;

import java.util.Scanner;

public class Exerextra_dowhile_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite");
			n1 = leia.nextInt();
			soma += n1;

		} while (n1 != 0);
		System.out.println("Soma dos números digitados: " + soma);

	}

}
