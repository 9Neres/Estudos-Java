package fundamentos.fundBasic.television;

public class Usuario {

        public static void main(String[] args) throws Exception {

            SmartTv smartTv = new SmartTv();

            smartTv.ligar();
            System.out.println("TV ligada? " + smartTv.ligada);

            smartTv.aumentarVolume();
            smartTv.aumentarVolume();
            System.out.println("Volume após aumentar duas vezes: " + smartTv.volume);

            smartTv.diminuirVolume();
            System.out.println("Volume após diminuir uma vez: " + smartTv.volume);

            smartTv.mudarCanal(5);
            System.out.println("Canal atual: " + smartTv.canal);

            smartTv.diminuirCanal();
            System.out.println("Canal após diminuir uma vez: " + smartTv.canal);

            smartTv.desligar();
            System.out.println("TV ligada? " + smartTv.ligada);
        }
}
