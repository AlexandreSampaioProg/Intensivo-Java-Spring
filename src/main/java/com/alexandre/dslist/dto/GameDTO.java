package com.alexandre.dslist.dto;

import com.alexandre.dslist.entities.Game;

public class GameDTO {
	
	private Long id;
	private String title;
	private Double score;
	private Integer year;
	private String genre;
	private String platform;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		score = entity.getScore();
		year = entity.getYear();
		genre = entity.getGenre();
		platform = entity.getPlatform();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getLongDescription();
		longDescription = entity.getLongDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Double getScore() {
		return score;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatform() {
		return platform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}
	
	
}
