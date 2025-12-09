package model;

public class Verdura extends Produto {

	private int quantidade;
	private String tipo;

	public Verdura(String nome, double preco, int id) {

		super(nome, preco, id);
		this.quantidade = 0;
		this.tipo = "";
	}

	public Verdura(String nome, double preco, int id, int quantidade, String tipo) {

		super(nome, preco, id);
		this.quantidade = quantidade;
		this.tipo = tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidadeVerdura) {
		this.quantidade = quantidadeVerdura;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipoVerdura) {
		this.tipo = tipoVerdura;
	}

	public String toString() {
		return "Verdura: " + nome + " - R$" + preco + " - Qtd:" + quantidade + " - Tipo: " + tipo + " | ID: " + id;
	}
}