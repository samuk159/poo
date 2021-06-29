package abstracao_e_interfaces;

public class Triangulo extends Figura {

    public Triangulo(float largura, float altura) {
        super(largura, altura);
    }

    @Override
    public float getArea() {
        return (getLargura() * getAltura()) / 2;
    }

}
