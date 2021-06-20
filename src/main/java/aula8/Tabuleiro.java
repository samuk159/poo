package aula8;

public class Tabuleiro {
    private Peca[] pecas;
    //getters e setters
    
    public Peca[] getPecas() {
        return pecas;
    }

    public void setPecas(Peca[] pecas) {
        this.pecas = pecas;
    }
    
    public void desenhar() {
        System.out.println("");
        
        for (int i = 0; i < 8; i++) {
            System.out.println("");
            
            for (int j = 0; j < 8; j++) {
                Peca peca = null;
                
                for (Peca p : pecas) {
                    if (p.getPosicaoHorizontal() == i && p.getPosicaoVertical() == j) {
                        peca = p;
                        break;
                    }
                }
                
                System.out.print("[");
                
                if (peca != null) {
                    System.out.print(peca.getNome());
                } else {
                    System.out.print("  ");
                }
                
                System.out.print("]");
            }
        }
        
        System.out.println("");
    }
    
}
