package polimorfismo;

public class Torre extends Peca {

    public Torre(String nome, int posicaoHorizontal, int posicaoVertical) {
        super(nome, posicaoHorizontal, posicaoVertical);
    }

    @Override
    public void mover() {
        while (posicaoHorizontal > 0) {
            posicaoHorizontal--;
        }
    }

}
