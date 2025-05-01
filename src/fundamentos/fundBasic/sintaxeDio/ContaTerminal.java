package fundamentos.fundBasic.sintaxeDio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta: ");
        int Numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual o agência da conta:");
        String Agencia = scanner.nextLine();

        System.out.println("Nome do cliente:");
        String NomeCliente = scanner.next();

        double Saldo = (double)(Math.random()) * 1000;

        System.out.println("Olá "+ NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ Agencia + " conta " + Numero + " e seu saldo " + String.format("%.2f", Saldo) + " já está disponível para saque");

        scanner.close();
    }
}
