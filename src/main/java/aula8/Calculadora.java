package aula8;

public class Calculadora {
    
    private String marca;
    private String modelo;
    
    public Calculadora() {}

    public Calculadora(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public Calculadora(String marca) {
        this(marca, null);
    }

    public int somar(int n1, int n2) {
        return n1 + n2;
    }
    
    public float somar(float n1, float n2) {
        return n1 + n2;
    }
    
    public int somar(String n1, String n2) {
        return somar(Integer.parseInt(n1), Integer.parseInt(n2));
    }
    
    public int somar(int n1, int n2, int n3) {
        return somar(n1, n2) + n3;
    }
    
    public int somar(int[] numeros) {
        int soma = 0;
        
        for (int n : numeros) {
            soma += n;
        }
        
        return soma;
    }
    
    public int dividir(int n1, int n2) throws ArithmeticException {
        if (n2 == 0) {
            throw new ArithmeticException("Número 2 não pode ser 0");
        }
        
        return n1 / n2;
    }
    
}
