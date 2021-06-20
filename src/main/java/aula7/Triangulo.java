package aula7;

public class Triangulo extends Figura {

    public Triangulo(float largura, float altura) {
        super(largura, altura);
    }

    @Override
    public float getArea() {
        return (getLargura() * getAltura()) / 2;
    }

}
