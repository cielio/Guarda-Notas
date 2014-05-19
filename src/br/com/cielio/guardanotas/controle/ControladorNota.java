/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cielio.guardanotas.controle;

import br.com.cielio.guardanotas.modelo.Nota;
import br.com.cielio.guardanotas.modelo.dao.NotaDao;
import br.com.cielio.guardanotas.modelo.dao.util.JpaUtil;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author kohoutek
 */
public class ControladorNota {
    
    public void adicionar(String titulo, String Conteudo, Date data)
    {
        EntityManager entityManager = JpaUtil.getEntityManager();
        NotaDao notaDao = new NotaDao(entityManager);
        
        Nota nota = new Nota();
        nota.setTitulo(titulo);
        nota.setConteudo(Conteudo);
        nota.setData(data);
        
        entityManager.getTransaction().begin();
        notaDao.adicionar(nota);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    
    public List<Nota> listar()
    {
        EntityManager entityManager = JpaUtil.getEntityManager();
        NotaDao notaDao = new NotaDao(entityManager);
        
        entityManager.getTransaction().begin();
        List<Nota> notas = notaDao.listar();
        entityManager.getTransaction().commit();
        entityManager.close();
        
        return notas;
    }
    
}
