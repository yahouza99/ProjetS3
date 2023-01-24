package com.JAVA.Beans;

import java.sql.Date;

public class Sondage_tBean {
	private int idsondage_titre;
	private String type_st;
	private int resultat;
	private int id1;
	private int id2;
	private Date date_st;
	private int satut_st;
	private int total_st;

	
	public Sondage_tBean(int idsondage_titre, String type_st, int resultat, int id1, int id2, Date date_st,
			int satut_st) {
		super();
		this.idsondage_titre = idsondage_titre;
		this.type_st = type_st;
		this.resultat = resultat;
		this.id1 = id1;
		this.id2 = id2;
		this.date_st = date_st;
		this.satut_st = satut_st;
	}
	
	
	public Sondage_tBean(String type_st, int resultat, int id1, int id2, Date date_st, int satut_st, int total_st) {
		super();
		this.type_st = type_st;
		this.resultat = resultat;
		this.id1 = id1;
		this.id2 = id2;
		this.date_st = date_st;
		this.satut_st = satut_st;
		this.total_st = total_st;
	}


	public Sondage_tBean(int id1, int id2) {
		super();
		this.id1 = id1;
		this.id2 = id2;
	}
	public int getIdsondage_titre() {
		return idsondage_titre;
	}
	public void setIdsondage_titre(int idsondage_titre) {
		this.idsondage_titre = idsondage_titre;
	}
	public String getType_st() {
		return type_st;
	}
	public void setType_st(String type_st) {
		this.type_st = type_st;
	}
	public int getResultat() {
		return resultat;
	}
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	public int getId1() {
		return id1;
	}
	public void setId1(int id1) {
		this.id1 = id1;
	}
	public int getId2() {
		return id2;
	}
	public void setId2(int id2) {
		this.id2 = id2;
	}
	public Date getDate_st() {
		return date_st;
	}
	public void setDate_st(Date date_st) {
		this.date_st = date_st;
	}
	public int getSatut_st() {
		return satut_st;
	}
	public void setSatut_st(int satut_st) {
		this.satut_st = satut_st;
	}


	public int getTotal_st() {
		return total_st;
	}


	public void setTotal_st(int total_st) {
		this.total_st = total_st;
	}

}
