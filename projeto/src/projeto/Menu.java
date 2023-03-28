package projeto;

import java.util.Scanner;
import projeto.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int opcao, tipo;
		while (true) {

			System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     Java Coffee                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    1 - Cardápio                     ");
			System.out.println("                    2 - Estoque                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			switch (opcao) {// cardapio ou estoque
			case 1 -> {// cardapio
				System.out.println("Cardapio");

			}

			case 2 -> {// estoque
				while (true) {
					System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
							+ "*****************************************************");
					System.out.println("                                                     ");
					System.out.println("                 Java Coffee Estoque                 ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1 - Adicionar itens                      ");
					System.out.println("            2 - Listar todos os itens                ");
					System.out.println("            3 - Buscar itens                         ");
					System.out.println("            4 - Editar itens                         ");
					System.out.println("            5 - Apagar itens                         ");
					System.out.println("            6 - Sair                                 ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("Entre com a opção desejada:                          ");
					System.out.println("                                                     " + Cores.TEXT_RESET);
					tipo = leia.nextInt();

					switch (tipo) {// opções do estoque
					case 1 -> {// Add itens
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
								+ "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                  Adicionar itens:                   ");
						System.out.println("                                                     ");

					}

					case 2 -> {// listar tudo
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
								+ "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("               Listar todos os itens:                ");
						System.out.println("                                                     ");

					}
					case 3 -> {// buscar
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
								+ "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Buscar itens:                    ");
						System.out.println("                                                     ");

					}
					case 4 -> {// editar
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
								+ "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Editar itens:                    ");
						System.out.println("                                                     ");

					}
					case 5 -> {// remover
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
								+ "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Apagar itens:                    ");
						System.out.println("                                                     ");

					}
					case 6 -> {// sair

					}
					default -> {
						System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
								+ "*****************************************************");
						System.out.println("                  Opção Inválida!                    ");
					}
					}
				}
			}
			default -> {
				System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
						+ "*****************************************************");
				System.out.println("             Opção Inválida!                ");
			}
			}
		}

	}

	public static void sobre() {// participantes
		System.out.println("Cafeteria");
		System.out.println("Camille Bueno: https://github.com/CamillePB");
		System.out.println("Teste");
	
	}
	

}
