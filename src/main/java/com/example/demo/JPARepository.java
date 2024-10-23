package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface JPARepository extends CrudRepository<GameEntity, Long>{
}
