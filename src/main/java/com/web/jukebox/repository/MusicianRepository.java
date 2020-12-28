package com.web.jukebox.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.jukebox.model.Musicians;
@Repository
public interface MusicianRepository extends JpaRepository<Musicians, Long> {

}
