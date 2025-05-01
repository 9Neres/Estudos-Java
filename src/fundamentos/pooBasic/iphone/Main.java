package fundamentos.pooBasic.iphone;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Telefone telefone = new Telefone();

        Scanner scanner = new Scanner(System.in);

        Random gerador = new Random();

        System.out.println("Deseja se conectar a internet ? SIM/NAO");
        String opcao = scanner.nextLine();

        if(opcao.equalsIgnoreCase("sim")){

            telefone.conectar();

            System.out.println("\nQual serviço deseja usar?");
            System.out.println("1 - Navegador / 2 - Musicas / 3 - Telefone");
            int servicoOpcao = scanner.nextInt();

            switch (servicoOpcao) {
                case 1:
                    System.out.println("Com defeito por hora");
                    break;

                case 2:
                    System.out.println("Qual musica deseja ouvir?\n");

                    System.out.println("1. Flowers - Miley Cyrus");
                    System.out.println("2. Blinding Lights - The Weeknd");
                    System.out.println("3. Bad Habits - Ed Sheeran");
                    System.out.println("4. Dance Monkey - Tones and I");

                    System.out.println("Digite o numero:");
                    int musicaOpcao = scanner.nextInt();

                    switch (musicaOpcao){

                        case 1:
                            telefone.tocarMusica();
                            System.out.println("\nFlowers - Miley Cyrus");
                            break;
                        case 2:
                            telefone.tocarMusica();
                            System.out.println("\nBlinding Lights - The Weeknd");
                            break;

                        case 3:
                            telefone.tocarMusica();
                            System.out.println("\nBad Habits - Ed Sheeran");
                            break;

                        case 4:
                            telefone.tocarMusica();
                            System.out.println("\nDance Monkey - Tones and I");
                            break;

                    }
                    break;

                case 3:
                    realizarLigacao(telefone,scanner,gerador);

            }

        }else if(opcao.equalsIgnoreCase("nao")){

            telefone.desconectar();
            System.out.println("Pode fazer apenas ligações\n");

            System.out.println("Deseja fazer uma ligação ou encerrar?");
            System.out.println(" 1 - Ligar | 2 - encerrar");

            int ligacaoOpcao = scanner.nextInt();
            scanner.nextLine();

            switch (ligacaoOpcao){
                case 1:

                    realizarLigacao(telefone,scanner,gerador);
                    break;
                case 2:
                    break;
            }
        }

        try{
            Thread.sleep(4000);

            int numero = gerador.nextInt(2) + 1;

            if(numero > 1){
                telefone.recebendoChamada();

                System.out.println("1 - Atender ou 2 - Recusar");
                int atenderChamada = scanner.nextInt();

                if(atenderChamada == 1){
                    System.out.println("Ligação em andamento");
                } else if (atenderChamada == 2 ) {
                    System.out.println("Ligação recusada");
                }
            }

        }catch(InterruptedException e){
            System.out.println("erro");
        }

        scanner.close();
    }

    private static void realizarLigacao(Telefone telefone, Scanner scanner, Random gerador){

        telefone.chamando(); // Adiciona uso do método chamando()

        System.out.println("Sua lista de contatos:\n");

        System.out.println("1. Maria Silva - (11) 98765-4321");
        System.out.println("2. João Silva - (11) 91234-5678");
        System.out.println("3. Ana Souza - (11) 99876-5432");
        System.out.println("4. Pedro Souza - (11) 93456-7890");

        String ligandoOpcao = scanner.nextLine();

        int numero = gerador.nextInt(2) + 1;

        if (ligandoOpcao.equals("1")) {
            if (numero > 1) {
                telefone.ligacaoAtendida();
                System.out.println("Olá Maria");
            } else {
                telefone.recusado();
            }
        } else if (ligandoOpcao.equals("2")) {
            if (numero > 1) {
                telefone.ligacaoAtendida();
                System.out.println("Olá João");
            } else {
                telefone.recusado();
            }
        } else if (ligandoOpcao.equals("3")) {
            if (numero > 1) {
                telefone.ligacaoAtendida();
                System.out.println("Olá Ana");
            } else {
                telefone.recusado();
            }
        } else if (ligandoOpcao.equals("4")) {
            if (numero > 1) {
                telefone.ligacaoAtendida();
                System.out.println("Olá Pedro");
            } else {
                telefone.recusado();
            }
        }
    }

//    public static void runTelefoneMusic(MusicPlayer musicPlayer){
//        musicPlayer.tocarMusica();
//        musicPlayer.pararMusica();
//    }
//
//    public static void runTelefoneLigacao(Ligacao ligacao){
//        ligacao.chamando();
//        ligacao.recusado();
//
//        ligacao.recebendoChamada();
//        ligacao.atender();
//        ligacao.recusar();
//        ligacao.retornarLigacao();
//    }
//
//    public static void runTelefoneNavegador(Navegador navegador){
//        navegador.conectar();
//        navegador.desconectar();
//    }
}
