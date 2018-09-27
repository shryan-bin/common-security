package com.ryan.authentication.repository;

import com.ryan.authentication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ryan.shen on 9/27/2018
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {

    User findByUserName(String userName);
}
