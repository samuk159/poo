package heranca_e_composicao;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Spike");
        cachorro.setRaca("Pastor alemão");
        cachorro.setPeso(30f);
        cachorro.latir();
        
        Gato gato = new Gato();
        gato.setNome("Lua");
        gato.setRaca("Persa");
        gato.setPeso(4f);
        gato.miar();
        
        Animal animal1 = new Cachorro();
        Animal animal2 = new Gato();
        
        cachorro = new Cachorro("Spike", "Pastor alemão", 30f);
        gato = new Gato("Lua", "Persa", 4f);
        
        Cliente cliente = new Cliente();
        cliente.comprar();
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        desenvolvedor.programar();
        Vendedor vendedor = new Vendedor();
        vendedor.vender();
        
        Funcionario funcionario1 = desenvolvedor;
        Funcionario funcionario2 = vendedor;
        
        Pessoa p1 = cliente;
        Pessoa p2 = desenvolvedor;
        Pessoa p3 = vendedor;
        
        Computador computador = new Computador();
        computador.setProcessador("i3");
        computador.setMemoriaRAM(4f);
        
        //desenvolvedor.setComputador(computador);
        desenvolvedor.computador = computador;
        
        Computador c2 = new Computador();
        c2.setProcessador("i7");
        c2.setMemoriaRAM(16f);
        
        desenvolvedor.computador = c2;
        
        desenvolvedor.getComputador().ligar();
        
        vendedor.setClientes(new Cliente[3]);
        vendedor.getClientes()[0] = cliente;
        Cliente cliente2 = new Cliente();
        vendedor.getClientes()[1] = cliente2;
        vendedor.getClientes()[2] = new Cliente();
        
        Desenvolvedor dev1 = new Desenvolvedor();
        dev1.setComputador(new ComputadorDeMesa());
        Desenvolvedor dev2 = new Desenvolvedor();
        dev2.setComputador(new Notebook());
    }
    
}
