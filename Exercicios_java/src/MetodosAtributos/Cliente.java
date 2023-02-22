package MetodosAtributos;

public class Cliente {

	private String pedido;
	private String nome;
	private int rg;
	private int aniversario;
	private String descricao;

	public Cliente(String pedido, String nome, int rg, int aniversario, String descricao) {
		this.pedido = pedido;
		this.nome = nome;
		this.rg = rg;
		this.aniversario = aniversario;
		this.descricao = descricao;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return rg;
	}

	public void setCpf(int rg) {
		this.rg = rg;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void visualizar() {
		System.out.println("\n \t Dados do cliente: ");
		System.out.println("\n Pedido do Cliente: "+pedido);
		System.out.println("\n Nome: "+nome);
		System.out.println("\n RG: "+rg);
		System.out.println("\n Dia aniversário: "+aniversario);
		System.out.println("\n Descrição do pedido: "+descricao);
		
		

	}

}
