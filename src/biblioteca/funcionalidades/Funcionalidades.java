package biblioteca.funcionalidades;

import biblioteca.funcionalidades.Conta;  
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

    private static boolean verificarFormatoSenha(String senha) {
        return senha.length() >= 6;
    }
}
