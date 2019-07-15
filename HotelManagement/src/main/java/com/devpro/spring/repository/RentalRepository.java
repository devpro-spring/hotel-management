package com.devpro.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devpro.spring.model.Rental;

@Repository
public interface RentalRepository extends JpaRepository<Rental, Long>{

}