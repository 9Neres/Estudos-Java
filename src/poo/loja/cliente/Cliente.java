package poo.loja.cliente;

import poo.loja.Produto;

public class Cliente {

    private String nome;
    private double saldo;

    public Cliente(String nome){
        this.nome = nome;
    }

    public void comprar(Produto produto){
        System.out.println(nome + " esta tentando comprar " + produto.getNome());
        produto.vender();
    }
}
