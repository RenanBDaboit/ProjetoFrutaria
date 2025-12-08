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
	
	public void setQuantidade(int quantidadeFruta) {
		this.quantidade = quantidadeFruta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipoFruta) {
		this.tipo = tipoFruta;
	}
}