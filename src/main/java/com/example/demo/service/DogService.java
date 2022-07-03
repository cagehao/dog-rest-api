package com.example.demo.service;

import com.example.demo.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DogService {
    List<String> retrieveDogBreed();
    List<String> retrieveDogNames();
    String retrieveDogBreedById(Long id);



}
