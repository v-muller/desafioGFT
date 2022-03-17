package questao3;

public class Livro {
	private String titulo;
	private int qtdPaginas;
	private int paginasLidas;
	
	
	public Livro() {}


	public Livro(String titulo, int qtdPaginas, int paginasLidas) {
		this.titulo = titulo;
		this.qtdPaginas = qtdPaginas;
		this.paginasLidas = paginasLidas;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getQtdPaginas() {
		return qtdPaginas;
	}


	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}


	public int getPaginasLidas() {
		return paginasLidas;
	}


	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	
	public double verificaProgresso() {
		double progresso = Math.floor( (getPaginasLidas() * 100.0) / getQtdPaginas());
		return progresso;
	}
	
	public int adicionarPaginasLidas() {
		setPaginasLidas(getPaginasLidas() + 1);
		return getPaginasLidas();
	}


	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", qtdPaginas=" + qtdPaginas + ", paginasLidas=" + paginasLidas + "]";
	}
	
	
}
