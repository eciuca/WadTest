/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fils.wad.team4.emuseum.service.impl;

import fils.wad.team4.emuseum.dao.UserDao;
import fils.wad.team4.emuseum.model.User;
import fils.wad.team4.emuseum.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author manu
 */
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> listUsers() {
        return userDao.listUsers();
    }
}