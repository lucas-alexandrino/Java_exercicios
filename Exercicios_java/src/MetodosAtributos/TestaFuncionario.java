package MetodosAtributos;

public class TestaFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario objeto1 = new Funcionario("Gerente", 3000, "Lucas", "Gerir os funcionários", 0.20);
		{
			objeto1.visualizar();
			objeto1.salarioReajustado();
			System.out.println("\n \t Salário reajustado com sucesso! ");
			objeto1.visualizar();
		}
		Funcionario objeto2 = new Funcionario("Auxiliar", 2000, "Joao", "Auxiliar no que for preciso", 0.10);
		{
			objeto2.visualizar();
			objeto2.salarioReajustado();
			System.out.println("\n \t Salário reajustado com sucesso! ");
			objeto2.visualizar();
		}
	}

}
