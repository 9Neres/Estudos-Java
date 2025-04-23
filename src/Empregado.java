public sealed abstract class Empregado permits Gerente, Vendedor{

    protected String nome;
    protected int idade;
    protected double salario;
    protected String identificador;

    public Empregado(

            String nome,
            int idade,
            double salario,
            String identificador) {

        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.identificador = identificador;

    }

    public Empregado() {
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
}
