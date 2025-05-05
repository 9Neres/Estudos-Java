package fundamentos.pooBasic.InterfaceEstudos.estInterface;

public class SmartPhone implements VideoPlayer, MusicPlayer{


    @Override
    public void playVideo() {
        System.out.println("Transmitindo Video");
    }

    @Override
    public void pauseVideo() {

        System.out.println("Video Pausado");
    }

    @Override
    public void stopVideo() {

        System.out.println("Saindo do Video");
    }

    @Override
    public void playMusic() {

        System.out.println("Tocando");
    }

    @Override
    public void pauseMusic() {

        System.out.println("Musica Pausada");
    }

    @Override
    public void stopMusic() {

        System.out.println("Saindo Musica");
    }
}
