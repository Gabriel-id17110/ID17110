package com.exercise.ensolvers.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.exercise.ensolvers.model.User;

public interface IUser extends CrudRepository<User, Integer>{

}
