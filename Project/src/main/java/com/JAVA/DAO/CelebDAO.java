package com.JAVA.DAO;

import java.util.List;

import com.JAVA.Beans.CelebBean;

public interface CelebDAO {
	void create(CelebBean Celeb ) throws DAOException;
	 void delete(int id ) throws DAOException;
	 void update(String photo)  throws DAOException;
	 CelebBean find(int id ) throws DAOException;
	 List < CelebBean> getAllCelebs() throws DAOException;
	 CelebBean logtest(String login,String password) throws DAOException;
}
