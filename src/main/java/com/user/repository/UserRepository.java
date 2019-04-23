package com.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.entity.User;
/**
 * 
 * @author Gaurav
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}
