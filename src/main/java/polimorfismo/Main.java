package polimorfismo;

public class Main {

    public static void main(String[] args) {  
        /*Peca p1 = new Peao("P1", 7, 0);
        Peca p2 = new Peao("P2", 7, 1);
        
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setPecas(new Peca[2]);
        
        tabuleiro.getPecas()[0] = p1;
        tabuleiro.getPecas()[1] = p2;
        tabuleiro.desenhar();
        
        p1.mover();
        tabuleiro.desenhar();
        
        p2.mover();
        p2.mover();
        tabuleiro.desenhar();*/      
        
        Peca p1 = new Peao("P1", 7, 0);
        Peca p2 = new Peao("P2", 7, 1);
        Peca c = new Cavalo("C1", 7, 2);
        Peca t = new Torre("T1", 7, 3);
        Peca b = new Bispo("B1", 7, 7);
        
        Tabuleiro tabuleiro = new Tabuleiro();
        tabuleiro.setPecas(new Peca[5]);
        tabuleiro.getPecas()[0] = p1;
        tabuleiro.getPecas()[1] = p2;
        tabuleiro.getPecas()[2] = c;
        tabuleiro.getPecas()[3] = t;
        tabuleiro.getPecas()[4] = b;
        tabuleiro.desenhar();
        
        p1.mover();
        tabuleiro.desenhar();
        
        p2.mover();
        p2.mover();
        tabuleiro.desenhar();
        
        c.mover();
        tabuleiro.desenhar();
        
        t.mover();
        tabuleiro.desenhar();
        
        b.mover();
        tabuleiro.desenhar();
        
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.somar(1, 2));
        System.out.println(calculadora.somar(2f, 3.5f));
        System.out.println(calculadora.somar("2", "3"));
        System.out.println(calculadora.somar(1, 2, 3));
        System.out.println(calculadora.somar(new int[] { 1, 2, 3, 4, 5 }));
        
        calculadora.dividir(2, 0);
    }
    
}
