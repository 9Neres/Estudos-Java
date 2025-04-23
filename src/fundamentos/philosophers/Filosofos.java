package fundamentos.philosophers;

import java.util.Random;
import java.util.concurrent.Semaphore;

class Filosofos implements Runnable{

    private Random number = new Random();

    private final int id;
    private final Semaphore garfo_esquerdo;
    private final Semaphore garfo_direito;
    private static volatile boolean finalizar = false;

    public Filosofos(int id, Semaphore garfo_esquerdo, Semaphore garfo_direito){
        this.id = id;
        this.garfo_esquerdo = garfo_esquerdo;
        this.garfo_direito = garfo_direito;
    }

    public static void jantarfinalizado(){
        finalizar = true;
    }

    @Override
    public void run(){

        try{
            while (!finalizar) {
                pensar();
                pegarGarfo_esquerdo();
                pegarGarfo_Direito();
                comer();
                devolver_garfo();
            }
        }catch(InterruptedException e){
            System.out.println("Filosofo" + id + "foi interrompido.\n");
        }
    }

    private void pensar() throws InterruptedException{
        System.out.println("Filosofo " + id + " esta PENSANDO. \n");
        Thread.sleep(number.nextInt(10));
    }

    private void pegarGarfo_esquerdo() throws InterruptedException{
        if( garfo_esquerdo.availablePermits() == 0){
            System.out.println("Filosofo " + id + " esta ESPERANDO o garfo esquerdo\n");
        }
        garfo_esquerdo.acquire();
        System.out.println("Filosofo " + id + " esta ESPERANDO o garfo esquerda\n");
    }

    private void pegarGarfo_Direito() throws InterruptedException{
        if( garfo_direito.availablePermits() == 0){
            System.out.println("Filosofo " + id + " esta ESPERANDO o garfo da direita\n");
        }
        garfo_direito.acquire();
        System.out.println("Filosofo " + id + " esta ESPERANDO o garfo da direita\n");
    }

    private void comer() throws InterruptedException{
        System.out.println("Filosofo " + id + " esta COMENDO. \n");
        Thread.sleep(number.nextInt(10));
    }

    private void devolver_garfo() throws InterruptedException{
        garfo_esquerdo.release();
        garfo_direito.release();
        System.out.println("Filosofo " + id + " SOLTOU os garfos.\n");
    }
}
