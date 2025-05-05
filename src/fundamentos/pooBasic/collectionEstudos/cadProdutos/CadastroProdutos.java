package fundamentos.pooBasic.collectionEstudos.cadProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CadastroProdutos {

    private Set<Produtos> cadProtutosSet;

    public CadastroProdutos() {
        this.cadProtutosSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long code, double preco, int quantidade){
        cadProtutosSet.add(new Produtos(nome, code, preco, quantidade));
    }

    public void adicionarProduto(long code, String nome, double preco, int quantidade){
        cadProtutosSet.add(new Produtos(code, nome, preco, quantidade));
    }

    public Set<Produtos> exibirProdutosPorNome(String nome){

        if(cadProtutosSet.isEmpty()){
            throw new RuntimeException("Não há produtos cadastrados");
        }

        Set<Produtos> produtosFiltrados = cadProtutosSet.stream()
                .filter(p -> p.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toCollection(() -> new TreeSet<>()));

        if(produtosFiltrados.isEmpty()) {
            throw new RuntimeException("Nenhum produto encontrado com o nome: " + nome);
        }
        return produtosFiltrados;
    }

    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> mostrarProdPorPreco = new TreeSet<>(new CompararPorPreco());

        if(!cadProtutosSet.isEmpty()){
            // Adicionando os itens ao conjunto ordenado por preço
            mostrarProdPorPreco.addAll(cadProtutosSet);
            return mostrarProdPorPreco;
        } else {
            throw new RuntimeException("Não há produtos cadastrados");
        }
    }

    // Método adicional para exibir todos os produtos
    public Set<Produtos> exibirTodosProdutos() {
        if(cadProtutosSet.isEmpty()) {
            throw new RuntimeException("Não há produtos cadastrados");
        }
        return new HashSet<>(cadProtutosSet);
    }

    public static void main(String[] args){
        // Criando uma instância do CadastroProdutos
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);  // Note que este produto tem o mesmo código (1L) do Smartphone
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println("Todos os produtos:");
        System.out.println(cadastroProdutos.exibirTodosProdutos());

        // Exibindo produtos contendo "Teclado" no nome
        System.out.println("\nProdutos com 'Teclado' no nome:");
        System.out.println(cadastroProdutos.exibirProdutosPorNome("Teclado"));

        // Exibindo produtos ordenados por preço
        System.out.println("\nProdutos ordenados por preço:");
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
    }
}