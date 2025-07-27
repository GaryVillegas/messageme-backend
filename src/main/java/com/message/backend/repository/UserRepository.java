package com.message.backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.message.backend.models.User;

public interface UserRepository  extends MongoRepository<User, String>{

    /**
     * @param username
     * @return details from user with username.
     */
    //sincerely idk if it going to work yet.
    @Query(value = "{username: '?0'}")
    User findUserByUsername(String username);

}