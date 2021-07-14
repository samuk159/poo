package generics;

import heranca_e_composicao.Animal;
import heranca_e_composicao.Cachorro;
import heranca_e_composicao.Gato;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import polimorfismo.Peao;
import polimorfismo.Peca;
import polimorfismo.Torre;

public class Main {
    public static void main(String[] args) {
        int[] arrayDeInteiros = new int[3];
        arrayDeInteiros[0] = 64;
        arrayDeInteiros[1] = 27;
        arrayDeInteiros[2] = 93;
        //arrayDeInteiros[3] = 41;
        
        //import java.util.List;
        //import java.util.Map;
        List<Integer> listaDeInteiros = new ArrayList<Integer>();
        listaDeInteiros.add(64);
        listaDeInteiros.add(27);
        listaDeInteiros.add(93);
        listaDeInteiros.add(41);
        listaDeInteiros.set(1, 85);
        
        System.out.println(listaDeInteiros);
        System.out.println("Tamanho: " + listaDeInteiros.size());
        System.out.println("Posição 2: " + listaDeInteiros.get(2));
        System.out.println("Contém 41: " + listaDeInteiros.contains(41));
        System.out.println("Está vazia: " + listaDeInteiros.isEmpty());
        
        listaDeInteiros.remove(0);
        System.out.println(listaDeInteiros);
        
        System.out.println("for clássico:");
        for (int i = 0; i < listaDeInteiros.size(); i++) {
            System.out.println(listaDeInteiros.get(i));
        }
        
        System.out.println("for each:");
        for (Integer valor : listaDeInteiros) {
            System.out.println(valor);
        }
        
        List<String> nomes = new ArrayList<>();
        nomes.add("Samuel");
        nomes.add("Carlos");
        
        /*
            import heranca_e_composicao.Animal;
            import heranca_e_composicao.Cachorro;
            import heranca_e_composicao.Gato;
        */
        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro());
        
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        
        //import java.util.HashMap;
        //import java.util.Map;
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("a", 64);
        mapa.put("b", 27);
        mapa.put("c", 93);
        
        System.out.println(mapa);
        System.out.println("a: " + mapa.get("a"));
        System.out.println("Tamanho: " + mapa.size());
        System.out.println("Contém a chave b: " + mapa.containsKey("b"));
        System.out.println("Contém o valor: " + mapa.containsValue(93));
        System.out.println("Está vazio: " + mapa.isEmpty());
        
        System.out.println("Valores:");
        for (Integer valor : mapa.values()) {
            System.out.println(valor);
        }
        
        System.out.println("Chaves:");
        for (String chave : mapa.keySet()) {
            System.out.println(chave);
        }
        
        System.out.println("Ambos:");
        for (Entry<String, Integer> par : mapa.entrySet()) {
            System.out.println(par.getKey() + " -> " + par.getValue());
        }
        
        mapa.remove("b");
        System.out.println(mapa);
        
        Integer[] vetorDeInteiros = new Integer[] { 64, 27, 93 };
        imprimeVetorGenerico(vetorDeInteiros);
        
        Double[] vetorDeDoubles = new Double[] { 64.2, 27.5, 93.78 };
        imprimeVetorGenerico(vetorDeDoubles);
        
        Character[] vetorDeCaracteres = new Character[] { 'A', 'B', 'C' };
        imprimeVetorGenerico(vetorDeCaracteres);
        
        int inteiro = (int) 1.5;
        
        List lista = new ArrayList();
        lista.add(1);
        lista.add(2);
        //lista.add("3");
        
        int soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            soma += (int) lista.get(i);
        }
        System.out.println("Soma: " + soma);
        
        Caixa<Integer, Character> c1 = new Caixa<Integer, Character>('A');
        c1.colocar(1);
        
        Caixa<Double, Integer> c2 = new Caixa<>(123456);
        c2.colocar(2.5);
        
        //import polimorfismo.Peca;
        //import polimorfismo.Peca;
        //import polimorfismo.Torre;
        Caixa<Peca, String> c3 = new Caixa<>("Xadrez");
        c3.colocar(new Peao("p", 0, 0));
        c3.colocar(new Torre("t", 0, 0));
    }
    
    public static void imprimeVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.println(valor);
        }
    }
    
    public static void imprimeVetor(double[] vetor) {
        for (double valor : vetor) {
            System.out.println(valor);
        }
    }
    
    public static <T> void imprimeVetorGenerico(T[] vetor) {        
        for (T valor : vetor) {
            System.out.println(valor + " (" + valor.getClass() + ")");
        }
    }
}
