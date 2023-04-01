package projeto.controller;

import java.util.ArrayList;
import java.util.Scanner;
import projeto.model.Bebida;
import projeto.model.Produto;
import projeto.repository.EstoqueRepository;

public class EstoqueController implements EstoqueRepository {

	Scanner leia = new Scanner(System.in);

	Produto produtos = new Produto();

	private ArrayList<Bebida> lstBebidas = new ArrayList<Bebida>();
	private ArrayList<Produto> lstComidas = new ArrayList<Produto>();
	ArrayList<Produto> carrinho = new ArrayList<Produto>();

	public ArrayList<Bebida> getLstBebidas() {
		return lstBebidas;
	}

	public void setLstBebidas(ArrayList<Bebida> lstBebidas) {
		this.lstBebidas = lstBebidas;
	}

	public ArrayList<Produto> getLstComidas() {
		return lstComidas;
	}

	public void setLstComidas(ArrayList<Produto> lstComidas) {
		this.lstComidas = lstComidas;
	}
	
	public ArrayList<Produto> getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(ArrayList<Produto> carrinho) {
		this.carrinho = carrinho;
	}

	// @Override
	public void listarTodos() {
		if (lstComidas.size() > 0) {
			System.out.println("-------------------- Comidas --------------------");
			for (var item : lstComidas)
				item.visualizar();
			System.out.println("\n");

			System.out.println("-------------------------------------------------\n");
		}

		if (lstBebidas.size() > 0) {
			System.out.println("-------------------- Bebidas --------------------");
			for (var item : lstBebidas)
				item.visualizar();
			System.out.println("\n");

			System.out.println("-------------------------------------------------");
		}
	}

	@Override
	public void buscarComida(int id) {
		for (var item : lstComidas) {
			if (item.getId() == id) {
				item.visualizar();
				break;
			}
		}
	}

	@Override
	public void buscarBebida(int id) {
		for (var item : lstBebidas) {
			if (item.getId() == id) {
				item.visualizar();
				break;
			}
		}
	}

	@Override
	public Produto editarComida(int id) {
		for (Produto item : lstComidas) {
			if (item.getId() == id) {
				item.editarC();
				return item;
			}
		}
		return null;
	}

	@Override
	public Bebida editarBebida(int id) {
		for (Bebida item : lstBebidas) {
			if (item.getId() == id) {
				item.editarB();
				return item;
			}
		}
		
		return null;

	}

	@Override
	public void deletarComida(int id) {
		for (var item : lstComidas) {
			if (item.getId() == id) {
				getLstComidas().remove(item);
				return;
			}
		}
	}

	@Override
	public void deletarBebida(int id) {
		for (var item : lstBebidas) {
			if (item.getId() == id ) {
				getLstBebidas().remove(item);
				return;
			}
		}

	}

	// Métodos auxiliares
	
	@Override
	public float somarCarrinho() {
		float total = 0;
		float soma;
			for (var item : carrinho) {
				soma = item.getPreco();
				  total += soma;
			
			}
			
			return total;
	}

}
