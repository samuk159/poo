package abstracao_e_interfaces;

public class Retangulo extends Figura {

    public Retangulo(float largura, float altura) {
        super(largura, altura);
    }

    @Override
    public float getArea() {
        return getLargura() * getAltura();
    }

}
