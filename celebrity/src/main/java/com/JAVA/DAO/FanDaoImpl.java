package com.JAVA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.JAVA.Beans.FanBean;

public class FanDaoImpl implements FanDAO {
	private DAOFactory  daoFactory;

    public FanDaoImpl ( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    private static FanBean map( ResultSet resultSet ) throws SQLException {
    	FanBean fan =new FanBean(0,null,null,null,null);
    	fan.setId( resultSet.getInt( "idfan" ) );
    	fan.setLogin( resultSet.getString( "login" ) );
    	fan.setPassword( resultSet.getString( "password" ) );
    	fan.setNom( resultSet.getString( "nom" ) );
    	fan.setPrenom( resultSet.getString( "prenom" ) );		
		return fan ;
		}
    public static PreparedStatement initRequestPrepare( Connection connexion, String sql, Object... objets ) throws SQLException {
	    PreparedStatement preparedStatement = connexion.prepareStatement( sql );
	    for ( int i = 0; i < objets.length; i++ ) {
	        preparedStatement.setObject( i + 1, objets[i] );
	    }
	    return preparedStatement;
	}
    

	@Override
	public void create(FanBean Fan) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(FanBean Fan) throws DAOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public FanBean find(int id) throws DAOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FanBean> getAllFans() throws DAOException {
		 List <  FanBean > fans = new ArrayList < >();
			
		    final String SQL_SELECT_ALL = "SELECT * FROM fan";
		    Connection connexion = null;
		    PreparedStatement preparedStatement = null;
		    ResultSet resultSet = null;
		    FanBean fan = null;

		    try {
		        /* Récupération d'une connexion depuis la Factory */
		        connexion = daoFactory.getConnection();
		        
		       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
		       resultSet = preparedStatement.executeQuery();
		       
		        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
		        while ( resultSet.next() ) {
		        	fan = map( resultSet );
		        	fans.add(fan);
		        }
		    } catch ( SQLException e ) {
		        throw new DAOException( e );
		    } finally {
		        //ClosingAll( resultSet, preparedStatement, connexion );
		    }

		    return fans;
	}

}
