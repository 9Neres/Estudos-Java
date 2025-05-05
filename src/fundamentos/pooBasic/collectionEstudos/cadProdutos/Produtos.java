package fundamentos.pooBasic.collectionEstudos.cadProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{

    private String nome;
    private long code;
    private double preco;
    private int quantidade;

    public Produtos(String nome, long code, double preco, int quantidade) {
        this.nome = nome;
        this.code = code;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produtos(long code, String nome, double preco, int quantidade) {
        this.nome = nome;
        this.code = code;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public long getCode() {
        return code;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override  // comparação por codigo
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Produtos produtos = (Produtos) object;
        return code == produtos.code;
    }

    @Override
    public int compareTo(Produtos p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(code);
    }

    @Override
    public String toString() {
        return "Produtos{" +
                "nome='" + nome + '\'' +
                ", code=" + code +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class CompararPorPreco implements Comparator<Produtos>{

    @Override
    public int compare(Produtos p1, Produtos p2){
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}