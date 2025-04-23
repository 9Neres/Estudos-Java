package poo.servicoMensagem;

public abstract class ServicoMensage {
    public abstract void enviarMensagem(); // abstrato

    public abstract void receberMensagem();

    protected void salvarHistorico(){
        System.out.println("Historico de Mensagem salva");
    }

    protected void validarInternet(){
        System.out.println("Conectado a internet");
    }
}
