package biblioteca.funcionalidades;

public interface OperacoesBiblioteca {
    void doarLivro(String titulo, String autor, int anoEdicao);
    BibliotecaInfo pesquisarBibliotecaProxima(double latitude, double longitude);
}
