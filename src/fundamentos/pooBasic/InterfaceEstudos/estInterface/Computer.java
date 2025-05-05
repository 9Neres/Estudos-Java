package fundamentos.pooBasic.InterfaceEstudos.estInterface;

public class Computer extends SmartPhone{

    @Override
    public void playVideo() {
        System.out.println("Transmitindo Video - Computador");
    }

    @Override
    public void pauseVideo() {

        System.out.println("Video Pausado - Computador");
    }

    @Override
    public void stopVideo() {

        System.out.println("Saindo do Video - Computador");
    }

    @Override
    public void playMusic() {

        System.out.println("Tocando - Computador");
    }

    @Override
    public void pauseMusic() {

        System.out.println("Musica Pausada  - Computador");
    }

    @Override
    public void stopMusic() {

        System.out.println("Saindo Musica   - Computador");
    }
}
