package excecoes;

public class Main {
    
    public static void main(String[] args) {
        Curso curso = new Curso();
        
        /*curso.turno = "Tarde";
        //Pode receber valores em minúsculo, com ou sem acento
        curso.turno = "manha";
        //Pode receber valores fora do previsto
        curso.turno = "madrugada";
        
        //Comparação mais custosa
        if (curso.turno.equals("noite")) {
            
        }*/
        
        /*curso.turno = 2;
        //Não resolve o primeiro problema: 
        //pode acontecer de receber outros valores além dos previstos
        curso.turno = 10;
        
        //Comparação menos custosa
        //Problema do "número mágico"
        //Você e sua equipe precisam lembrar o que cada número significa
        if (curso.turno == 3) { }
        
        //Quando quisermos imprimir sua descrição precisamos verificar o valor
        switch (curso.turno) {
            case 1: System.out.println("Manhã"); break;
            case 2: System.out.println("Tarde"); break;
            case 3: System.out.println("Noite"); break;
        }*/
        
        curso.turno = Turno.TARDE;
        //Não pode receber valores fora dos previstos
        //curso.turno = "MADRUGADA";
        //curso.turno = 10;
        //Internamente é um inteiro
        System.out.println(curso.turno.ordinal());
        //Diferentemente de números, podemos exibí-lo diretamente se quisermos
        System.out.println(curso.turno.toString());
        System.out.println(curso.turno.getDescricao());
        curso.turno = Turno.valueOf("NOITE");
        
        System.out.println("Turnos possíveis:");
        for (Turno turno : Turno.values()) {
            System.out.println(turno);
        }
        
        try {
            curso = null;
            curso.turno = Turno.valueOf("MADRUGADA");
        } catch (IllegalArgumentException e) {
            System.out.println("Valor não suportado");
        } catch (NullPointerException e) {
            System.out.println("Curso está nulo");
        }
        
        try {
            curso = new Curso();
            curso.turno = Turno.NOITE;
            curso.turno = Turno.valueOf("MADRUGADA");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro");
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Finalizado");
            System.out.println("Turno: " + curso.turno);
        }
    }
    
}
