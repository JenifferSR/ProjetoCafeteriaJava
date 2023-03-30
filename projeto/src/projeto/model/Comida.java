package projeto.model;

import java.util.Scanner;

public class Comida extends Produto {

	Scanner leia = new Scanner(System.in);
	
	private int tamanho;

	/*
	public Comida(int id, String nome, int quantidade, float preço, int tamanho) {
		super(id, nome, quantidade);
		this.tamanho = tamanho;
	}*/
	
	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	@Override
	public void visualizar() {
		String tipo = "";

		switch (this.tamanho) {

		case 1 -> tipo = "Pequeno";
		case 2 -> tipo = "Grande";
		}

		super.visualizar();

		System.out.println("            Escolha o tamanho 1-Pequeno 2-Grande" + tipo);
	}

	// Gerenciar cardápio Comida
	
	public void editar() {
		visualizar();
		
		System.out.println("*****************************************************");
		System.out.println("              1 - Editar nome:                       ");
		System.out.println("              2 - Editar quantidade:                 ");
		System.out.println("              3 - Editar preço:                      ");
		System.out.println("              4 - Editar tamanho:                    ");

		Scanner scan = new Scanner(System.in);
		
		switch(scan.nextInt()) {
			case 1 -> setNome(scan.next());
			case 2 -> setQuantidade(scan.nextInt());
			case 3 -> setPreço(scan.nextFloat());
			case 4 -> setTamanho(scan.nextInt());
		}
	}
}
