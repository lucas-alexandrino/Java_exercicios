package exercicios_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exer_collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> cores = new ArrayList<>();
		String leitura = null;
		int x = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite as 5 cores: ");
			leitura = leia.next();
			cores.add(leitura);
			x++;
		} while (x != 5);

		System.out.println("Cores adicionadas: " + cores.toString());
		Collections.sort(cores);
		System.out.println("Ordem crescente: " + cores.toString());
	}

}
