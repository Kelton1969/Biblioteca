package biblioteca.funcionalidades;

//import biblioteca.Conta;  
import java.util.Scanner;

public class Funcionalidades {

    public static void criarConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== Criar Conta ====");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu e-mail: ");
        String email = scanner.nextLine();

        for (int i = 0; i < numContas; i++) {
            if (contas[i].getEmail().equals(email)) {
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

        Conta novaConta = new Conta(proximoNumeroConta++, nome, email, senha);
        contas[numContas++] = novaConta;

        System.out.println("Conta criada com sucesso!");
    }

    private static boolean verificarFormatoSenha(String senha) {
        return senha.length() >= 6;
    }
}
