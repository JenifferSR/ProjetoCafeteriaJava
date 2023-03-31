package projeto.model;

import java.util.Scanner;

public class Bebida extends Produto {

	private int temperatura;
	private int tamanho;

	
	  public Bebida(int id, String nome, int quantidade, float preço, int
	  temperatura, int tamanho) { super(id, nome, quantidade, preço);
	  this.temperatura = temperatura; this.tamanho = tamanho; }
	 
	  public Bebida() {
		  
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

	public void visualizar() {
		String tipo = "";
		String tipo2 = "";

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
		System.out.println("            Tamanho 1-Pequeno, 2-Médio ou 3-Grande :" + tipo);

	}

	public void editarB() {
		visualizar();

		System.out.println("*******************************************************************");
		System.out.println("              1 - Editar nome:                       ");
		System.out.println("              2 - Editar quantidade:                 ");
		System.out.println("              3 - Editar preço:                      ");
		System.out.println("              4 - Editar tamanho 1-Pequeno, 2-Médio ou 3-Grande :  ");
		System.out.println("              5 - Temperatura 1-Quente ou 2-Frio : ");

		Scanner scan = new Scanner(System.in);

		switch (scan.nextInt()) {
		case 1 -> setNome(scan.next());
		case 2 -> setQuantidade(scan.nextInt());
		case 3 -> setPreco(scan.nextFloat());
		case 4 -> setTamanho(scan.nextInt());
		case 5 -> setTemperatura(scan.nextInt());
		}
	}
}