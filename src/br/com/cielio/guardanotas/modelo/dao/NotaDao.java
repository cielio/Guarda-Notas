/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cielio.guardanotas.modelo.dao;

import br.com.cielio.guardanotas.modelo.Nota;
import java.util.ArrayList;
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
    
    public void atualizar(Nota nota)
    {
        entityManager.merge(nota);
    }
    
    public void excluir(Long id)
    {
        Nota nota = entityManager.find(Nota.class, id);
        entityManager.remove(nota);
    }
    
    public Nota buscar(Long id)
    {
        return entityManager.getReference(Nota.class, id);
    }
    
    public ArrayList<Nota> listar()
    {
        return (ArrayList<Nota>) entityManager.createQuery("SELECT n FROM Nota n ORDER BY n.id DESC").getResultList();
    }
    
}
