package polimorfismo;

public class Cavalo extends Peca {

    public Cavalo(String nome, int posicaoHorizontal, int posicaoVertical) {
        super(nome, posicaoHorizontal, posicaoVertical);
    }

    @Override
    public void mover() {
        if (this.posicaoHorizontal >= 2 && this.posicaoVertical <= 6) {
            this.posicaoHorizontal -= 2;
            this.posicaoVertical++;
        }
    }

}
