/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.cielio.guardanotas.modelo.dao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * @author cielio
 */
public class JpaUtil {
    
    private static  EntityManagerFactory  factory;
    
    static
    {
        //Carregando o acesso ao banco de dados
        factory = Persistence.createEntityManagerFactory("sqlite_persit");
    }
    
    public static EntityManager getEntityManager()
    {   
        //retorna a conexao
        return factory.createEntityManager();
    }
    
}
