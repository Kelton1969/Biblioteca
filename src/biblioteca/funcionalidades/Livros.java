package biblioteca.funcionalidades;

import java.util.ArrayList;
import java.util.List;

public class Livros {
	private List<Livro> listaLivros;

	public Livros() {
		listaLivros = new ArrayList<>();

		listaLivros.add(new Livro("Dom Casmurro", "Machado de Assis", 1899));
		listaLivros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954));

	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}
}

class Livro {
	private String titulo;
	private String autor;
	private int anoEdicao;
	public Livro(String titulo, String autor, int anoEdicao) {
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
