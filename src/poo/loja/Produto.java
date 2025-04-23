package poo.loja;

import poo.loja.cliente.Cliente;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void vender(){

        if(quantidade > 0){
            quantidade--;
            System.out.println("Produto vendido com sucesso!");
        }else{
            System.out.println("Produto fora de estoque");
        }
    }

    public void mostrarDetalhes(){
        System.out.println("Produto: " + nome + "| preço: " + preco + " | Estoque: " + quantidade);
    }
}
