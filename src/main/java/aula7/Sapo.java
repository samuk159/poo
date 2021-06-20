package aula7;

public class Sapo extends Anfibio {
    private boolean girino;

    public Sapo(boolean girino) {
        this.girino = girino;
    }

    @Override
    public void andar() {
        if (girino) {
            System.out.println("Girinos não andam");
        } else {
            pular();
        }
    }

    @Override
    public void nadar() {
        if (girino) {
            nadarComCauda();
        } else {
            nadarComPernas();
        }
    }
    
    @Override
    public void comer() { }

    private void pular() { }
    private void nadarComCauda() { }
    private void nadarComPernas() { }
    //getters e setters

    public boolean isGirino() {
        return girino;
    }

    public void setGirino(boolean girino) {
        this.girino = girino;
    }   

}
