package fundamentos.philosophers;

import java.util.concurrent.Semaphore;

public class JantarDosFilosofos {

    private static final int N = 5;
    public static void main(String[] args) throws Exception {

        Semaphore[] garfo = new Semaphore[N];

        for(int i = 0 ; i < N; i++){
            garfo[i] = new Semaphore(i);
        }

        Filosofos[] filosofo = new Filosofos[N];

        for (int i = 0; i < N; i++){
            filosofo[i] = new Filosofos(i, garfo[i], garfo[(i + 1) % N]);
            new Thread(filosofo[i]).start();
        }

        Thread.sleep(2000);
        Filosofos.jantarfinalizado();

        System.out.println("Fim do Jantar :)");
    }
}
