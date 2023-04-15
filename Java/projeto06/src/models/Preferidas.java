package models;

public class Preferidas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() > 8){
            System.out.println(audio.getTitulo() + " : Preferidas");

        }else{
            System.out.println(audio.getTitulo()+ " : Ouvir depois");
        }
    }
    
}
