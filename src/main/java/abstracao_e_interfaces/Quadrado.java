package abstracao_e_interfaces;

public class Quadrado extends Retangulo {

    private Quadrado(float largura, float altura) {
        super(largura, altura);
    }
    
    public Quadrado(float lado) {
        this(lado, lado);
        
        float minhaArea = this.getArea();
        float areaDoMeuPai = super.getArea();
        System.out.println("Minha área: " + minhaArea);
        System.out.println("Área do meu pai: " + areaDoMeuPai);
    }
    
    @Override
    public float getArea() {
        //return getLargura() * getLargura();
        return (float) Math.pow(getLargura(), 2);
    }

}
