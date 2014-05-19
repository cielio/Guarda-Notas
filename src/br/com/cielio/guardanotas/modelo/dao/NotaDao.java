/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cielio.guardanotas.modelo.dao;

import br.com.cielio.guardanotas.modelo.Nota;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Cielio
 */
public class NotaDao {
    
    //Depedencia da classe NotaDao
    private final EntityManager entityManager;
    
    //Recebendo a dependencia
    public NotaDao(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }
    
    public void adicionar(Nota nota)
    {
        entityManager.persist(nota);
    }
    
    public void excluir(Nota nota)
    {
        entityManager.remove(nota);
    }
    
    public Nota buscar(Long id)
    {
        return entityManager.getReference(Nota.class, id);
    }
    
    public List<Nota> listar()
    {
        return entityManager.createQuery("from Nota").getResultList();
    }
}
