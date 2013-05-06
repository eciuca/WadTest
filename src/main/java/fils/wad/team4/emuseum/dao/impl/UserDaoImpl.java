/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fils.wad.team4.emuseum.dao.impl;

import fils.wad.team4.emuseum.dao.UserDao;
import fils.wad.team4.emuseum.model.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author manu
 */

@Transactional
public class UserDaoImpl implements UserDao {
    
    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> listUsers() {
        return entityManager.createQuery("SELECT u FROM User u").getResultList();
    }
    
    
}
