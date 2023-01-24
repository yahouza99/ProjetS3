package com.JAVA.DAO;

import java.util.List;

import com.JAVA.Beans.DemandeBean;


public interface DemandeDAO {
	void create(DemandeBean Demande ) throws DAOException;
	 void delete(int id ) throws DAOException;
	 void update(int statut,String contenu,String mot,int id)  throws DAOException;
	 DemandeBean find(int id ) throws DAOException;
	 List < DemandeBean> getAllDemandes() throws DAOException;

}
