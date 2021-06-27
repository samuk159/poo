package aula10;

public class Main {
    
    static volatile int saldo = 50;

    public static void main(String[] args) {
        /*NumerosThread threadA = new NumerosThread("A", 1, 20);
        NumerosThread threadB = new NumerosThread("B", 21, 30);
        threadA.start();
        threadB.start();
        
        Thread threadC = new Thread() {
            @Override
            public void run() {
                System.out.println("C Passo 1");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                System.out.println("C Passo 2");
            }
        };
        
        threadC.start();*/
        
        /*Conta conta = new Conta(1000);
        Thread t1 = new SaqueThread(conta, 800);
        Thread t2 = new SaqueThread(conta, 300);
        t1.start();
        t2.start();*/
        
        /*Thread t1 = new SaldoThread();
        Thread t2 = new SaldoThread();
        t1.start();
        t2.start();*/
        
        Thread t1 = new Thread() {
            @Override
            public void run() {                
                saldo = 50;
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("Saldo: " + saldo);
            }
        };
        t1.start();
        t2.start();
    }
    
}
