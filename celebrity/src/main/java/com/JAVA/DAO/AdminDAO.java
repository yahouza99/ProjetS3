package com.JAVA.DAO;

import java.util.List;

import com.JAVA.Beans.AdminBean;

public interface AdminDAO {
	void create(AdminBean Admin ) throws DAOException;
	 void delete(int id ) throws DAOException;
	 void update(AdminBean Admin)  throws DAOException;
	 AdminBean find(int id ) throws DAOException;
	 List < AdminBean > getAllFreelancers() throws DAOException;
}
