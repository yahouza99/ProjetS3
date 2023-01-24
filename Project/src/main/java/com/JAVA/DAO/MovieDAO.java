package com.JAVA.DAO;

import java.util.List;

import com.JAVA.Beans.MovieBean;



public interface MovieDAO {
	void create(MovieBean Movie ) throws DAOException;
	MovieBean find(int id ) throws DAOException;
	List < MovieBean > getAllMovies() throws DAOException;
	List < MovieBean > getAllCeleb_Movies(int id) throws DAOException;
}
