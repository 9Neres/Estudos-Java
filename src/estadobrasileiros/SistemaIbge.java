package estadobrasileiros;

public class SistemaIbge {
    public static void main(String[] args) {
        
        for(estadoBrasileiro e: estadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome() + "  " + e.getNum_estado());
        }

        estadoBrasileiro eb = estadoBrasileiro.SAO_PAULO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNum_estado());
    }
}
