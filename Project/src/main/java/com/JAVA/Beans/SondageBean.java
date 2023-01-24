package com.JAVA.Beans;

import java.sql.Date;

public class SondageBean {
	private int idsondage;
	private String type_sondage;
	private int id1;
	private int id2;
	private int resultat;
	private Date date_sondage;
	private int satut_sondage;
	private int total;
	
	public SondageBean(int idsondage, String type_sondage, int id1, int id2, int resultat, Date date_sondage,
			int satut_sondage) {
		super();
		this.idsondage = idsondage;
		this.type_sondage = type_sondage;
		this.id1 = id1;
		this.id2 = id2;
		this.resultat = resultat;
		this.date_sondage = date_sondage;
		this.satut_sondage = satut_sondage;
	}
    

	public SondageBean(String type_sondage, int id1, int id2, int resultat, Date date_sondage, int satut_sondage,
			int total) {
		super();
		this.type_sondage = type_sondage;
		this.id1 = id1;
		this.id2 = id2;
		this.resultat = resultat;
		this.date_sondage = date_sondage;
		this.satut_sondage = satut_sondage;
		this.total = total;
	}




	public SondageBean(int id1, int id2) {
		super();
		this.id1 = id1;
		this.id2 = id2;
	}


	public int getIdsondage() {
		return idsondage;
	}
	public void setIdsondage(int idsondage) {
		this.idsondage = idsondage;
	}
	public String getType_sondage() {
		return type_sondage;
	}
	public void setType_sondage(String type_sondage) {
		this.type_sondage = type_sondage;
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
	public int getResultat() {
		return resultat;
	}
	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
	public Date getDate_sondage() {
		return date_sondage;
	}
	public void setDate_sondage(Date date_sondage) {
		this.date_sondage = date_sondage;
	}
	public int getSatut_sondage() {
		return satut_sondage;
	}
	public void setSatut_sondage(int satut_sondage) {
		this.satut_sondage = satut_sondage;
	}


	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

}
