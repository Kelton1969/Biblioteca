package biblioteca.funcionalidades;

public class LivrosEncontrar {
    private String titulo;
    private String autor;
    private int anoEdicao;

    public LivrosEncontrar(String titulo, String autor, int anoEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoEdicao = anoEdicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }
}
