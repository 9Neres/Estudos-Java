package fundamentos.pooBasic.collectionEstudos.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item>itemList;

    public CarrinhoCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();

        if (!itemList.isEmpty()) {
            for (Item n : itemList) {
                if (n.getNome().equalsIgnoreCase(nome))
                itemsParaRemover.add(n);
            }
            itemList.removeAll(itemsParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public double calcularItens() {

        double valorTotal = 0d;

        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("vazio");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista esta vazia");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoCompras: " +
                "itemList=" + itemList;
    }
}
