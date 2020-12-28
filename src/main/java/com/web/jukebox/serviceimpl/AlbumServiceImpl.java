package com.web.jukebox.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.jukebox.iservice.IAlbumtService;
import com.web.jukebox.model.MusicAlbums;
import com.web.jukebox.repository.AlbumRepository;

@Service
public class AlbumServiceImpl implements IAlbumtService {
	@Autowired
	private AlbumRepository repository;

	@Override
	public void save(MusicAlbums std) {
		repository.save(std);
	}

	@Override
	public void update(MusicAlbums std) {
		repository.saveAndFlush(std);
	}

	@Override
	public void delete(Long long1) {
		repository.deleteById(long1);
	}

	@Override
	public Optional<MusicAlbums> getOne(Long long1) {
		return repository.findById(long1);
	}

	@Override
	public List<MusicAlbums> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
