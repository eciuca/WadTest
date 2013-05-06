/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fils.wad.team4.emuseum.action;

import com.opensymphony.xwork2.ActionSupport;
import fils.wad.team4.emuseum.model.User;
import fils.wad.team4.emuseum.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author manu
 */
public class UserAction extends ActionSupport{
    
    @Autowired
    private UserService userService;
    private List<User> usersList = new ArrayList<User>();

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<User> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<User> usersList) {
        this.usersList = usersList;
    }
    
    public String listUsers(){
        usersList = userService.listUsers();
        return SUCCESS;
    }
}
