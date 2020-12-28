package com.web.jukebox.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Entity
@Table(name="musicians")
public class Musicians {
	
	@Id
	@Column(name="MUSICIAN_ID")
	@GeneratedValue(generator="musician_id")
	@GenericGenerator(name="musician_id",strategy="increment")
	private Long musicianId;
	
	@Length(min=3,message="Musician name should be minimum 3 Character")
	@Column(name="MUSICIAN_NAME")
	private String musicianName;
	
	@NotNull
	@Column(name="MUSICIAN_TYPE")
	private String musicianType;
	
	@ManyToMany
	private List<MusicAlbums> albums;

}
