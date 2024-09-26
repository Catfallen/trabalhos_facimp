package atividade6_3;

public class Main {
	public static void main(String[] args) {
		Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1216);
        // Exibindo os detalhes do livro
        livro1.reproduzir();
        
        Musica musica = new Musica("Bohemian Rhapsody", "Queen", 354, 1975, "MP3");
        
        // Exibindo os detalhes da música
        musica.reproduzir();
        
        Video video = new Video("Inception", "Christopher Nolan", 8880, 2010, "MP4");

        // Exibindo os detalhes do vídeo
        video.reproduzir();
	}
}
