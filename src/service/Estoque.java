package service;

import java.util.List;
import java.util.ArrayList;
import model.Fruta;
import model.Produto;
import model.ProdutoDeLimpeza;
import model.Verdura;
import view.Atendente;

public class Estoque {
	List<Produto> listaProdutos;

	public Estoque() {
		listaProdutos = new ArrayList<>();
	}

	public void gerenciarEstoque(int opcao, Atendente atendente) {
		
		Produto produto1 = new Produto();
		
		switch (opcao) {
			case 1 -> {
				String nome = atendente.produtoNome();
				double preco = atendente.produtoPreco();
				int quantidade = atendente.produtoQuantidade();
				String tipo = atendente.produtoTipo();
				int id = produto1.getId();

				Produto fruta = new Fruta(nome, preco, id, quantidade, tipo);
				listaProdutos.add(fruta);
			}

			case 2 -> {
				String nome = atendente.produtoNome();
				double preco = atendente.produtoPreco();
				int quantidade = atendente.produtoQuantidade();
				String tipo = atendente.produtoTipo();
				int id = produto1.getId();
				
				Produto verdura = new Verdura(nome, preco, id, quantidade, tipo);
				listaProdutos.add(verdura);
			}

			case 3 -> {
				String nome = atendente.produtoNome();
				double preco = atendente.produtoPreco();
				int quantidade = atendente.produtoQuantidade();
				int id = produto1.getId();
				
				Produto produtoDeLimpeza = new ProdutoDeLimpeza(nome, preco, id, quantidade);
				listaProdutos.add(produtoDeLimpeza);
			}
			
			case 4 -> {
				
				for (Produto produto : listaProdutos) {
					
					if (produto instanceof Fruta fruta) {
						atendente.vizualizarFrutas(fruta);
					}
				}
			}
			
			case 5 -> {
				
				for (Produto produto : listaProdutos) {
					
					if (produto instanceof Verdura verdura) {
						atendente.vizualizarVerduras(verdura);
					}
				}
			}
			
			case 6 -> {
				
				for (Produto produto : listaProdutos) {
					
					if (produto instanceof ProdutoDeLimpeza produtoDeLimpeza) {
						atendente.vizualizarProdutosDeLimpeza(produtoDeLimpeza);
					}
				}
			}
			
			case 7 -> {
				
				int id = atendente.produtoId();
				boolean frutaNaoAchada = true;
				
				for (Produto produto : listaProdutos) {
					
					if (id == produto.getId() && produto instanceof Fruta fruta) {
						atendente.vizualizarFrutas(fruta);
						frutaNaoAchada = false;
					}
				}
				
				if (frutaNaoAchada) {
					atendente.mensagemFrutaNaoEncontrado();
				}
				
			}
			
			case 8 -> {
				
				int id = atendente.produtoId();
				boolean verduraNaoAchada = true;
				
				for (Produto produto : listaProdutos) {
					
					if (id == produto.getId() && produto instanceof Verdura verdura) {
						atendente.vizualizarVerduras(verdura);
						verduraNaoAchada = false;
					}
				}
				
				if (verduraNaoAchada) {
					atendente.mensagemVerduraNaoEncontrado();
				}
				
			}
			
			case 9 -> {
				
				int id = atendente.produtoId();
				boolean produtoDeLimpezaNaoAchado = true;
				
				for (Produto produto : listaProdutos) {
					
					if (id == produto.getId() && produto instanceof ProdutoDeLimpeza produtoDeLimpeza) {
						atendente.vizualizarProdutosDeLimpeza(produtoDeLimpeza);
						produtoDeLimpezaNaoAchado = false;
					}
				}
				
				if (produtoDeLimpezaNaoAchado) {
					atendente.mensagemVerduraNaoEncontrado();
				}
				
			}
			
			case 10 -> {
				
				int id = atendente.produtoId();
				boolean removido = false;
				int indiceRemovido = 0;

				for (int indice = 0; indice < listaProdutos.size(); indice++) {
					if (listaProdutos.get(indice).getId() == (id) && listaProdutos.get(indice) instanceof Fruta fruta) {
						removido = true;
						indiceRemovido = indice;
						break;
					}
				}

				if (removido && listaProdutos.get(indiceRemovido) instanceof Fruta fruta) {
					atendente.vizualizarFrutaRemovida(fruta);
					listaProdutos.remove(indiceRemovido);
				} else {
					atendente.mensagemFrutaNaoEncontrado();
				}
			}
			
			case 11 -> {
				
				int id = atendente.produtoId();
				boolean removido = false;
				int indiceRemovido = 0;
				
				for (int indice = 0; indice < listaProdutos.size(); indice++) {
					if (listaProdutos.get(indice).getId() == (id) && listaProdutos.get(indice) instanceof Verdura verdura) {
						removido = true;
						indiceRemovido = indice;
						break;
					}
				}
				
				if (removido && listaProdutos.get(indiceRemovido) instanceof Verdura verdura) {
					atendente.vizualizarVerduraRemovida(verdura);
					listaProdutos.remove(indiceRemovido);
				} else {
					atendente.mensagemVerduraNaoEncontrado();
				}
			}
			
			case 12 -> {
				
				int id = atendente.produtoId();
				boolean removido = false;
				int indiceRemovido = 0;
				
				for (int indice = 0; indice < listaProdutos.size(); indice++) {
					if (listaProdutos.get(indice).getId() == (id) && listaProdutos.get(indice) instanceof Verdura verdura) {
						removido = true;
						indiceRemovido = indice;
						break;
					}
				}
				
				if (removido && listaProdutos.get(indiceRemovido) instanceof ProdutoDeLimpeza produtoDeLimpeza) {
					atendente.vizualizarProdutoDeLimpezaRemovido(produtoDeLimpeza);
					listaProdutos.remove(indiceRemovido);
				} else {
					atendente.mensagemProdutoDeLimpezaNaoEncontrado();
				}
			}
			
			case 13 -> {
				
				int contagemFrutas = 0;
				
				for (Produto produto : listaProdutos) {
					
					if (produto instanceof Fruta fruta) {
						contagemFrutas++;
					}
				}
				
				atendente.mostrarTotalDeFrutas(contagemFrutas);
			}
			
			case 14 -> {
				
				int contagemVerduras = 0;
				
				for (Produto produto : listaProdutos) {
					
					if (produto instanceof Verdura verdura) {
						contagemVerduras++;
					}
				}
				
				atendente.mostrarTotalDeVerduras(contagemVerduras);
			}
			
			case 15 -> {
				
				int contagemProdutosDeLimpeza = 0;
				
				for (Produto produto : listaProdutos) {
					
					if (produto instanceof ProdutoDeLimpeza produtoDeLimpeza) {
						contagemProdutosDeLimpeza++;
					}
				}
				
				atendente.mostrarTotalDeVerduras(contagemProdutosDeLimpeza);
			}
			
			default -> {
				atendente.opcaoInvalida();
			}
		}
	}
}
