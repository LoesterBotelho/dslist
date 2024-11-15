package com.loester.dslist.dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.loester.dslist.entities.Game;
import com.loester.dslist.projections.GameMinProjection;

public class GameMinDTO {

	Long id;
	String title;
	Integer year;
	String imgUrl;
	String shortDescription;

	public GameMinDTO() {

	}

	public GameMinDTO(Game entity) {
		BeanUtils.copyProperties(entity, this);
	}

	public GameMinDTO(GameMinProjection projection) {
		BeanUtils.copyProperties(projection, this);
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	@Override
	public String toString() {
		return "GameMinDTO [id=" + id + ", title=" + title + ", year=" + year + ", imgUrl=" + imgUrl
				+ ", shortDescription=" + shortDescription + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameMinDTO other = (GameMinDTO) obj;
		return Objects.equals(id, other.id);
	}

}
