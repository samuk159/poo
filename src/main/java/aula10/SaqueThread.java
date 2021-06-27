package aula10;

public class SaqueThread extends Thread {
    private Conta conta;
    private float valor;

    public SaqueThread(Conta conta, float valor) {
        this.conta = conta;
        this.valor = valor;
    }
    
    @Override
    public void run() {
        try {
            conta.sacar(valor);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
