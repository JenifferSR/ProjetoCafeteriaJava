package projeto.model;

public abstract class Produto {
private int id;
private String nome;
private int quantidade;

public Produto(int id, String nome, int quantidade) {
	this.id = id;
	this.nome = nome;
	this.quantidade = quantidade;
}


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


public void visualizar() {
	
	System.out.println("            ID do produto : " + this.id);
	System.out.println("            Nome do produto escolido : " + this.nome);
	System.out.println("            Quantidade de produtos escolhidos : " + this.quantidade);
	
}

import java.util.ArrayList;

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

	public void setPreço(float preco) {
		this.preco = preco;
	}

	public ArrayList<Comida> getComidas() {
		return comidas;
	}

	public void setComidas(ArrayList<Comida> comidas) {
		this.comidas = comidas;
	}
	
	public ArrayList<Bebida> getBebidas() {
		return bebidas;
	}

	public void setBebidas(ArrayList<Bebida> bebidas) {
		this.bebidas = bebidas;
	}

	public void listarTodos() {
		
		if(comidas.size() > 0) {
			System.out.println("-------------------- Comidas --------------------");
			for (var item : comidas)
				item.visualizar();
				System.out.println("\n");
				
			System.out.println("-------------------------------------------------\n");	
		}
		
		if(comidas.size() > 0) {
			System.out.println("-------------------- Bebidas --------------------");
			for (var item : bebidas)
				item.visualizar();
				System.out.println("\n");
				
			System.out.println("-------------------------------------------------");	
		}
	}
	
	public void buscarVisualizar(int id) {
		
		// Percorrendo comidas procurando o id
		for (var item : comidas) {
			if (item.getId() == id) {
				item.visualizar();
				break;
			}
		}
		
		// Percorrendo bebidas procurando o id
		for (var item : bebidas) {
			if (item.getId() == id) {
				item.visualizar();
				break;	
			}
		}		
	}
	
	public Comida buscarComidaEditar(int id) {
		
		// Percorrendo comidas procurando o id para editar
		for (var item : comidas) {
			if (item.getId() == id) {
				item.editar();				
				return item;
			}
		}		
		return null;
	}
	
	public void buscarBebidaEditar(int id) {
		
		// Percorrendo bebidas procurando o id para editar
		for (var item : bebidas) {
			if (item.getId() == id) {
				//item.editar();
				break;	
			}
		}
	}
	
	public void deletarComida(int id) {
		
		// Percorrendo comidas procurando o id para deletar
		for (var item : comidas) {
			if (item.getId() == id) {
				getComidas().remove(item);
				return;
			}
		}	
	}

	public void visualizar() {

		System.out.println("            ID do produto : " + this.id);
		System.out.println("            Nome do produto escolido : " + this.nome);
		System.out.println("            Quantidade de produtos escolhidos : " + this.quantidade);
		System.out.println("            Total do pedido : " + this.preco);

	}
}