package com.iit.movie.MovieService.service;

import com.iit.movie.MovieService.model.User;

public interface UserService {

	Iterable<User> listAll();

	User getById(User user);

	User save(User user);

	void delete(User user);
}
