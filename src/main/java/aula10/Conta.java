package aula10;

public class Conta {
    private Float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }
    
    public synchronized float sacar(float valor) 
        throws InterruptedException {
        if (this.saldo >= valor) {
            System.out.println("Sacando valor " + valor);
            Thread.sleep(1000);
            this.saldo -= valor;
            System.out.println("Valor " + valor + " sacado");
            System.out.println("Novo saldo: " + saldo);
            return valor;
        } else {
            System.out.println("Saldo unsuficiente");
            return 0;
        }
    }
    
    public float getSaldo() {
        return saldo;
    }   
    
}
