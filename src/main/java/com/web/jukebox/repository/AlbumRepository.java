package com.web.jukebox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.jukebox.model.MusicAlbums;
@Repository
public interface AlbumRepository extends JpaRepository<MusicAlbums, Long> {

}
