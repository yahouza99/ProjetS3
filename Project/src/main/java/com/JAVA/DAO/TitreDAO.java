package com.JAVA.DAO;

import java.util.List;

import com.JAVA.Beans.TitreBean;



public interface TitreDAO {
	void create(TitreBean Titre) throws DAOException;
	 TitreBean find(int id ) throws DAOException;
	 List < TitreBean > getAllTitres() throws DAOException;
	 List < TitreBean > getAllCeleb_Titres(int id) throws DAOException;
}
