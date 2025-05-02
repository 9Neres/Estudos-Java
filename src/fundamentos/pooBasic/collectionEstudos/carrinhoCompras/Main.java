package fundamentos.pooBasic.collectionEstudos.carrinhoCompras;

public class Main {
    public static void main(String[] args) throws Exception {

        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Biscoito Oreo", 10d, 2);
        carrinhoCompras.adicionarItem("Arroz", 35d, 1);
        carrinhoCompras.adicionarItem("feijao", 15d, 2);

        carrinhoCompras.exibirItens();
        carrinhoCompras.exibirItens();

        System.out.println("" + carrinhoCompras.calcularItens());
    }
}
