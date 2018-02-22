package com.iit.movie.MovieService.repository;

import org.springframework.data.repository.CrudRepository;

import com.iit.movie.MovieService.model.User;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Integer> {

}