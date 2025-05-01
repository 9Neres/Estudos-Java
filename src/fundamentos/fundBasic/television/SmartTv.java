package fundamentos.fundBasic.television;

public class SmartTv {

    boolean ligada = false;

    int volume = 10;
    int canal = 1;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
        }
    }
}
