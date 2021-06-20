package aula7;

public class Quadrado extends Retangulo {

    private Quadrado(float largura, float altura) {
        super(largura, altura);
    }
    
    public Quadrado(float lado) {
        this(lado, lado);
    }

}
