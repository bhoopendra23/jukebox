package com.web.jukebox.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import lombok.Data;

@Data
@Entity
@Table(name="music_album")
public class MusicAlbums {
	@Id
	@Column(name="ALBUM_ID")
	@GeneratedValue(generator="album_id")
	@GenericGenerator(name="album_id",strategy="increment")
	private Long albumId;
	
	@Length(min=5,message="Album name should be minimum 5 Character")
	@Column(name="ALBUM_NAME")
	private String albumName;
	
	@NotNull
	@Column(name="RELEASE_DATE")
	@Temporal(TemporalType.DATE)
	private Date  releaseDate;
	
	@Column(name="GENRE")
	private String genre;
	
	@Range(min=100,max=1000,message="must be between 100 and 1000")
	@Column(name="PRICE")
	private int price;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@ManyToMany
	private List<Musicians> musicians;
	

}

