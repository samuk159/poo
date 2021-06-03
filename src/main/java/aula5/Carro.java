package aula5;

/**
 * Este é um exemplo típico de um POJO. Perceba que está classe possui
 * apenas 2 atributos e um método GET e outro SET para cada um deles.
 */
public class Carro {
    
  private String modelo;
  private String cor;

  public String getModelo() { return modelo; }

  public void setModelo(String modelo) { this.modelo = modelo; }
  
  public String getCor() { return cor; }

  public void setCor(String cor) { this.cor = cor; }
  
}
