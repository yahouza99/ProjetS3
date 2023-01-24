package com.JAVA.Beans;

import java.sql.Date;

public class MovieBean {
	private int idmovie;
	private String nom_movie;
	private String desc_movie;
	private Date movie_date;
	private String movie_image;
	private int movie_star;
	private int id_celeb;
	
	
	public MovieBean(int idmovie, String nom_movie, String desc_movie, Date movie_date, String movie_image,
			int movie_star, int id_celeb) {
		super();
		this.idmovie = idmovie;
		this.nom_movie = nom_movie;
		this.desc_movie = desc_movie;
		this.movie_date = movie_date;
		this.movie_image = movie_image;
		this.movie_star = movie_star;
		this.id_celeb = id_celeb;
	}
	public MovieBean(String nom_movie, String desc_movie, Date movie_date, String movie_image, int movie_star,
			int id_celeb) {
		super();
		this.nom_movie = nom_movie;
		this.desc_movie = desc_movie;
		this.movie_date = movie_date;
		this.movie_image = movie_image;
		this.movie_star = movie_star;
		this.id_celeb = id_celeb;
	}
	public int getIdmovie() {
		return idmovie;
	}
	public void setIdmovie(int idmovie) {
		this.idmovie = idmovie;
	}
	public String getNom_movie() {
		return nom_movie;
	}
	public void setNom_movie(String nom_movie) {
		this.nom_movie = nom_movie;
	}
	public String getDesc_movie() {
		return desc_movie;
	}
	public void setDesc_movie(String desc_movie) {
		this.desc_movie = desc_movie;
	}
	public Date getMovie_date() {
		return movie_date;
	}
	public void setMovie_date(Date movie_date) {
		this.movie_date = movie_date;
	}
	public String getMovie_image() {
		return movie_image;
	}
	public void setMovie_image(String movie_image) {
		this.movie_image = movie_image;
	}
	public int getMovie_star() {
		return movie_star;
	}
	public void setMovie_star(int movie_star) {
		this.movie_star = movie_star;
	}
	public int getId_celeb() {
		return id_celeb;
	}
	public void setId_celeb(int id_celeb) {
		this.id_celeb = id_celeb;
	}
	
}
