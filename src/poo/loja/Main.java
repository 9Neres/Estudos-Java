package poo.loja;

import java.util.Scanner;
import poo.loja.cliente.Cliente;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Produto mouse = new Produto("mouse", 90, 14);
        Produto teclado = new Produto("Teclado", 199.99, 3);
        Produto monitor = new Produto("Monitor", 599.99, 10);

        Cliente cliente = new Cliente("Luiz");

        System.out.println("Escolha um produto que deseja comprar / 0 - para encerrar");

        System.out.println("1 - Mouse ");
        System.out.println("2 - Teclado ");
        System.out.println("3 - Monitor ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                cliente.comprar(mouse);
                break;
            case 2:
                cliente.comprar(teclado);
                break;
            case 3:
                cliente.comprar(monitor);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("\nEstoque após a compra:");
        mouse.mostrarDetalhes();
        teclado.mostrarDetalhes();
        monitor.mostrarDetalhes();

        scanner.close();
    }
}
