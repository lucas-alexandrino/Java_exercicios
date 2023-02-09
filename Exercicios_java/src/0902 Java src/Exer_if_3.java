package exercicios_java;

import java.util.Scanner;

public class Exer_if_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade;
		String nome = null;
		String apto = null;
		boolean doacao = true;

		Scanner leia = new Scanner(System.in);

		System.out.println("Escreva seu nome:");
		nome = leia.next();
		System.out.println("Digite sua idade:");
		idade = leia.nextInt();
		System.out.println("Se já doou digite true, se não digite false");
		doacao = leia.nextBoolean();

		if (idade >= 18 && idade <= 59) {
			apto = "Está apto1";

		} else {
			apto = "Não Está apto1";

		}

		if (idade >= 60 && idade <= 69)  {
			if (doacao ==true) {
				apto = "Está apto2";
			}
		} else {
			apto = "Não Está apto2";
		}

		System.out.printf("%s %s para doar sangue", nome, apto);

	}

}
