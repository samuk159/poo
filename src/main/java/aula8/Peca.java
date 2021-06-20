package aula8;

public abstract class Peca {
    private String nome;
    protected int posicaoHorizontal;
    protected int posicaoVertical;

    public Peca(String nome, int posicaoHorizontal, int posicaoVertical) {
        this.nome = nome;
        this.posicaoHorizontal = posicaoHorizontal;
        this.posicaoVertical = posicaoVertical;
    }
    
    public abstract void mover();
    //getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPosicaoHorizontal() {
        return posicaoHorizontal;
    }

    public void setPosicaoHorizontal(int posicaoHorizontal) {
        this.posicaoHorizontal = posicaoHorizontal;
    }

    public int getPosicaoVertical() {
        return posicaoVertical;
    }

    public void setPosicaoVertical(int posicaoVertical) {
        this.posicaoVertical = posicaoVertical;
    }
    
}
