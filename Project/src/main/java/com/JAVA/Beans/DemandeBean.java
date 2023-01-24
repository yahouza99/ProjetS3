package com.JAVA.Beans;

import java.sql.Date;

public class DemandeBean {
	private int iddemande;
	private String type_demande;
	private String motif_demande;
	private String contenu;
	private Date date_demande;
	private int idf;
	private int idc;
	private String mot_celeb;
	private int statut_demande;
	
	public DemandeBean(int iddemande, String type_demande, String motif_demande, String contenu, Date date_demande,
			int idf, int idc, String mot_celeb, int statut_demande) {
		super();
		this.iddemande = iddemande;
		this.type_demande = type_demande;
		this.motif_demande = motif_demande;
		this.contenu = contenu;
		this.date_demande = date_demande;
		this.idf = idf;
		this.idc = idc;
		this.mot_celeb = mot_celeb;
		this.statut_demande = statut_demande;
	}

	public DemandeBean(String type_demande, String motif_demande, String contenu, Date date_demande, int idf, int idc,
			String mot_celeb, int statut_demande) {
		super();
		this.type_demande = type_demande;
		this.motif_demande = motif_demande;
		this.contenu = contenu;
		this.date_demande = date_demande;
		this.idf = idf;
		this.idc = idc;
		this.mot_celeb = mot_celeb;
		this.statut_demande = statut_demande;
	}
	

	public DemandeBean(String type_demande, String motif_demande, int idf, int idc) {
		super();
		this.type_demande = type_demande;
		this.motif_demande = motif_demande;
		this.idf = idf;
		this.idc = idc;
	}

	public int getIddemande() {
		return iddemande;
	}

	public void setIddemande(int iddemande) {
		this.iddemande = iddemande;
	}

	public String getType_demande() {
		return type_demande;
	}

	public void setType_demande(String type_demande) {
		this.type_demande = type_demande;
	}

	public String getMotif_demande() {
		return motif_demande;
	}

	public void setMotif_demande(String motif_demande) {
		this.motif_demande = motif_demande;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Date getDate_demande() {
		return date_demande;
	}

	public void setDate_demande(Date date_demande) {
		this.date_demande = date_demande;
	}

	public int getIdf() {
		return idf;
	}

	public void setIdf(int idf) {
		this.idf = idf;
	}

	public int getIdc() {
		return idc;
	}

	public void setIdc(int idc) {
		this.idc = idc;
	}

	public String getMot_celeb() {
		return mot_celeb;
	}

	public void setMot_celeb(String mot_celeb) {
		this.mot_celeb = mot_celeb;
	}

	public int getStatut_demande() {
		return statut_demande;
	}

	public void setStatut_demande(int statut_demande) {
		this.statut_demande = statut_demande;
	}
	

}
