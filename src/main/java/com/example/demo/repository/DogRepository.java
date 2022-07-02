package com.example.demo.repository;

import com.example.demo.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DogRepository extends CrudRepository<Dog, Long> {

    @Query("SELECT d.id, d.bread From Dog d WHERE d.id = id")
    String findBreedById(Long id);

    @Query("SELECT d.bread From Dog d")
    List<String> findAllBreed();

    @Query("SELECT d.name From Dog d")
    List<String> findAllName();


}
