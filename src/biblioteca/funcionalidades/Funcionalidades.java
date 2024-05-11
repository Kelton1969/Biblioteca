package biblioteca.funcionalidades;

import biblioteca.funcionalidades.Biblioteca;
import biblioteca.funcionalidades.BibliotecaInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Funcionalidades {

    public static void criarConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Criar Conta ====");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        for (int i = 0; i < Conta.numContas; i++) {
            if (Conta.contas[i].getEmail().equals(email)) {
                System.out.println("Este e-mail já está em uso.");
                return;
            }
        }

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        if (!verificarFormatoSenha(senha)) {
            System.out.println("A senha deve ter pelo menos 6 caracteres.");
            return;
        }

        Conta novaConta = new Conta(nome, email, senha);
        Conta.contas[Conta.numContas++] = novaConta;

        System.out.println("Conta criada com sucesso!");
    }

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Login ====");
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        for (int i = 0; i < Conta.numContas; i++) {
            if (Conta.contas[i].getEmail().equals(email) && Conta.contas[i].getSenha().equals(senha)) {
                System.out.println("Login realizado com sucesso!");
                return;
            }
        }

        System.out.println("E-mail ou senha incorretos.");
    }

    public static void deletarConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Deletar Conta ====");
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        for (int i = 0; i < Conta.numContas; i++) {
            if (Conta.contas[i].getEmail().equals(email)) {

                System.out.println("Conta deletada com sucesso!");
                return;
            }
        }

        System.out.println("Conta não encontrada.");
    }

    public static void apagarConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Apagar Conta ====");
        System.out.println("Digite o e-mail da conta que deseja apagar: ");
        String email = scanner.nextLine();

        for (int i = 0; i < Conta.numContas; i++) {
            if (Conta.contas[i].getEmail().equals(email)) {
                // Remove a conta da lista
                for (int j = i; j < Conta.numContas - 1; j++) {
                    Conta.contas[j] = Conta.contas[j + 1];
                }
                Conta.numContas--;
                System.out.println("Conta apagada com sucesso!");
                return;
            }
        }

        System.out.println("Conta com o e-mail '" + email + "' não encontrada.");
    }

    public static void atualizarDadosConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Atualizar Dados da Conta ====");
        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        for (int i = 0; i < Conta.numContas; i++) {
            if (Conta.contas[i].getEmail().equals(email)) {
                System.out.println("Digite o novo nome: ");
                String novoNome = scanner.nextLine();
                System.out.println("Digite a nova senha: ");
                String novaSenha = scanner.nextLine();

                // Atualiza os dados da conta
                Conta.contas[i].setNome(novoNome);
                Conta.contas[i].setSenha(novaSenha);

                System.out.println("Dados da conta atualizados com sucesso!");
                return;
            }
        }
        System.out.println("Conta com o e-mail '" + email + "' não encontrada.");
    }

    public static void exibirLivrosDisponiveis() {
        List<String> livrosDisponiveis = new ArrayList<>();

        // Adicione os livros disponíveis aqui
        livrosDisponiveis.add("Dom Casmurro");
        livrosDisponiveis.add("O Senhor dos Anéis");
        livrosDisponiveis.add("Harry Potter e a Pedra Filosofal");
        livrosDisponiveis.add("1984");
        livrosDisponiveis.add("Cem Anos de Solidão");

        System.out.println("=== Livros Disponíveis ===");
        for (String livro : livrosDisponiveis) {
            System.out.println(livro);
        }
    }

    private static boolean verificarFormatoSenha(String senha) {
        return senha.length() >= 6;
    }

    public static void localizarBiblioteca() {
        // Simulando a obtenção das coordenadas geográficas do usuário (São Paulo, Brasil)
        double latitudeUsuario = -23.5505;
        double longitudeUsuario = -46.6333;

        Biblioteca biblioteca = new Biblioteca();
        BibliotecaInfo bibliotecaProxima = biblioteca.pesquisarBibliotecaProxima(latitudeUsuario, longitudeUsuario);

        if (bibliotecaProxima != null) {
            System.out.println("Biblioteca mais próxima:");
            System.out.println("Nome: " + bibliotecaProxima.getNome());
            System.out.println("Endereço: " + bibliotecaProxima.getEndereco());
            System.out.println("E-mail: " + bibliotecaProxima.getEmail());
            System.out.println("Telefone: " + bibliotecaProxima.getTelefone());
        } else {
            System.out.println("Não foi possível encontrar uma biblioteca próxima.");
        }
    }
}
