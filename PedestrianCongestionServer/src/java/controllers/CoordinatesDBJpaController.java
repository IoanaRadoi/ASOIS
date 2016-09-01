/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.RollbackFailureException;
import db.CoordinatesDB;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


@Stateless
public class CoordinatesDBJpaController implements Serializable {

    @PersistenceContext
    private EntityManager em;

    public void create(CoordinatesDB coordinatesDB) throws RollbackFailureException, Exception {
       
            em.persist(coordinatesDB);
           
    }

    public List<CoordinatesDB> findCoordinatesDBEntities() {
        return findCoordinatesDBEntities(true, -1, -1);
    }

    public List<CoordinatesDB> findCoordinatesDBEntities(int maxResults, int firstResult) {
        return findCoordinatesDBEntities(false, maxResults, firstResult);
    }

    private List<CoordinatesDB> findCoordinatesDBEntities(boolean all, int maxResults, int firstResult) {
        
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(CoordinatesDB.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
       
    }

    public CoordinatesDB findCoordinatesDB(Integer id) {
       
            return em.find(CoordinatesDB.class, id);
       
    }

    public int getCoordinatesDBCount() {
       
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<CoordinatesDB> rt = cq.from(CoordinatesDB.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        
    }
    
     public void update(CoordinatesDB coordinatesDB) {
        
       em.merge(coordinatesDB);

    }
}
