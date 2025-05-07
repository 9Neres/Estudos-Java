package fundamentos.pooBasic.collectionEstudos.map.estoqueProdutos;

import fundamentos.pooBasic.collectionEstudos.cadProdutos.Produtos;

import java.util.HashMap;
import java.util.Map;

public class EstoquePorProdutos {

    private Map<Long, Produto> estoqueProdutomap;

    public EstoquePorProdutos() {
        estoqueProdutomap = new HashMap<>();
    }

    public void adicionarProd(long cod, String nome, int quantidade, double preco){
        estoqueProdutomap.put(cod, new Produto(nome,preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutomap);
    }

    //double para retornar valor total
    public double calcularValorTotalEstoque(){
        //apenas valores
        double valorTotal = 0d;

        if(!estoqueProdutomap.isEmpty()){
            for(Produto p : estoqueProdutomap.values()){
                valorTotal += p.getQuantidade() + p.getPreco();
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro(){

        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!estoqueProdutomap.isEmpty()){
            for(Produto p : estoqueProdutomap.values()){
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){

        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!estoqueProdutomap.isEmpty()){
            for(Produto p : estoqueProdutomap.values()){
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutomap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutomap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoquePorProdutos estoque = new EstoquePorProdutos();

        // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProd(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProd(2L, "Mouse", 5, 25.0);
        estoque.adicionarProd(3L, "Monitor", 10, 400.0);
        estoque.adicionarProd(4L, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
