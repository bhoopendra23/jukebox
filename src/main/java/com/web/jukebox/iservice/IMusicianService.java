package com.web.jukebox.iservice;

import java.util.List;
import java.util.Optional;

import com.web.jukebox.model.Musicians;

public interface IMusicianService {
	public void save(Musicians musicians);
	public void update(Musicians musicians);
	public void delete(Long long1);
	public Optional<Musicians> getOne(Long long1);
	public List<Musicians> findAll();

}
