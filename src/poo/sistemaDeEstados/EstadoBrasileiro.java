package poo.sistemaDeEstados;

public enum EstadoBrasileiro {

    SAO_PAULO("SP", "São Paulo", 10),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 11);

    String nome;
    String sigla;
    int num_estado;

    private EstadoBrasileiro(String nome, String sigla, int num_estado) {
        this.nome = nome;
        this.sigla = sigla;
        this.num_estado = num_estado;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getNum_estado() {
        return num_estado;
    }

    public String getletrasMaiusculas() {
        return nome.toUpperCase();
    }
}