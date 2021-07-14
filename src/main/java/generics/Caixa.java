package generics;

import java.util.ArrayList;
import java.util.List;

public class Caixa<T, I> {
    List<T> conteudo;
    I identificacao;
    
    public Caixa(I identificacao) {
        this.identificacao = identificacao;
        this.conteudo = new ArrayList<>();
    }
    
    public void colocar(T elemento) {
        this.conteudo.add(elemento);
    }
}
