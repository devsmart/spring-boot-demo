package com.iit.movie.MovieService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iit.movie.MovieService.model.User;
import com.iit.movie.MovieService.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@GetMapping(path = "")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userService.listAll();
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<User> saveUser(@RequestBody User user) {

		return new ResponseEntity<User>(userService.save(user), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<User> findOne(@PathVariable("id") Integer id) {
		User user = new User();
		user.setId(id);
		return new ResponseEntity<User>(userService.getById(user), HttpStatus.OK);
	}

}
