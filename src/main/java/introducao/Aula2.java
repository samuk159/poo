/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

/**
 *
 * @author samuk159
 */
public class Aula2 {
    
    public static void main(String[] args) {
        //sout + espaço + enter
        System.out.println("Isso é uma mensagem");        
        System.out.println("Tipos em Java: ");
                
        boolean var1 = true;
        System.out.println("Booleano: " + var1);
        
        int var2 = 10;
        System.out.println("Inteiro: " + var2);
        
        long var3 = 2147483648l;
        System.out.println("Long: " + var3);
        
        float var4 = 2.5f;
        System.out.println("Ponto flutuante: " + var4);
        
        double var5 = 2.5; //2.5d
        System.out.println("Double: " + var5);
        
        char var6 = 'A';
        System.out.println("Caractere: " + var6);
        
        String var7 = "Isso é um texto";
        System.out.println("Texto: " + var7);
        
        int variavel = 1;
        variavel = 2;
        
        final int CONSTANTE = 1;
        //CONSTANTE = 2;
        
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 / 2);
        System.out.println(10 % 2);
        System.out.println("12" + "34");
        System.out.println(Math.pow(10, 2));
        System.out.println(Math.sqrt(16));
        
        System.out.println(10 == 2);
        System.out.println(10 != 2);
        System.out.println(10 > 2);
        System.out.println(10 < 2);
        System.out.println(10 >= 2);
        System.out.println(10 <= 2);
        
        System.out.println(var7.charAt(0));
        System.out.println(var7.contains("t"));
        System.out.println(var7.contains("a"));
        System.out.println(var7.startsWith("Isso"));
        System.out.println(var7.endsWith("texto"));
        
        System.out.println();
        System.out.println("Igualdade");
        System.out.println(var7 == "Isso é um texto");
        System.out.println(var7.equals("Isso é um texto"));
        System.out.println(var7.equals("isso é um texto"));
        System.out.println(var7.equalsIgnoreCase("isso é um texto"));
        System.out.println();
        
        System.out.println(var7.isEmpty());
        System.out.println(var7.toLowerCase());
        System.out.println(var7.toUpperCase());
        System.out.println(var7.replace("Isso", "Isto"));
        
        //if, switch, for, while, do while
        if (var1) {
            System.out.println("var1 é verdadeira");
        } else if (var2 > 10) {
            System.out.println("var2 é maior que 10");
        } else {
            System.out.println("Nenhum dos dois");
        }
        
        switch (CONSTANTE) {
            case 1: 
                System.out.println("CONSTANTE é 1");
                break;
            case 2: {
                System.out.println("CONSTANTE é 2");
                break;
            }
            case 3: System.out.println("CONSTANTE é 3"); break;
            default: 
                System.out.println("CONSTANTE não é nenhum dos 3");
                break;
        }
        
        for (int i = 0; i < var2; i++) {
            System.out.println("i: " + i);
        }
        
        int[] arrayDeInteiros = new int[3];
        arrayDeInteiros[0] = 10;
        arrayDeInteiros[1] = 15;
        arrayDeInteiros[2] = 30;
        
        arrayDeInteiros = new int[] { 10, 15, 30 };
        
        for (int i = 0; i < arrayDeInteiros.length; i++) {
            System.out.println(arrayDeInteiros[i]);
        }
        
        for (int valor : arrayDeInteiros) {
            System.out.println(valor);
        }
        
        int a = 1;
        while (a < 5) {
            System.out.println(a);
            a++;
        }
        
        do {
            System.out.println(a);
            a--;
        } while (a > 0);
    }
    
}
