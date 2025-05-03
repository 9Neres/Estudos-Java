package fundamentos.pooBasic.conjuntoConvidados;

import java.util.Objects;

public class Convidado {

    private String nome;
    private int codeConvite;

    public Convidado(String nome, int codeConvite) {
        this.nome = nome;
        this.codeConvite = codeConvite;
    }

    public String getNome(){
        return nome;
    }

    public int getCodeConvite(){
        return codeConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodeConvite() == convidado.getCodeConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodeConvite());
    }

    @Override
    public String toString() {
        return "Convidado" +
                "nome='" + nome + '\'' +
                ", codeConvite=" + codeConvite;
    }
}
