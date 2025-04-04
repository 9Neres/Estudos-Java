package encapsulamento;

import encapsulamento.aplicativos.FaceBook;
import encapsulamento.aplicativos.MSNMensage;
import encapsulamento.aplicativos.Telegram;

public class ComputadorUsuario {
    public static void main(String [] args){

        var msn = new MSNMensage();

        msn.enviarMensagem();
        msn.receberMensagem();

        var fb = new FaceBook();
        
        fb.enviarMensagem();
        fb.receberMensagem();

        var tl = new Telegram();

        tl.enviarMensagem();
        tl.receberMensagem();
    }
}