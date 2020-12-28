package com.web.jukebox.iservice;

import java.util.List;
import java.util.Optional;

import com.web.jukebox.model.MusicAlbums;

public interface IAlbumtService {
	public void save(MusicAlbums std);
	public void update(MusicAlbums std);
	public void delete(Long studentId);
	public Optional<MusicAlbums> getOne(Long studentId);
	public List<MusicAlbums> findAll();

}
