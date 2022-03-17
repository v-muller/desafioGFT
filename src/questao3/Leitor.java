package questao3;

import java.util.ArrayList;
import java.util.List;

public class Leitor {
	private String nome;
	private Livro livroFavorito;
	
	private List<Livro> estanteDeLivros = new ArrayList<>();
	
	public Leitor() {}

	public Leitor(String nome, Livro livroFavorito) {
		this.nome = nome;
		this.livroFavorito = livroFavorito;
		estanteDeLivros.add(livroFavorito);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Livro getLivroFavorito() {
		return livroFavorito;
	}

	public void setLivroFavorito(Livro livroFavorito) {
		this.livroFavorito = livroFavorito;
	}

	public List<Livro> getEstanteDeLivros() {
		return estanteDeLivros;
	}
	
	public void adicionarLivro(Livro livro) {
		estanteDeLivros.add(livro);
	}
	
	public void removerLivro(Livro livro) {
		if(estanteDeLivros.contains(livro)) {
			int index = estanteDeLivros.indexOf(livro);
			estanteDeLivros.remove(index);
			livro.setPaginasLidas(0);
		}
	}
}
