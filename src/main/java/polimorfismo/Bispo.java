package polimorfismo;

public class Bispo extends Peca {

    public Bispo(String nome, int posicaoHorizontal, int posicaoVertical) {
        super(nome, posicaoHorizontal, posicaoVertical);
    }

    @Override
    public void mover() {
        while (posicaoHorizontal > 0 && posicaoVertical > 0) {
            posicaoHorizontal--;
            posicaoVertical--;
        }
    }

}
