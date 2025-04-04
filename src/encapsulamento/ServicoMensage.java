package encapsulamento;

public class ServicoMensage {

    public void enviarMensagem(){
        validarInternet();
        
        System.out.println("Mensagem enviada");

        salvarHistorico();

    }

    public void receberMensagem(){
        System.out.println("Você recebeu uma mensagem - (Telegram)\n");
    }

    private void salvarHistorico(){
        System.out.println("Historico de Mensagem salva");
    }

    private void validarInternet(){
        System.out.println("Conectado a internet");
    }
}
