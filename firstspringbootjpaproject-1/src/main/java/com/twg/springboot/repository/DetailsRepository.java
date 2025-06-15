package com.twg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springboot.entity.Details;

public interface DetailsRepository extends JpaRepository<Details, Long> {

}
