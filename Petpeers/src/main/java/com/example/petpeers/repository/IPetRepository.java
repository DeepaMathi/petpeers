package com.example.petpeers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.petpeers.entity.Pet;

@Repository
public interface IPetRepository extends JpaRepository<Pet, Long> {

}
