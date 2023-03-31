package projeto.controller;

import java.util.ArrayList;
import java.util.List;

import projeto.model.Produto;
import projeto.repository.VendaRepository;

public class ProdutoController implements VendaRepository{

	private ArrayList<Produto> Produto = new ArrayList<Produto>();
	int opcao = 0;
	@Override
	public void adicionar(int id) {
		Produto.addAll(Produto);
		System.out.println(": " + Produto.get(id) + " !");
		
	}
	@Override
	public void listar() {
		
		}
	
	@Override
	public void atualizar(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void somaTotal(float preco) {
		
		
	}
	
	
	
}
