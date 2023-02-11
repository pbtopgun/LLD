package com.example.splitw.repositories;


import com.example.splitw.models.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


    /**
     * If user has an id that is already there in the db, update that user with new value
     * Else it will create a new user
     * @param user
     * @return
     */
    User save(User user);

    User findUserById(Long id);

    List<User> findUserByUsernameAndPhoneNumber(String username);
}

