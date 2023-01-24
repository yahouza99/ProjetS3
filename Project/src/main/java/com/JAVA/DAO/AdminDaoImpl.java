package com.JAVA.DAO;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.JAVA.Beans.AdminBean;

public class AdminDaoImpl implements AdminDAO {
	private DAOFactory  daoFactory;

    public AdminDaoImpl ( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    private static AdminBean map( ResultSet resultSet ) throws SQLException {
    	AdminBean admin =new AdminBean(0,null,null,null,null);
    	admin.setIdAdministrateur( resultSet.getInt( "idAdministrateur" ) );
    	admin.setLogin( resultSet.getString( "login" ) );
    	admin.setPassword( resultSet.getString( "password" ) );
    	admin.setNom( resultSet.getString( "nom" ) );
    	admin.setPrenom( resultSet.getString( "prenom" ) );		
		return admin;
		}
    public static PreparedStatement initRequestPrepare( Connection connexion, String sql, Object... objets ) throws SQLException {
	    PreparedStatement preparedStatement = connexion.prepareStatement( sql );
	    for ( int i = 0; i < objets.length; i++ ) {
	        preparedStatement.setObject( i + 1, objets[i] );
	    }
	    return preparedStatement;
	}
    

	@Override
	public void create(AdminBean Admin) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(AdminBean Admin) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdminBean find(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminBean> getAllFreelancers() throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public AdminBean logtest(String login, String password) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_POUR_LOG = "SELECT * FROM administrateur WHERE login=? AND password=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    AdminBean  admin = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_POUR_LOG);
	        preparedStatement.setString(1,login);
	        preparedStatement.setString(2,password);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	admin= map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return admin;
	}
	
	

}
