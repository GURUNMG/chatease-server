package com.chateaseserver.main.user.service;

import com.chateaseserver.main.user.dao.UserDAO;
import com.chateaseserver.main.user.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.apache.logging.log4j.util.Strings.isNotBlank;

@Service
public class UserService {
    @Autowired
    private UserDAO userDAO;

    public void register(User user){
        if(user != null && isNotBlank(user.getName())){
            userDAO.save(user);
        }
    }

    public List<User> getAllUsers() {
        return userDAO.findAll();
    }
}
