package projeto.model;

public class Bebida extends Produto  {
	
private int temperatura;
private int tamanho;
public Bebida(int id, String nome, int quantidade, float preço, int temperatura, int tamanho) {
	super(id, nome, quantidade, preço);
	this.temperatura = temperatura;
	this.tamanho = tamanho;
}
public int getTemperatura() {
	return temperatura;
}
public void setTemperatura(int temperatura) {
	this.temperatura = temperatura;
}
public int getTamanho() {
	return tamanho;
}
public void setTamanho(int tamanho) {
	this.tamanho = tamanho;
}

public void visualizar () {
	String tipo = "";
	String tipo2  = "";
	
	switch (this.temperatura) {
	case 1 -> tipo2 = "Quente";
	case 2 -> tipo2 = "Frio";
	}
	
	switch (this.tamanho) {
	
	case 1 -> tipo = "Pequeno";
	case 2 -> tipo = "Médio";
	case 3 -> tipo = "Grande";
	
	}
		
		super.visualizar();

	System.out.println("            Temperatura 1-Quente ou 2-Frio : " + tipo2);
	System.out.println("            Tamanho 1-Pequeno, 2-Médio ou 3-Grande" + tipo);
		
	
	
}
}