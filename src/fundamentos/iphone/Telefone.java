package fundamentos.iphone;

public class Telefone implements Navegador, MusicPlayer, Ligacao{

    private boolean estaConectado = false;

    // Musica

    @Override
    public void tocarMusica() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parar Musica");
    }

    // Navegador

    @Override
    public void conectar() {
        estaConectado = true;
            System.out.println("Esta conectado");
    }

    @Override
    public void desconectar() {
        estaConectado = false;
        System.out.println("Esta Desconectado");
    }

    // Chamada

    @Override
    public void chamando(){
        System.out.println("Chamando");
    }

    @Override
    public void ligacaoAtendida() {
        System.out.println("Ligação aceita");
    }

    @Override
    public void recusado() {
        System.out.println("Chamada Recusada");
    }

    // Recebendo chamada

    @Override
    public void recebendoChamada() {
        System.out.println("Recebendo Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atender ligação");
    }

    @Override
    public void recusar() {
        System.out.println("Ligação recusada");
    }

}