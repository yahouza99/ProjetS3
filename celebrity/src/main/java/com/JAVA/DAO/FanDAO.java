package com.JAVA.DAO;

import java.util.List;

import com.JAVA.Beans.FanBean;

public interface FanDAO {
	void create(FanBean Fan ) throws DAOException;
	 void delete(int id ) throws DAOException;
	 void update(FanBean Fan)  throws DAOException;
	 FanBean find(int id ) throws DAOException;
	 List < FanBean > getAllFans() throws DAOException;
}
