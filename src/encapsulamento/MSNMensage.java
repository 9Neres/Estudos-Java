package encapsulamento;

public class MSNMensage extends ServicoMensage{ //extends pra herança

    public void enviarMensagem(){
        System.out.println("MSN enviou sua mensagem");
    }

    public void receberMensagem(){
        System.out.println("MSN recebeu uma mensagem");
    }
}
