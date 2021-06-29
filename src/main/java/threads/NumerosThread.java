package threads;

public class NumerosThread extends Thread {
    
    private String nome;
    private int inicio;
    private int fim;

    public NumerosThread(String nome, int inicio, int fim) {
        this.nome = nome;
        this.inicio = inicio;
        this.fim = fim;
    }
    
    @Override
    public void run() {
        for (int i = inicio; i <= fim; i++) {
            try {
                System.out.println(nome + ": " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
