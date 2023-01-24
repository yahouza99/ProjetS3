package com.JAVA.DAO;

import java.util.List;

import com.JAVA.Beans.SondageBean;
import com.JAVA.Beans.Sondage_tBean;


public interface SondageDAO {
	void create(SondageBean Sondage) throws DAOException;
	void create_t(Sondage_tBean Sondage) throws DAOException;
	 void delete(int id ) throws DAOException;
	 void delete_t(int id ) throws DAOException;
	 SondageBean find(int id ) throws DAOException;
	 Sondage_tBean find_t(int id ) throws DAOException;
	 SondageBean findligne() throws DAOException;
	 Sondage_tBean find_tligne() throws DAOException;
	 List < SondageBean> getAllSondages() throws DAOException;
	 List < Sondage_tBean> getAllSondages_t() throws DAOException;
	 void update(int statu,int id)  throws DAOException;
	 void update_t(int statu,int id)  throws DAOException;
}
