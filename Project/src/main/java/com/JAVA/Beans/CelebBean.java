package com.JAVA.Beans;

public class CelebBean {
	private int id;
	private String login;
	private String password;
	private String nom;
	private String prenom;
	private String nationalite;
	private String sexe;
	private String email;
	private String photo;
	private String type;
	private String insta;
	private String facebook;
	private String twiter;
	
	
	
	public CelebBean(int id, String login, String password, String nom, String prenom, String nationalite, String sexe,
			String email, String photo, String type, String insta, String facebook, String twiter) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.sexe = sexe;
		this.email = email;
		this.photo = photo;
		this.type = type;
		this.insta = insta;
		this.facebook = facebook;
		this.twiter = twiter;
	}

	public CelebBean(int id, String login, String password, String nom, String prenom, String nationalite, String sexe,
			String email, String photo) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.sexe = sexe;
		this.email = email;
		this.photo = photo;
	}
	
	
	public CelebBean(String login, String password, String nom, String prenom, String nationalite, String sexe,
			String email, String photo, String type, String insta, String facebook, String twiter) {
		super();
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.sexe = sexe;
		this.email = email;
		this.photo = photo;
		this.type = type;
		this.insta = insta;
		this.facebook = facebook;
		this.twiter = twiter;
	}

	public CelebBean(String login, String password, String nom, String prenom, String nationalite, String sexe,
			String email, String photo) {
		super();
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.sexe = sexe;
		this.email = email;
		this.photo = photo;
	}
    
	public CelebBean(String login, String password, String nom, String prenom, String nationalite, String sexe,
			String email) {
		super();
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.sexe = sexe;
		this.email = email;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInsta() {
		return insta;
	}

	public void setInsta(String insta) {
		this.insta = insta;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getTwiter() {
		return twiter;
	}

	public void setTwiter(String twiter) {
		this.twiter = twiter;
	}
	
	
}
