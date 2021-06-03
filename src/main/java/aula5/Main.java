package aula5;

import javax.swing.JLabel;

public class Main {
    
    public static void main(String[] args) {
        //Tipos primitivos não suportam valor nulo
        //int a = null;
        
        Integer a = null;
        a = 10;
        System.out.println(a);
        System.out.println(a.byteValue());
        System.out.println(a.doubleValue());
        System.out.println(a.toString());
        
        Usuario usuario = new Usuario();
        System.out.println(usuario.getNome());
        usuario.setIdade(-1);
        //usuario.setSenha(null);
        System.out.println(usuario.getSenha());
        usuario.alterarSenha("aaa", "bbb");
        System.out.println(usuario.getSenha());
        usuario.alterarSenha("123", "bbb");
        System.out.println(usuario.getSenha());
        
        JLabel jLabel = new JLabel();
        jLabel.setText("Texto");
        
        Pedido p = new Pedido();
        // muda valor do pedido para 200 reais!
        //p.setValorTotal(p.getValorTotal() + 200.0);
        
        p.adiciona(new Item("Chuveiro Elétrico", 500f));
        
        Item item = new Item("Super Geladeira", 1500f);

        // antiga
        if (item.getPreco() > 1000) {
            //p.setValorTotal(p.getValorTotal() + item.getPreco() * 0.95);
        }
        else {
            //p.setValorTotal(p.getValorTotal() + item.getPreco());
        }

        // nova
        p.adiciona(item);
    }
    
}
