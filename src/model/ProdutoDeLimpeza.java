package model;

public class ProdutoDeLimpeza extends Produto{

	private int quantidade;
	
	public ProdutoDeLimpeza(String nome, double preco, int id) {
	
		super(nome, preco, id);
		
		this.quantidade = 0;
	}
	
	public ProdutoDeLimpeza(String nome, double preco, int id, int quantidade) {
		
		super(nome, preco, id);
		
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
