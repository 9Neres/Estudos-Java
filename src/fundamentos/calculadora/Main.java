package fundamentos.calculadora;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Escolha o primeiro número:");
            int NumUm = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite qual sinal p' operação: +, -, *, /");
            String Operacao = scanner.nextLine();

        System.out.println("Escolha o segundo número:");
            int NumDois = scanner.nextInt();

        try{
            if(Operacao.equals("+")){

                soma = NumUm + NumDois;

            } else if (Operacao.equals("-")){

                soma = NumUm - NumDois;

            } else if (Operacao.equals("*")){

                soma = NumUm * NumDois;

            } else if (Operacao.equals("/")){
                if (NumDois == 0){
                    throw new ArithmeticException("Divisão por zero não é valida");
                }
                soma = NumUm / NumDois;
            }else{
                System.out.println("Operador invalido");
            }

            System.out.printf("\n%d",soma);
        }
        catch(ArithmeticException e){
            System.out.println("Erro: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}
