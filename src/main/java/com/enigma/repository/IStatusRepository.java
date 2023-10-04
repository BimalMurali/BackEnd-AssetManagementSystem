package com.enigma.repository;

import org.springframework.data.repository.CrudRepository;

import com.enigma.entity.Status;

public interface IStatusRepository extends CrudRepository<Status, Integer> {

}
