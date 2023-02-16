package exercicios_java;

import java.util.Queue;
import java.util.Scanner;
import java.util.Collections;
import java.util.LinkedList;

public class Exer_fila_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> fila = new LinkedList<String>();
		int opcoes;
		String dados = null;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			opcoes = leia.nextInt();
			
			if (opcoes == 1) {
				System.out.println("Digite o nome: ");
				dados = leia.next();
			
			}
			switch (opcoes) {
			case 1:
				fila.add(dados);
				System.out.println("Cliente adicionado");
				break;
			case 2:
				System.out.println("Clientes da fila atual: " + fila);
				break;
			case 3:

				System.out.println("Cliente foi chamado: " + fila.remove());
				break;
			case 0:
				System.out.println("Programa finalizado!");
				break;
			default:
				System.out.println("Digite o número correto!");

			}
			
		} while (opcoes != 0);

	}
}
