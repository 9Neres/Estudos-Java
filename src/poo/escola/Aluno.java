package poo.escola;

public class Aluno {
    private String nome;
    private int idade;
    private String sexo;

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String newNome){
        nome = newNome; // o new sera do nome nome ou atributo que ira ser definido
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }
}
