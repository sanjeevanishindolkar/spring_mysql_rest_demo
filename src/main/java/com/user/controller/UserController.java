package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.user.dto.UserDTO;
import com.user.service.UserService;
/**
 * 
 * @author Gaurav
 *
 */
@RequestMapping("/user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	
	// Create operation
	@RequestMapping(value = "/addNewUser", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> addNewUser(@RequestBody UserDTO userDTO) {

		return new ResponseEntity<>(this.userService.addUser(userDTO), HttpStatus.OK);
	}
   
	//Delete operation
	@RequestMapping(value="/deleteUser", method = RequestMethod.DELETE)	
	public ResponseEntity<?> deleteUser(@RequestBody UserDTO userDTO){
		this.userService.deleteUser(userDTO);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//Update Operation
	//@RequestMapping(value="/updateUser", method = RequestMethod.PUT)
	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> updateUser(@RequestBody UserDTO userDTO) {
		this.userService.updateUser(userDTO);
		 return new ResponseEntity<>(this.userService.updateUser(userDTO), HttpStatus.OK);
	}
}
