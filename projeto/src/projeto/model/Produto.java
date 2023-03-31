package projeto.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
	
	private int id;
	private String nome;
	private int quantidade;
	private float preco;

	
	private ArrayList<Comida> comidas = new ArrayList<Comida>();
	private ArrayList<Bebida> bebidas = new ArrayList<Bebida>();


	/*
	public Produto(int id, String nome, int quantidade, float preço) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preço = preço;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		System.out.println("            ID do produto : " + this.id);
		System.out.println("            Nome do produto escolido : " + this.nome);
		System.out.println("            Quantidade de produtos escolhidos : " + this.quantidade);
		System.out.println("            Total do pedido : " + this.preco);

	}
	
	public void editarC() {
		visualizar();
		
		System.out.println("*****************************************************");
		System.out.println("              1 - Editar nome:                       ");
		System.out.println("              2 - Editar quantidade:                 ");
		System.out.println("              3 - Editar preço:                      ");
		
		Scanner scan = new Scanner(System.in);
		
		switch(scan.nextInt()) {
			case 1 -> setNome(scan.next());
			case 2 -> setQuantidade(scan.nextInt());
			case 3 -> setPreco(scan.nextFloat());
		}
	}

}