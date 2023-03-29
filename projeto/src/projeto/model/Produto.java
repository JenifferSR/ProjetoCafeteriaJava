package projeto.model;

public abstract class Produto {
private int id;
private String nome;
private int quantidade;
private float preço;

public Produto(int id, String nome, int quantidade, float preço) {
	this.id = id;
	this.nome = nome;
	this.quantidade = quantidade;
	this.preço = preço;
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

public float getPreço() {
	return preço;
}

public void setPreço(float preço) {
	this.preço = preço;
}
public void visualizar() {
	
	System.out.println("            ID do produto : " + this.id);
	System.out.println("            Nome do produto escolido : " + this.nome);
	System.out.println("            Quantidade de produtos escolhidos : " + this.quantidade);
	System.out.println("            Total do pedido : " + this.preço);
	
}

}
