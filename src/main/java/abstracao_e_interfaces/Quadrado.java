package abstracao_e_interfaces;

public class Quadrado extends Retangulo {

    private Quadrado(float largura, float altura) {
        super(largura, altura);
    }
    
    public Quadrado(float lado) {
        this(lado, lado);
    }

}
