package exercicios_java;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int anos, meses, dias, diasIdade;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite quantos anos você tem:");
		anos = leia.nextInt();
		System.out.println("Digite quantos meses de vida você tem:");
		meses = leia.nextInt();
		System.out.println("Digite quantos dias de vida você tem:");
		dias = leia.nextInt();

		diasIdade = (anos * 365) + (meses * 30) + dias;

		System.out.println("Dias de vida: " + diasIdade);

	}

}
