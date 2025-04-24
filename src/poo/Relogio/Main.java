package poo.Relogio;

public class Main {
    public static void main(String [] args){

        var brlClock = new BRLClock();

            brlClock.setSegundos(0);
            brlClock.setMinutos(10);
            brlClock.setHoras(15);

        var usaClock = new USAClock();

            usaClock.setSegundos(0);
            usaClock.setMinutos(36);
            usaClock.setHoras(23);

        System.out.println("BR TIME:\t" + brlClock.getHoras() + "h:" + brlClock.getMinutos() + "m: " + brlClock.getSegundos() + "s");
        System.out.println("US TIME:\t" + usaClock.getHoras() + "h:" + usaClock.getMinutos() + "m: " + usaClock.getSegundos() + "s\t" + usaClock.getPeriodoIndicado());
    }
}
