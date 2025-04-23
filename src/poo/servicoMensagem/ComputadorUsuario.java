package poo.servicoMensagem;

public class ComputadorUsuario {
    public static void main(String [] args){

        ServicoMensage smi = null;

        String chatEscolhido = "FaceBook";

        if(chatEscolhido.equals("MSN")){
            smi = new MSNMensage();
        }else if(chatEscolhido.equals("FaceBook")){
            smi =  new FaceBook();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
        }
}
