package poo.Relogio;

public non-sealed class BRLClock extends Clock{

    @Override
    public Clock convert(final Clock clock){

        this.segundos = clock.getSegundos();
        this.minutos = clock.getMinutos();

        switch(clock){
            case USAClock usaClock ->
                this.horas = (usaClock.getPeriodoIndicado().equals("pm")) ?
                        usaClock.getHoras() + 12 :
                        usaClock.getHoras();


            case BRLClock brlClock ->

                this.minutos = brlClock.getHoras();

        }

        return this;
    }


}
