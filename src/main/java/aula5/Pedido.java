package aula5;

public class Pedido {
  private String comprador;
  private double valorTotal;

  public String getComprador() { 
      return comprador; 
  }
  
  public void setComprador(String comprador) { 
      this.comprador = comprador; 
  }

  public double getValorTotal() { 
      return valorTotal; 
  }
  
  public void adiciona(Item item) {
    if(item.getPreco() < 1000) {
        this.valorTotal += item.getPreco();
    } else {
        this.valorTotal += item.getPreco() * 0.95;
    }
    
    // nova regra de negócio aqui
  }
  
}
