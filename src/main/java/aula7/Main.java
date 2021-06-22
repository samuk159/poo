package aula7;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(1000);
        contaCorrente.setTaxaMensal(30);
        contaCorrente.aplicarTaxa();
        System.out.println(contaCorrente.getSaldo());
        
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(1000);
        contaPoupanca.setTaxaRendimento(0.5f);
        contaPoupanca.aplicarTaxa();
        System.out.println(contaPoupanca.getSaldo());
        
        //Não é possível instanciar classes abstratas
        //Conta conta = new Conta();
        
        Figura retangulo = new Retangulo(5, 2);
        Figura quadrado = new Quadrado(2);
        Figura triangulo = new Triangulo(4, 4);
        
        System.out.println("Área retangulo: " + retangulo.getArea());
        System.out.println("Área quadrado: " + quadrado.getArea());
        System.out.println("Área triangulo: " + triangulo.getArea());
        
        try {
            Anfibio sapo = new Sapo(false);
            sapo.andar();
            Anfibio girino = new Sapo(true);
            girino.andar();
        } catch (AnimalNaoAndaException e) {
            System.err.println("O animal não anda");
            e.printStackTrace();
        }
    }
    
}
