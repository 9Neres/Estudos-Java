package poo.Relogio;

public non-sealed class USAClock extends Clock{

    private String periodoIndicado;

    public String getPeriodoIndicado() {
        return periodoIndicado;
    }

    public void setDepoisMeioDia(){
        this.periodoIndicado = "pm";
    }

    public void setAntesMeioDia(){
        this.periodoIndicado = "am";
    }

    public void setHoras(int horas){

        setAntesMeioDia();

        if((horas >= 12) && (horas <= 23)){

            setDepoisMeioDia();
            this.horas = horas == 12 ? 12 : horas - 12;

        }else if(horas == 0 || horas == 24){
            setAntesMeioDia();
            this.horas = 0;

        }else {
            setAntesMeioDia();
            this.horas = horas;
        }
    }

    @Override
    public Clock convert(final Clock clock) {
        this.segundos = clock.getSegundos();
        this.minutos = clock.getMinutos();
        switch(clock){
            case USAClock usaClock ->{
                this.horas = usaClock.getHoras();
                this.periodoIndicado = usaClock.getPeriodoIndicado();
            }

            case BRLClock brlClock ->{
                this.setHoras(brlClock.getHoras());
            }


        }
        return this;
    }
}
