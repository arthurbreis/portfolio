import models.Musica;
import models.Podcast;
import models.Preferidas;

public class Main {
    public static void main(String[] args){

        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Songs");
        minhaMusica.setAlbum("numero01");
        minhaMusica.setGenero("Rock");
        minhaMusica.setCantor("Eu");

        for (int i = 0; i < 150; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();            
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("meupodcaster");
        meuPodcast.setDescricao("meu");
        meuPodcast.setApresentador("eu");

        for (int i = 0; i < 2000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 600; i++) {
            meuPodcast.curte();            
        }

        System.out.println("Classificação: " + minhaMusica.getClassificacao());

        System.out.println("Curtidas na musica: " + minhaMusica.getTotalCurtidas());
        System.out.println("play na musica: " + minhaMusica.getTotalReproducoes());

        System.out.println("Curtidas no Podcast: " + meuPodcast.getTotalCurtidas());
        System.out.println("Play no podcast: " + meuPodcast.getTotalReproducoes());

        Preferidas p = new Preferidas();
        p.inclui(meuPodcast);
        p.inclui(minhaMusica);
        
    }
   
}
