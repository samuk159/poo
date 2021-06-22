package aula7;

public class Sapo extends Anfibio {
    private boolean girino;

    public Sapo(boolean girino) {
        this.girino = girino;
    }

    @Override
    public void andar() throws AnimalNaoAndaException {
        if (girino) {
            throw new AnimalNaoAndaException();
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
