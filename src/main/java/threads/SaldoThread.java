package threads;

public class SaldoThread extends Thread {
    public static float saldo = 50;
    private boolean sleep;

    public SaldoThread(boolean sleep) {
        this.sleep = sleep;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Saldo antigo: " + saldo);
        saldo -= 10;
        System.out.println("Saldo novo: " + saldo);
    }
}
