package com.web.jukebox.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.jukebox.iservice.IMusicianService;
import com.web.jukebox.model.Musicians;
import com.web.jukebox.repository.MusicianRepository;

@Service
public class MusicianServiceImpl implements IMusicianService {
	
	@Autowired
	private MusicianRepository repository;

	@Override
	public void save(Musicians musicians) {
		repository.save(musicians);
	}

	@Override
	public void update(Musicians musicians) {
		repository.saveAndFlush(musicians);
	}

	@Override
	public void delete(Long long1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Musicians> getOne(Long long1) {
		return repository.findById(long1);
	}

	@Override
	public List<Musicians> findAll() {
		return repository.findAll();
	}

	
	

}
