package com.twg.springboot.service;

import java.util.List;

import com.twg.springboot.entity.Details;

public interface DetailsService {
	
	public Details saveDetails(Details details);
	public Details updateDetails(Details details);
	public void deleteDetails(Details details);
	public Details findById(Long id);
	public List<Details> findAll();

}
