package fundamentos.service;

import java.util.Locale;
import java.util.Scanner;

public class Servico {

    public static void main(String[] args) throws Exception {

        Scanner request =  new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite qual serviço p' acessar:  CAMISA OU Telefone");
        String Request = request.nextLine().toUpperCase();

        if(Request.equals("CAMISA")){
            Scanner medida = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o tamanho da camisa que você quer: ");
            String Medida = medida.nextLine().toUpperCase();

            switch(Medida){
                case "P":
                    String Tamanho = "Tamanho pequeno";
                    break;
                case "M":
                    Tamanho = "Tamanho Medio";
                    break;
                case "G":
                    Tamanho = "Tamanho Grande";
                    break;
                default:
                    System.out.println("INDEFINIDO");
                    break;
            }

            System.out.println("Obrigado por comprar conosco!");
        }

        else if(Request.equals("TELEFONE")){

            Scanner plano = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite um plano de telefone:");
            System.out.println(" 1 - Plano Básico - 100 min d'ligação");
            System.out.println(" 2 - Plano Intermediário - 100 min d'ligação + whats e Instagram gratis");
            System.out.println(" 3 - Plano Turbo - 100 min d'ligação + whats e Instagram gratis + 10GB de internet");
            int Plano = plano.nextInt();

            switch(Plano){
                case 1:
                    System.out.println("Você contratou o plano - " + Plano);
                    break;
                case 2:
                    System.out.println("Você contratou o plano - " + Plano);
                    break;
                case 3:
                    System.out.println("Você contratou o plano - " + Plano);
                    break;
                default:
                    System.out.println("INDEFINIDO");
                    break;
            }

            System.out.println("Obriga por escolher a nossa operadora!");
        }

        else {
            System.out.println("SERVIÇO NÃO ENCONTRADO");
        }

        request.close();
    }
}
