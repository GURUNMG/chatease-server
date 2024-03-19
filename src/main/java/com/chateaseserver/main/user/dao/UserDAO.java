package com.chateaseserver.main.user.dao;

import com.chateaseserver.main.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDAO extends MongoRepository<User, String> {

}
