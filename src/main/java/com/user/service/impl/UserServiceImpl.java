
package com.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.dto.UserDTO;
import com.user.entity.User;
import com.user.repository.UserRepository;
import com.user.service.UserService;
/**
 * 
 * @author Gaurav
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User addUser(UserDTO userDTO) {

		User user = new User();
		user = this.trasnformUserDTOTOEntity(userDTO);
		User savedUser = this.userRepo.save(user);
		return savedUser;
	}

	private User trasnformUserDTOTOEntity(UserDTO dto) {

		User user = new User();

		user.setId(dto.getId());
		user.setUserName(dto.getUserName());
		user.setPhoneNumber(dto.getPhoneNumber());
		user.setEmail(dto.getUserName());

		return user;
	}
	
	@Override
	public User deleteUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = new User();
		user = this.trasnformUserDTOTOEntity(userDTO);
		this.userRepo.delete(user);
		return user ;
	}
	
	@Override
    public User updateUser(UserDTO userDTO) {
		User user = new User();
		user = this.trasnformUserDTOTOEntity(userDTO);
		this.userRepo.update(user);
		return user;
	}
}
