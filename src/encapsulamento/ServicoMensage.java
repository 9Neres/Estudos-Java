package encapsulamento;

public abstract class ServicoMensage {

    public abstract void enviarMensagem(){}

    public abstract void receberMensagem(){}

    private void salvarHistorico(){
        System.out.println("Historico de Mensagem salva");
    }

    private void validarInternet(){
        System.out.println("Conectado a internet");
    }
}
