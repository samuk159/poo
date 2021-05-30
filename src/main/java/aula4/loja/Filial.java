//Sequência de pacotes do arquivo 
//(também chamada de caminho) 
//separada por ponto
package aula4.loja;

public class Filial {
    
    String cidade;
    public double faturamento;
    
    public static double faturamentoTotal = 0;
    
    public Filial(String cidade) {
        this.cidade = cidade;
    }
    
    public void calcularFaturamento() {
        this.faturamento = Math.random() * 100_000;
    }
    
    public static void calcularFaturamentoTotal(Filial filial1, Filial filial2) {
        faturamentoTotal = filial1.faturamento + filial2.faturamento;
    }
    
}
