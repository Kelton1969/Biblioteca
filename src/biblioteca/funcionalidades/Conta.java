package biblioteca.funcionalidades;

public class Conta {
    private static int proximoNumeroConta = 1;
    public static int numContas = 0;
    public static Conta[] contas = new Conta[100];

    private int numero;
    private String nome;
    private String email;
    private String senha;

    public Conta(String nome, String email, String senha) {
        this.numero = proximoNumeroConta++;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }


    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
