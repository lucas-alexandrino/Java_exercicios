package OperadoresLogicos;

import java.util.Scanner;

public class Exer_case_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int numeroItem,quantidade;
		double valorTotal;
		
		Scanner leia = new Scanner (System.in);
		
		
		
		System.out.println(" 1 Cachorro Quente R$ 10.00");
		System.out.println("2 X-Salada  R$ 15.00");
		System.out.println("3 X-Bacon R$ 18.00");
		System.out.println("4 Bauru RS$12,00");
		System.out.println("5 Refrigerante R$8,00 ");
		System.out.println("6 Suco de laranja R$ 13.00");
		
		System.out.println("Digite o numero do item:");
		numeroItem=leia.nextInt();
		System.out.println("Digite a quantidade:");
		quantidade = leia.nextInt();
		
		
		
		switch (numeroItem) {
			case 1:
				valorTotal = quantidade * 15;
				System.out.println("Cachorro quente, valor total R$"+valorTotal);
			break;
			case 2:
				valorTotal = quantidade * 10;
				System.out.println("Produto X-Salada,valor total R$"+valorTotal);
			break;	
			case 3:
	 			valorTotal = quantidade * 18;
	 			System.out.println("Produto X-Bacon,valor total R$"+valorTotal);
	 		break;	
			case 4:
				valorTotal = quantidade * 12;
				System.out.println("Produto Bauro,valor total R$"+valorTotal);
			break;
			case 5:
				valorTotal = quantidade * 8;
				System.out.println("Produto Refrigerante, valor total R$"+valorTotal);
			break;
			case 6:
				valorTotal = quantidade * 13;
				System.out.println("Produto Suco de Laranja, valor total R$"+valorTotal);
			break;	
	 		default :
	 			System.out.println("Número Inválido"); 
		}}
}
