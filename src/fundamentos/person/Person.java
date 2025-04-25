package fundamentos.person;

public class Person {

    protected String nome;
    protected int idade;;
    protected String cidade;

    public Person() {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public void setNome(final String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
