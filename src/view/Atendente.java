package view;

import java.util.Scanner;
import model.Fruta;
import model.Produto;
import model.ProdutoDeLimpeza;
import model.Verdura;

public class Atendente {
	Scanner input;

	public Atendente() {
		input = new Scanner(System.in);
	}

	public int menuPrincipal() {
		System.out.println("1 - Cadastrar fruta");
		System.out.println("2 - Cadastrar verdura");
		System.out.println("3 - Cadastrar produto de limpeza");
		System.out.println("4 - Listar frutas");
		System.out.println("5 - Listar verduras");
		System.out.println("6 - Listar produtos de limpeza");
		System.out.println("7 - Pesquisar frutas");
		System.out.println("8 - Pesquisar verduras");
		System.out.println("9 - Pesquisar produtos de limpeza");
		System.out.println("10 - Remover fruta");
		System.out.println("11 - Remover verdura");
		System.out.println("12 - Remover produto de limpeza");
		System.out.println("13 - verificar total de fruta");
		System.out.println("14 - verificar total de verdura");
		System.out.println("15 - verificar total de produtos de limpeza");
		System.out.println("0 - Sair");
		int opcao = input.nextInt();
		input.nextLine(); 
		return opcao;
	}

	public String produtoNome() {
		System.out.println("Digite o nome do produto:");
		return input.nextLine();
	}

	public double produtoPreco() {
		System.out.println("Digite o preço do produto:");
		return input.nextDouble();
	}

	public int produtoQuantidade() {
		System.out.println("Digite a quantidade:");
		return input.nextInt();
	}

	public String produtoTipo() {
		input.nextLine(); 
		System.out.println("Digite o tipo do produto:");
		return input.nextLine();
	}

	
	public void vizualizarFrutas(Fruta fruta) {
		System.out.println("---");
		System.out.println("Nome: " + fruta.getNome());
		System.out.println("Preço: R$" + fruta.getPreco());
		System.out.println("Quantidade: " + fruta.getQuantidade());
		System.out.println("Tipo: " + fruta.getTipo());
		System.out.println("ID: " + fruta.getId());
		System.out.println();
	}

	public void vizualizarVerduras(Verdura verdura) {
		System.out.println("---");
		System.out.println("Nome: " + verdura.getNome());
		System.out.println("Preço: R$" + verdura.getPreco());
		System.out.println("Quantidade: " + verdura.getQuantidade());
		System.out.println("Tipo: " + verdura.getTipo());
		System.out.println("ID: " + verdura.getId());
		System.out.println();
	}

	public void vizualizarProdutosDeLimpeza(ProdutoDeLimpeza produtoDeLimpeza) {
		System.out.println("---");
		System.out.println("Nome: " + produtoDeLimpeza.getNome());
		System.out.println("Preço: R$" + produtoDeLimpeza.getPreco());
		System.out.println("Quantidade: " + produtoDeLimpeza.getQuantidade());
		System.out.println("ID: " + produtoDeLimpeza.getId());
		System.out.println();
	}
	
	public int produtoId() {
		System.out.println("Digite o ID do produto");
		return input.nextInt();
	}
	
	public String removerFruta() {
		System.out.println("Digite o nome da fruta a remover:");
		return input.nextLine();
	}

	public void vizualizarFrutaRemovida(Fruta fruta) {
		System.out.println("A fruta '" + fruta.getNome() + "' foi removida.");
	}

	public void vizualizarVerduraRemovida(Verdura verdura) {
		System.out.println("A verdura '" + verdura.getNome() + "' foi removida.");
	}
	
	public void vizualizarProdutoDeLimpezaRemovido(ProdutoDeLimpeza produtoDeLimpeza) {
		System.out.println("O produto de limpeza '" + produtoDeLimpeza.getNome() + "' foi removida.");
	}
	
	public void mensagemFrutaNaoEncontrado() {
		System.out.println("Fruta não encontrada.");
	}

	public void mensagemVerduraNaoEncontrado() {
		System.out.println("Verdura não encontrada.");
	}
	
	public void mensagemProdutoDeLimpezaNaoEncontrado() {
		System.out.println("Produto de limpeza não encontrado.");
	}
	
	public void mostrarTotalDeFrutas(int contagemFrutas) {
		System.out.println("Total de frutas: " + contagemFrutas);
	}

	public void mostrarTotalDeVerduras(int contagemVerduras) {
		System.out.println("Total de verduras: " + contagemVerduras);
	}
	
	public void opcaoInvalida() {
		System.out.println("Opção escolhida inválida");
	}
	
	public void finalizarApp() {
		System.out.println("Sistema encerrado.");
	}
}
