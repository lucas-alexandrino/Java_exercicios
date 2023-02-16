package exercicios_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer_collection_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int numero;
		int x;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número:");
		numero = leia.nextInt();

		lista.add(2);
		lista.add(5);
		lista.add(1);
		lista.add(3);
		lista.add(4);
		lista.add(9);
		lista.add(7);
		lista.add(8);
		lista.add(10);
		lista.add(6);

		if (lista.contains(numero)) {
			System.out.println("O número " + numero + " está localizado na posição: " + lista.indexOf(numero));
		} else {
			System.out.println("O número não foi encontrado!");
		}

	}

}
