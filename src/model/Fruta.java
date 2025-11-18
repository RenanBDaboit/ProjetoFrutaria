package model;

public class Fruta {
	private String nome;
	private double preco;
	private int quantidade;
	private String tipo;

	public Fruta() {
		this.nome = "";
		this.preco = 0.0;
		this.quantidade = 0;
		this.tipo = "";
	}

	public Fruta(String nome, double preco, int quantidade, String tipo) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nomeFruta) {
		this.nome = nomeFruta;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double precoFruta) {
		this.preco = precoFruta;
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
