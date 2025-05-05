package fundamentos.pooBasic.collectionEstudos.conjuntoConvidados;

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
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Convidado convidado = (Convidado) object;
        return codeConvite == convidado.codeConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codeConvite);
    }

    @Override
    public String toString() {
        return "Convidado" +
                "nome='" + nome + '\'' +
                ", codeConvite=" + codeConvite;
    }
}
