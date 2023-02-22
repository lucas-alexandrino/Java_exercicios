package MetodosAtributos;

import java.text.NumberFormat;

public class Funcionario {

	private String cargo;
	private double salario;
	private String nome;
	private String funcao;
	private double reajuste;

	public Funcionario(String cargo, double salario, String nome, String funcao, double reajuste) {
		this.cargo = cargo;
		this.salario = salario;
		this.nome = nome;
		this.funcao = funcao;
		this.reajuste = reajuste;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public double getReajuste() {
		return reajuste;
	}

	public void setReajuste(double reajuste) {
		this.reajuste = reajuste;

	}

	public void salarioReajustado() {
		salario += salario * reajuste;
		System.out.println("Reajuste salarial de " + reajuste + " Salário reajustado: " + salario);
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}

	public void visualizar() {
		System.out.println("\n O " + cargo + " de nome: " + nome + " com a função de: " + funcao
				+ " tem o sálario de: " + this.formatarMoeda());

	}

}
