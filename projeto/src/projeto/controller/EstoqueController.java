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

	//@Override
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
		// Percorrendo comidas procurando o id
		for (var item : lstComidas) {
			if (item.getId() == id) {
				item.visualizar();
				break;
			}
		}
	}

	@Override
	public void buscarBebida(int id) {
		// Percorrendo bebidas procurando o id
		for (var item : lstBebidas) {
			if (item.getId() == id) {
				item.visualizar();
				break;
			}
		}
	}

	@Override
	public Produto editarComida(int id) {
		// Percorrendo comidas procurando o id para editar
		for (Produto item : lstComidas) {
			if (item.getId() == id) {
				item.editarC();
				return item;
			}
		}
		return null;
	}

	@Override
	public void editarBebida(String produto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletarComida(int id) {
		// Percorrendo comidas procurando o id para deletar
		for (var item : lstComidas) {
			if (item.getId() == id) {
				getLstComidas().remove(item);
				return;
			}
		}
	}

	@Override
	public void deletarBebida(int id) {
		// TODO Auto-generated method stub

	}

	//Métodos auxiliares
	
	}
