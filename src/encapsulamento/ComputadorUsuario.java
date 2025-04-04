package encapsulamento;

public class ComputadorUsuario {
    public static void main(String [] args){

        MSNMensage msn = new MSNMensage();

        msn.enviarMensagem();
        msn.receberMensagem();

        FaceBook fb = new FaceBook();
        
        fb.enviarMensagem();
        fb.receberMensagem();

    }
}