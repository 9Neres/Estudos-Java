package poo.Relogio;

public abstract sealed class Clock permits BRLClock, USAClock{

    protected int horas;
    protected int minutos;
    protected int segundos;


    public void setHoras( final int horas){
        if(horas > 24){
            this.horas = 24;
            return;
        }
        this.horas = horas;
    }

    public int getHoras(){
        return horas;
    }

    public void setMinutos( int minutos){
        if(minutos > 60){
            this.minutos = 60;
            return;
        }
        this.minutos = minutos;
    }

    public int getMinutos(){
        return minutos;
    }

    public void setSegundos(int segundos){
        if(segundos > 60){
            this.segundos = 60;
            return;
        }
        this.segundos = segundos;
    }

    public int getSegundos(){
        return segundos;
    }

    public Clock convert(Clock clock){
        this.segundos = clock.getSegundos();
        this.minutos = clock.getMinutos();
        this.horas = clock.getHoras();
        return this;
    }


}
