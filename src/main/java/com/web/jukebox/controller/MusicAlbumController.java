package com.web.jukebox.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.jukebox.model.MusicAlbums;
import com.web.jukebox.serviceimpl.AlbumServiceImpl;

@RestController
public class MusicAlbumController {
	@Autowired
	private AlbumServiceImpl service;
	@GetMapping("/test")
	public String test() {
		return"yeh,its working fine ";
	}
	
	@PostMapping("/save")
	public String saveStudent(@RequestBody @Valid MusicAlbums albums) {
		service.save(albums);
		return "";
		
	}
	
	@GetMapping("/delete")
	public String deleteRecord(@RequestParam long long1) {
		service.delete(long1);
		return "";
	}

}
