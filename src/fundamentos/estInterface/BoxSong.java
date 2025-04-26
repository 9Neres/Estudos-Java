package fundamentos.estInterface;

public class BoxSong extends SmartPhone{

    @Override
    public void playMusic() {

        System.out.println("Tocando - CaixaMusica");
    }

    @Override
    public void pauseMusic() {

        System.out.println("Musica Pausada  - CaixaMusica");
    }

    @Override
    public void stopMusic() {

        System.out.println("Saindo Musica   - CaixaMusica");
    }
}
