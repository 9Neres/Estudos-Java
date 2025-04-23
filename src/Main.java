import java.util.Scanner;

public class Main{
    public static void main ( String [] args){

        printEmpregado(new Gerente());
        printEmpregado(new Vendedor());

    }

    public static void printEmpregado (Empregado empregado){


        System.out.printf("=======%s=======\n", empregado.getClass().getCanonicalName());

        if(empregado instanceof Gerente){
        }

        switch (empregado){
            case Gerente gerente ->{

                empregado.setIdentificador("001");
                empregado.setNome("Kaiser");
                empregado.setIdade(23);
                empregado.setSalario(5000);

                ((Gerente)empregado).setLogin("Kaiser@gmail.com");
                ((Gerente)empregado).setPassword("2312" + "\n");

                System.out.println(empregado.getNome());
                System.out.println(((Gerente)empregado).getLogin());
                System.out.println(((Gerente)empregado).getPassword());
                System.out.println(empregado.getIdade());
                System.out.println(empregado.getSalario() + "\n");

            }
            case Vendedor vendedor -> {

                vendedor.setIdentificador("002");
                vendedor.setNome("Carlos");
                vendedor.setClientesAtendidos(20);
                vendedor.setComissao(0.1);

                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getNome());
                System.out.println(((Vendedor)empregado).getComissao());
                System.out.println(((Vendedor)empregado).getClientesAtendidos());
            }
        }

    }
}