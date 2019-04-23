package com.user.service;

import com.user.dto.UserDTO;
import com.user.entity.User;
/**
 * 
 * @author Gaurav
 *
 */

public interface UserService {

	public User addUser(UserDTO userDTO);
	
	public User deleteUser(UserDTO userDTO);
	
	public User updateUser(UserDTO userDTO);
	
	
	
	
}
