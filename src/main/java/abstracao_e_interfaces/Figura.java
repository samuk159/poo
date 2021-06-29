package abstracao_e_interfaces;

public abstract class Figura {
    private float largura;
    private float altura;

    public Figura(float largura, float altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public abstract float getArea();
    //getters e setters

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
}
