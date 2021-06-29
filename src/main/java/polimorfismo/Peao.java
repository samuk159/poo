package polimorfismo;

public class Peao extends Peca {

    public Peao(String nome, int posicaoHorizontal, int posicaoVertical) {
        super(nome, posicaoHorizontal, posicaoVertical);
    }

    @Override
    public void mover() {
        this.posicaoHorizontal--;
    }

}
