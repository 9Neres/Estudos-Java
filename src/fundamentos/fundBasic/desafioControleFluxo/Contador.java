package fundamentos.fundBasic.desafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner parametro = new Scanner(System.in);

        System.out.println("Qual numero para o primeiro parametro?");
        int parametro1 = parametro.nextInt();

        System.out.println("Qual numero para o segundo parametro?");
        int parametro2 = parametro.nextInt();

        try{
            contar(parametro1, parametro2);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }
        finally{
            parametro.close();
        }
    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        for(int i = parametro1 + 1; i <= parametro2 - 1 ; i++){
            System.out.println(i);
        }
        if( parametro1 >= parametro2){
            throw new ParametrosInvalidosException();
        }
    }

    private static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException() {
        }
    }
}
