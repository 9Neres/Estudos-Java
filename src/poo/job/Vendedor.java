package poo.job;

public non-sealed class Vendedor extends Empregado {

    private double comissao;
    private int clientesAtendidos;


    public Vendedor(String nome, int idade, double salario, String identificador) {
        super(nome, idade, salario, identificador);
    }


    public Vendedor() {
    }

    public void setComissao(final Double comissao){
        this.comissao = comissao;
    }

    public double getComissao(){
        return comissao;
    }

    public int getClientesAtendidos() {
        return clientesAtendidos;
    }

    public void setClientesAtendidos(int clientesAtendidos) {
        this.clientesAtendidos = clientesAtendidos;
    }
}
