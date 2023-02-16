package exercicios_java;

import java.util.Scanner;
import java.util.Stack;

public class Exer_pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> livro = new Stack<String>();
		int opcoes;
		String dados = null;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			opcoes = leia.nextInt();

			if (opcoes == 1) {
				System.out.println("Digite o nome do Livro:");
				dados = leia.next();
			}

			switch (opcoes) {
			case 1:
				livro.push(dados);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				System.out.println("Lista dos livros: " + livro);
				break;
			case 3:
				livro.pop();
				System.out.println("Um livro foi retirado da pilha: ");
				break;
			case 4:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Digite o número correto!");

			}

		} while (opcoes != 0);

	}

}
