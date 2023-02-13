package LaçosCondicionais;

import java.util.Scanner;

public class Exer_dowhile_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,somaPar = 0;
		int x = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		num = leia.nextInt();
		
		do {
			if (num >= 0) {
				somaPar += num;
			}
			System.out.println("Digite um número:");
			num = leia.nextInt();
		} while (x != num);
		
		System.out.println("A soma dos números positivos é de: "+somaPar);
		
		
		
		
		
		
		
	}

}
