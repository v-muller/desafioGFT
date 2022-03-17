package questao3;

public class Main {
	public static void main(String[] args) {
		Livro l1 = new Livro("Pinóquio", 350, 0);
		Leitor leitor = new Leitor("Castanhola", l1);
		
		System.out.println("Lendo 5 páginas...");
		leitor.getLivroFavorito().adicionarPaginasLidas();
		leitor.getLivroFavorito().adicionarPaginasLidas();
		leitor.getLivroFavorito().adicionarPaginasLidas();
		leitor.getLivroFavorito().adicionarPaginasLidas();
		leitor.getLivroFavorito().adicionarPaginasLidas();
		System.out.println(leitor.getLivroFavorito().getPaginasLidas());
		System.out.printf("Progreso de leitura: %.0f%%\n",leitor.getLivroFavorito().verificaProgresso());
		
		System.out.println("Adicionando livro do Machado de Assis");
		Livro novoLivro = new Livro("Dom Casmurro", 380, 4);
		leitor.adicionarLivro(novoLivro);
		
		for (Livro l : leitor.getEstanteDeLivros()){
			System.out.println(l);
		}
		System.out.println("Removendo livro Dom Casmurro...");
		leitor.removerLivro(novoLivro);
		for (Livro l : leitor.getEstanteDeLivros()){
			System.out.println(l);
		}
	}
}
