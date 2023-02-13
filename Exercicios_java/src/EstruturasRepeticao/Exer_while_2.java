package LaçosCondicionais;

import java.util.Scanner;

public class Exer_while_2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		
	int idade,sexo,categoria = 0,pessoasBackEnd = 0, mulheresFrontEnd =0;
	int homensMobile40 =0,mulheresFull30 = 0 ;
	String continua = "s";
	
	
	Scanner leia = new Scanner (System.in);

		
		
	while (!continua.equals("n")) {
	
	// Entra com um valor para a idade
				System.out.println("Digite a idade: ");
				idade = leia.nextInt();

				// Entra com um valor para o Sexo
				System.out.println("\nDigite o Sexo: ");
				System.out.println("1 - Masculino");
				System.out.println("2 - Feminino ");
				System.out.println("3 - Outros");
				sexo = leia.nextInt();

				// Entre com um valor para o Cargo
				System.out.println("\nDigite a Categoria: ");
				System.out.println("1 – Backend");
				System.out.println("2 – Frontend");
				System.out.println("3 – Mobile");
				System.out.println("4 - FullStack");
				categoria = leia.nextInt();

				// Um Menu que perguntara ao usuário se vão querer continuar
				System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
				System.out.println("\nDeseja continuar: ");
				System.out.println("\nSim (S) / Nâo(N)");
				continua = leia.next();
				System.out.println("++++++++++++++++++++++++++++++++++");

				// Laços condicionais para distribuir as pessoas de acordo com a sua Idade, seu Sexo e seu Cargo
				if (categoria == 1) {
					pessoasBackEnd++;
				} if (categoria == 2) {
					if (sexo == 2) {
						mulheresFrontEnd++;
					}
				} if (categoria == 3) {
					if (sexo == 1) {
						if (idade > 40) {
							homensMobile40++;
						}
					}
				} if (categoria == 4) {
					if (sexo == 2) {
						if (idade < 30) {
							mulheresFull30++;
						}
					}
				}

			}
			
			
			// Mostra na tela do usuario
			System.out.printf("\nTotal de pessoas desenvolvedoras Backend: %d",pessoasBackEnd);
			System.out.printf("\nTotal de mulheres desenvolvedoras Frontend: %d",mulheresFrontEnd);
			System.out.printf("\nTotal de homens desenvolvedores Mobile maiores de 40 anos: %d", homensMobile40);
			System.out.printf("\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos: %d", mulheresFull30);

	 	}
	}
	
