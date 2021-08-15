/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia_em_csv.dao;

import excecoes.Turno;
import persistencia_em_csv.model.BaseModel;
import persistencia_em_csv.model.Curso;

/**
 *
 * @author samuk159
 */
public class CursoDAO extends BaseDAO<Curso> {
    private static CursoDAO instancia;
    
    private CursoDAO() {}
    
    public static CursoDAO getInstancia() {
        if (instancia == null) {
            instancia = new CursoDAO();
        }
        
        return instancia;
    }
    
    @Override
    protected String getNomeArquivo() {
        return "cursos";
    }

    @Override
    protected Curso lerColunas(String[] colunas, int i) {
        Curso c = new Curso();
        c.setId(i);
        c.setNome(colunas[0]);
        if (!colunas[1].isEmpty() && !colunas[1].equals("null"))
            c.setDuracao(Integer.parseInt(colunas[1]));
        if (!colunas[2].isEmpty() && !colunas[2].equals("null"))
            c.setTurno(Turno.valueOf(colunas[2]));
        
        return c;
    }

    @Override
    protected String[] criarColunas(Curso model) {
        return new String[] {
          model.getNome(),
          String.valueOf(model.getDuracao()),
          String.valueOf(model.getTurno())
        };
    }
}
