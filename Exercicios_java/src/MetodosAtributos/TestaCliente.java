package MetodosAtributos;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int diaHoje = 20;

		Cliente cliente1 = new Cliente("Camiseta", "nome", 575009110, 25, "Comprei online e vim retirar aqui");
		{
			cliente1.visualizar();

			System.out.println("\n  /////////////////Atualiza pedido/////////////////");
			cliente1.setDescricao("Concluido");
			cliente1.visualizar();

			Cliente cliente2 = new Cliente("Televisão", "nome", 560889110, 20, "Devolução produto com defeito");
			{
				cliente2.visualizar();

				if (cliente2.getAniversario() == diaHoje) {
					System.out.println("\n \t Feliz aniversário!");
				}
				System.out.println("\n  /////////////////Atualiza pedido/////////////////");
				cliente2.setDescricao("Concluido");
				cliente2.visualizar();

			}

		}

	}

}
