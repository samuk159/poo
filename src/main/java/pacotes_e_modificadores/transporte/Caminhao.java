package pacotes_e_modificadores.transporte;

import pacotes_e_modificadores.loja.Filial;

public class Caminhao {
    
    protected Motorista motorista;
    private Motor motor;
    
    void transportar(Filial remetente, Filial destinatario) {
        motor.darPartida();
    }
    
}
