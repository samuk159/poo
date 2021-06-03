package aula4;

import aula4.loja.Filial;
import aula4.transporte.Caminhao;
import aula4.transporte.Motor;
import aula4.transporte.Motorista;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        /*Caminhao caminhao = new Caminhao();
        caminhao.motorista = new Motorista();
        caminhao.motor = new Motor();*/
        
        Filial filial1 = new Filial("Guarapuava");
        filial1.faturamento = 100_000f;
        Filial.faturamentoTotal = 100_000f;
        
        System.out.println("Antes");
        System.out.println(filial1.faturamento);
        System.out.println(filial1.faturamentoTotal);
        
        Filial filial2 = new Filial("Curitiba");
        filial2.faturamento = 200_000f;
        Filial.faturamentoTotal = 300_000f;
        
        System.out.println("Depois");
        System.out.println(filial1.faturamento);
        System.out.println(filial1.faturamentoTotal);
        
        filial1.calcularFaturamento();
        filial2.calcularFaturamento();
        Filial.calcularFaturamentoTotal(filial1, filial2);
        
        System.out.println("Calculando faturamento");
        System.out.println(filial1.faturamento);
        System.out.println(filial2.faturamento);
        System.out.println(Filial.faturamentoTotal);
        
        Filial filial3 = new Filial("São Paulo");
        filial3.calcularFaturamento();
        filial3 = null;
        
        System.out.println("Saída");
        System.err.println("Erro");
        new Scanner(System.in);
    }
        
}
