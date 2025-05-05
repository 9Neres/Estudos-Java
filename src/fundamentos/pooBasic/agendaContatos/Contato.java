package fundamentos.pooBasic.agendaContatos;

import java.util.Objects;

public class Contato {

    private String nome;
    private int numeroDeTelefone;

    public Contato(String nome, int numeroDeTelefone) {
        this.nome = nome;
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroDeTelefone() {
        return numeroDeTelefone;
    }

    public void setNumeroDeTelefone(int numeroDeTelefone) {
        this.numeroDeTelefone = numeroDeTelefone;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Contato contato = (Contato) object;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Contato -\t" +
                "nome: '" + nome + '\'' +
                ", Telefone:" + numeroDeTelefone;
    }
}
