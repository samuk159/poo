package aula4.transporte;

import aula4.loja.Filial;

public class Caminhao {
    
    protected Motorista motorista;
    private Motor motor;
    
    void transportar(Filial remetente, Filial destinatario) {
        motor.darPartida();
    }
    
}
