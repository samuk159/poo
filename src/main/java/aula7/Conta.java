package aula7;

public abstract class Conta {
    private int agencia;
    private int numero;
    private float saldo;    
    
    public abstract void aplicarTaxa();
    
    //getters e setters

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
}
