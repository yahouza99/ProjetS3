package com.JAVA.Beans;

import java.sql.Date;

public class TitreBean {
	private int idtitre;
	private String label_titre;
	private String image_titre;
	private String album_titre;
	private int titre_stare;
	private Date date_titre;
	private int id_celeb;
	
	public TitreBean(int idtitre, String label_titre, String image_titre, String album_titre, int titre_stare,
			int id_celeb) {
		super();
		this.idtitre = idtitre;
		this.label_titre = label_titre;
		this.image_titre = image_titre;
		this.album_titre = album_titre;
		this.titre_stare = titre_stare;
		this.id_celeb = id_celeb;
	}
	
	public TitreBean(String label_titre, String image_titre, String album_titre, int titre_stare, Date date_titre,
			int id_celeb) {
		super();
		this.label_titre = label_titre;
		this.image_titre = image_titre;
		this.album_titre = album_titre;
		this.titre_stare = titre_stare;
		this.date_titre = date_titre;
		this.id_celeb = id_celeb;
	}

	public int getIdtitre() {
		return idtitre;
	}
	public void setIdtitre(int idtitre) {
		this.idtitre = idtitre;
	}
	public String getLabel_titre() {
		return label_titre;
	}
	public void setLabel_titre(String label_titre) {
		this.label_titre = label_titre;
	}
	public String getImage_titre() {
		return image_titre;
	}
	public void setImage_titre(String image_titre) {
		this.image_titre = image_titre;
	}
	public String getAlbum_titre() {
		return album_titre;
	}
	public void setAlbum_titre(String album_titre) {
		this.album_titre = album_titre;
	}
	public int getTitre_stare() {
		return titre_stare;
	}
	public void setTitre_stare(int titre_stare) {
		this.titre_stare = titre_stare;
	}
	public int getId_celeb() {
		return id_celeb;
	}
	public void setId_celeb(int id_celeb) {
		this.id_celeb = id_celeb;
	}
	public Date getDate_titre() {
		return date_titre;
	}
	public void setDate_titre(Date date_titre) {
		this.date_titre = date_titre;
	}
	
	

}
