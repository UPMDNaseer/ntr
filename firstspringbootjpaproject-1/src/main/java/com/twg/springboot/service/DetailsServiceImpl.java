package com.twg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.springboot.entity.Details;
import com.twg.springboot.repository.DetailsRepository;

@Service
public class DetailsServiceImpl implements DetailsService {
		
	@Autowired
	private DetailsRepository detailsRepository;
	
	@Override
	public Details saveDetails(Details details) {
		// TODO Auto-generated method stub
		return detailsRepository.save(details);
	}

	@Override
	public Details updateDetails(Details details) {
		// TODO Auto-generated method stub
		return detailsRepository.save(details);
	}

	@Override
	public void deleteDetails(Details details) {
		// TODO Auto-generated method stub

	}

	@Override
	public Details findById(Long id) {
		// TODO Auto-generated method stub
		return detailsRepository.findById(id).get();
	}

	@Override
	public List<Details> findAll() {
		// TODO Auto-generated method stub
		return detailsRepository.findAll();
	}

}
