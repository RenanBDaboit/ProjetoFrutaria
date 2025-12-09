package model;

public class Produto {

	protected String nome;

	protected double preco;

	protected int id;

	private static int contadorID = 0;

	public Produto() {

		this.nome = "";
		this.preco = 0.0;
		this.id++;
	}

	public Produto(String nome, double preco, int id) {

		this.nome = nome;
		this.preco = preco;
		this.id = ++contadorID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public String toString() {
		return "Produto: " + nome + " - R$" + preco + " | ID: " + id;
	}
}
