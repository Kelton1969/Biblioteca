package biblioteca;

import biblioteca.funcionalidades.Funcionalidades;

import biblioteca.funcionalidades.Livros;
import biblioteca.funcionalidades.LivrosEncontrar;

import java.util.InputMismatchException;
import java.util.Scanner;
import biblioteca.util.Cores;

public class Menu {

    public static void main(String[] args) {
        int opcao;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Cores.TEXT_RED + Cores.ANSI_WHITE_BACKGROUND);
        System.out.println("*****************************************************");
        System.out.println("                                                     ");
        System.out.println("                Reserve seus livros                  ");
        System.out.println("                                                     ");
        System.out.println("=====================================================");
        System.out.println("                                                     ");
        System.out.println("            1 - Criar Conta                          ");
        System.out.println("            2 - Login                                ");
        System.out.println("            3 - Digite um título                     ");
        System.out.println("            4 - Atualizar Dados da Conta             ");
        System.out.println("            5 - Apagar Conta                         ");
        System.out.println("            6 - Localizar biblioteca                 ");
        System.out.println("            7 - Loja                                 ");
        System.out.println("            8 - Doe um livro                         ");
        System.out.println("            9 - Sair                                 ");
        System.out.println("                                                     ");
        System.out.println("=====================================================");
        System.out.println("Entre com a opção desejada:                          ");
        System.out.println("                                                     ");

        try {
            opcao = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\nDigite valores inteiros!");
            scanner.nextLine();
            opcao = 0;
        }
        switch (opcao) {
            case 1:
                Funcionalidades.criarConta();
                break;
            case 2:
                Funcionalidades.login();
                break;
            case 3:
                scanner.nextLine(); // Limpeza do buffer
                System.out.println("\nDigite o Título:");
                String titulo = scanner.nextLine();
                Livros livros = new Livros(); // Crie um objeto Livros
                LivrosEncontrar livroEncontrado = livros.pesquisarLivroPorTitulo(titulo); // Chame o método pesquisarLivroPorTitulo
                if (livroEncontrado != null) {
                    System.out.println("Livro encontrado:");
                    System.out.println("Título: " + livroEncontrado.getTitulo());
                    // Adicione outras informações do livro conforme necessário
                } else {
                    System.out.println("Livro com título '" + titulo + "' não encontrado.");
                }
                break;
            case 5:
          
                Funcionalidades.apagarConta(); // Chama o método para apagar a conta
            

                break;
            case 9:
                // Implemente a lógica para sair aqui
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
