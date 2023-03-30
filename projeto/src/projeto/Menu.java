package projeto;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import projeto.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao, tipo;
		while (true) {

			System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
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

			try {// projeto
				opcao = leia.nextInt();
				if (opcao == 0) {
					invalidMessage();
				}
				if (opcao > 2) {
					invalidMessage();
				}
			} catch (InputMismatchException e) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + "*****************************************************");
				System.out.println(Cores.TEXT_WHITE_BOLD + "Opção Inválida: Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			switch (opcao) {// cardapio ou estoque
			case 1 -> {// cardapio
				System.out.println("Cardapio");

			}

			case 2 -> {// estoque
				while (true) {
<<<<<<< HEAD
 					System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
							+ "*****************************************************");
=======
					System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
>>>>>>> 38502a8165b76bdbd59847ee2412f240c0efd312
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

					try {// projeto
						tipo = leia.nextInt();
						if (tipo == 0) {
							invalidMessage();
						}
						if (tipo > 6) {
							invalidMessage();
						}
						
					} catch (InputMismatchException e) {
						System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção Inválida! Digite valores inteiros:\n");
						leia.nextLine();
						tipo = 0;
						
					}

					switch (tipo) {// opções do estoque
					case 1 -> {// Add itens
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                  Adicionar itens:                   ");
						System.out.println("                                                     ");

						keyPress();
					}

					case 2 -> {// listar tudo
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("               Listar todos os itens:                ");
						System.out.println("                                                     ");

						keyPress();
					}
					case 3 -> {// buscar
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Buscar itens:                    ");
						System.out.println("                                                     ");

						keyPress();
					}
					case 4 -> {// editar
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Editar itens:                    ");
						System.out.println("                                                     ");

						keyPress();
					}
					case 5 -> {// remover
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Apagar itens:                    ");
						System.out.println("                                                     ");

						keyPress();
					}
					case 6 -> {// sair
						sobre();
						leia.close();
						System.exit(0);
					}
					

					}
				}
			}
		

			}
		}

	}

	public static void sobre() {// participantes
		System.out.println(Cores.TEXT_WHITE_BOLD + "*****************************************************");
		System.out.println("                   Projeto Java Coffee                  ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("Camille Bueno: https://github.com/CamillePB");

	}

	public static void keyPress() {// parar o menu até apertar enter
		try {
			System.out.println(Cores.TEXT_RESET + "Pressione Enter para continuar...");
			System.in.read();// tecla enter
		} catch (IOException e) {
			System.out.println("Erro de digitação");
		}
	}
	
	public static void invalidMessage() {//mensagem de erro 
		System.out.println(Cores.TEXT_WHITE_BOLD +"\nOpção Inválida! Tente novamente:\n");
	}
}
