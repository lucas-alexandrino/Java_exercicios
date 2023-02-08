package exercicios_java;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int anos = 365 , meses=30,totalDias,dias;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite quantos dias de vida você tem:");
		totalDias = leia.nextInt();
		
		anos= totalDias / 365;
		meses = (totalDias % 365)/30;
		dias = (totalDias % 365)%30;
		
		System.out.println(anos);
		System.out.println(meses);
		System.out.println(dias);
		
		
	}

}
