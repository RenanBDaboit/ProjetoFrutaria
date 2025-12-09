package view;

import java.util.InputMismatchException;
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
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar produto");
		System.out.println("3 - Pesquisar produtos");
		System.out.println("4 - Remover produto");
		System.out.println("5 - verificar total de produtos");
		System.out.println("0 - Sair");

		boolean opcaoInvalida = true;

		while (opcaoInvalida) {
			try {
				int opcao = input.nextInt();
				input.nextLine();
				opcaoInvalida = false;
				System.out.println();
				return opcao;
			} catch (InputMismatchException erro) {
				System.out.println("Erro, número digitado inválido");
			}
		}
		return -1;
	}

	public int menuCadastrar() {
		System.out.println("1 - Cadastrar fruta");
		System.out.println("2 - Cadastrar verdura");
		System.out.println("3 - Cadastrar produto de limpeza");
		System.out.println("0 - Sair");

		boolean opcaoInvalida = true;

		while (opcaoInvalida) {
			try {
				int opcao = input.nextInt();
				input.nextLine();
				opcaoInvalida = false;
				System.out.println();
				return opcao;
			} catch (InputMismatchException erro) {
				System.out.println("Erro, número digitado inválido");
			}
		}
		return -1;
	}

	public int menuListar() {
		System.out.println("1 - Listar frutas");
		System.out.println("2 - Listar verduras");
		System.out.println("3 - Listar produtos de limpeza");
		System.out.println("0 - Sair");

		boolean opcaoInvalida = true;

		while (opcaoInvalida) {
			try {
				int opcao = input.nextInt();
				input.nextLine();
				opcaoInvalida = false;
				System.out.println();
				return opcao;
			} catch (InputMismatchException erro) {
				System.out.println("Erro, número digitado inválido");
			}
		}
		return -1;
	}

	public int menuPesquisar() {
		System.out.println("1 - Pesquisar frutas");
		System.out.println("2 - Pesquisar verduras");
		System.out.println("3 - Pesquisar produtos de limpeza");
		System.out.println("0 - Sair");

		boolean opcaoInvalida = true;

		while (opcaoInvalida) {
			try {
				int opcao = input.nextInt();
				input.nextLine();
				opcaoInvalida = false;
				System.out.println();
				return opcao;
			} catch (InputMismatchException erro) {
				System.out.println("Erro, número digitado inválido");
			}
		}
		return -1;
	}

	public int menuRemover() {
		System.out.println("1 - Remover frutas");
		System.out.println("2 - Remover verduras");
		System.out.println("3 - Remover produtos de limpeza");
		System.out.println("0 - Sair");

		boolean opcaoInvalida = true;

		while (opcaoInvalida) {
			try {
				int opcao = input.nextInt();
				input.nextLine();
				opcaoInvalida = false;
				System.out.println();
				return opcao;
			} catch (InputMismatchException erro) {
				System.out.println("Erro, número digitado inválido");
			}
		}
		return -1;
	}

	public int menuVerTotal() {
		System.out.println("1 - Ver total de frutas");
		System.out.println("2 - Ver total de verduras");
		System.out.println("3 - Ver total de produtos de limpeza");
		System.out.println("4 - Ver total de produtos");
		System.out.println("0 - Sair");

		boolean opcaoInvalida = true;

		while (opcaoInvalida) {
			try {
				int opcao = input.nextInt();
				input.nextLine();
				opcaoInvalida = false;
				System.out.println();
				return opcao;
			} catch (InputMismatchException erro) {
				System.out.println("Erro, número digitado inválido");
			}
		}
		return -1;
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

	public void vizualizarProdutos(Produto produto) {
		System.out.println("---");
		System.out.println(produto);
		System.out.println();
	}

	public void mensagemListaVazia() {
		System.out.println("Nenhum produto foi cadastrado");
	}

	public void mensagemNenhumaFruta() {
		System.out.println("Nenhuma fruta foi cadastrada");
	}

	public void mensagemNenhumaVerdura() {
		System.out.println("Nenhuma verdura foi cadastrada");
	}

	public void mensagemNenhumProdutoDeLimpeza() {
		System.out.println("Nenhum produto de limpeza foi cadastrado");
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
	
	public void mostrarTotalDeProdutosDeLimpeza(int contagemProdutosDeLimpeza) {
		System.out.println("Total de produtos de limpeza: " + contagemProdutosDeLimpeza);
	}
	
	public void mostrarTotalDeProdutos(int contagemProdutos) {
		System.out.println("Total de produtos: " + contagemProdutos);
	}

	public void opcaoInvalida() {
		System.out.println("Opção escolhida inválida");
	}

	public void finalizarApp() {
		System.out.println("Sistema encerrado.");
	}
}
