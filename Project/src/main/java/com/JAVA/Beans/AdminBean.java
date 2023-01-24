package com.JAVA.Beans;

public class AdminBean {
	private int idAdministrateur;
	private String login;
	private String password;
	private String nom;
	private String prenom;
	
	public AdminBean(String login, String password, String nom, String prenom) {
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public AdminBean(int idAdministrateur, String login, String password, String nom, String prenom) {
		this.idAdministrateur = idAdministrateur;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public int getIdAdministrateur() {
		return idAdministrateur;
	}
	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur= idAdministrateur;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	

}
