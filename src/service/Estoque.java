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
				
				int opcaoCadastrar = atendente.menuCadastrar();
				
				if (opcaoCadastrar == 0) {
					break;
				}
				
				switch (opcaoCadastrar) {
				
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
					
					default -> {
						atendente.opcaoInvalida();
					}
				}
				
			}
	
			case 2 -> {
			
				int opcaoListar = atendente.menuListar();
				
				if (opcaoListar == 0) {
					break;
				}
				
				switch (opcaoListar) {
				
					case 1 -> {
						
						if (listaProdutos.isEmpty()) {
							atendente.mensagemListaVazia();
						}
						
						boolean semFruta = true;
						
						for (Produto produto : listaProdutos) {
							
							if (produto instanceof Fruta fruta) {
								atendente.vizualizarProdutos(fruta);
								semFruta = false;
							}
						}
						
						if (semFruta) {
							atendente.mensagemNenhumaFruta();
						}
					}
					
					case 2 -> {
		
						if (listaProdutos.isEmpty()) {
							atendente.mensagemListaVazia();
						}
						
						boolean semVerdura = true;
						
						for (Produto produto : listaProdutos) {
							
							if (produto instanceof Verdura verdura) {
								atendente.vizualizarProdutos(verdura);
								semVerdura = false;
							}
						}
						
						if (semVerdura) {
							atendente.mensagemNenhumaVerdura();
						}
					}
					
					case 3 -> {
		
						if (listaProdutos.isEmpty()) {
							atendente.mensagemListaVazia();
						}
						
						boolean semProdutoDeLimpeza = true;
						
						for (Produto produto : listaProdutos) {
							
							if (produto instanceof ProdutoDeLimpeza produtoDeLimpeza) {
								atendente.vizualizarProdutos(produtoDeLimpeza);
								semProdutoDeLimpeza = false;
							}
						}
						
						if (semProdutoDeLimpeza) {
							atendente.mensagemNenhumProdutoDeLimpeza();
						}
					}
			
					default -> {
						atendente.opcaoInvalida();	
					}
				}
			}
				
			case 3 -> {
				
				int opcaoPesquisar = atendente.menuPesquisar();
				
				if (opcaoPesquisar == 0) {
					break;
				}
				
				switch (opcaoPesquisar) {
				
					case 1 -> {
						
						int id = atendente.produtoId();
						boolean frutaNaoAchada = true;
						
						for (Produto produto : listaProdutos) {
							
							if (id == produto.getId() && produto instanceof Fruta fruta) {
								atendente.vizualizarProdutos(fruta);
								frutaNaoAchada = false;
							}
						}
						
						if (frutaNaoAchada) {
							atendente.mensagemFrutaNaoEncontrado();
						}
						
					}
					
					case 2 -> {
						
						int id = atendente.produtoId();
						boolean verduraNaoAchada = true;
						
						for (Produto produto : listaProdutos) {
							
							if (id == produto.getId() && produto instanceof Verdura verdura) {
								atendente.vizualizarProdutos(verdura);
								verduraNaoAchada = false;
							}
						}
						
						if (verduraNaoAchada) {
							atendente.mensagemVerduraNaoEncontrado();
						}
						
					}
					
					case 3 -> {
						
						int id = atendente.produtoId();
						boolean produtoDeLimpezaNaoAchado = true;
						
						for (Produto produto : listaProdutos) {
							
							if (id == produto.getId() && produto instanceof ProdutoDeLimpeza produtoDeLimpeza) {
								atendente.vizualizarProdutos(produtoDeLimpeza);
								produtoDeLimpezaNaoAchado = false;
							}
						}
						
						if (produtoDeLimpezaNaoAchado) {
							atendente.mensagemVerduraNaoEncontrado();
						}
						
					}
						
					default -> {
						atendente.opcaoInvalida();
					}
				}
			}
				
			case 4 -> {
				
				int opcaoRemover = atendente.menuRemover();
				
				if (opcaoRemover == 0) {
					break;
				}
				
				switch (opcaoRemover) {
					case 1 -> {
						
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
					
					case 2 -> {
						
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
					
					case 3 -> {
						
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
					
					default -> {
						atendente.opcaoInvalida();
					}
				}
				
			}
			
			case 5 -> {
				
				int opcaoVerTotal = atendente.menuVerTotal();
				
				if (opcaoVerTotal == 0) {
					break;
				}
				
				switch (opcaoVerTotal) {
					case 1 -> {
						
						int contagemFrutas = 0;
						
						for (Produto produto : listaProdutos) {
							
							if (produto instanceof Fruta fruta) {
								contagemFrutas++;
							}
						}
						
						atendente.mostrarTotalDeFrutas(contagemFrutas);
					}
					
					case 2 -> {
						
						int contagemVerduras = 0;
						
						for (Produto produto : listaProdutos) {
							
							if (produto instanceof Verdura verdura) {
								contagemVerduras++;
							}
						}
						
						atendente.mostrarTotalDeVerduras(contagemVerduras);
					}
					
					case 3 -> {
						
						int contagemProdutosDeLimpeza = 0;
						
						for (Produto produto : listaProdutos) {
							
							if (produto instanceof ProdutoDeLimpeza produtoDeLimpeza) {
								contagemProdutosDeLimpeza++;
							}
						}
						
						atendente.mostrarTotalDeProdutosDeLimpeza(contagemProdutosDeLimpeza);
					}
					
					case 4 -> {
						
						int contagemProdutos = 0;
						
						for (Produto produto : listaProdutos) {	
							contagemProdutos++;
						}
						
						atendente.mostrarTotalDeProdutos(contagemProdutos);
						
					}
					
					default -> {
						atendente.opcaoInvalida();
					}
				}
				
			}
			
			default -> {
				atendente.opcaoInvalida();
			}
		}
	}
}