package biblioteca.funcionalidades;

import java.util.ArrayList;
import java.util.List;
import biblioteca.funcionalidades.LivrosEncontrar;

public class Livros  {
    private List<LivrosEncontrar> listaLivros;

    public Livros() {
        listaLivros = new ArrayList<>();
        
        listaLivros.add(new LivrosEncontrar("Dom Casmurro", "Machado de Assis", 1899));
        listaLivros.add(new LivrosEncontrar("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));
    }

    public List<LivrosEncontrar> getListaLivros() {
        return listaLivros;
    }

    public LivrosEncontrar pesquisarLivroPorTitulo(String titulo) {
        for (LivrosEncontrar livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; //
    }
}
