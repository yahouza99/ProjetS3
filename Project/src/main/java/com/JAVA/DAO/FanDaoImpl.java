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
    	FanBean fan =new FanBean(0,null,null,null,null,null,null,null,null);
    	fan.setId( resultSet.getInt( "idfan" ) );
    	fan.setLogin( resultSet.getString( "login" ) );
    	fan.setPassword( resultSet.getString( "password" ) );
    	fan.setNom( resultSet.getString( "nom" ) );
    	fan.setPrenom( resultSet.getString( "prenom" ) );
    	fan.setNationalite( resultSet.getString( "nationalite" ) );
    	fan.setSexe( resultSet.getString( "sexe" ) );
    	fan.setEmail( resultSet.getString( "email" ) );
    	fan.setPhoto( resultSet.getString( "photo" ) );
    	fan.setType(resultSet.getString( "type" ));
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
		final String SQL_INSERT = "INSERT INTO fan(login,password,nom,prenom,nationalite,sexe,email) VALUES(?,?,?,?,?,?,?)";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
		try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement=connexion.prepareStatement(SQL_INSERT);
	        preparedStatement.setString(1, Fan.getLogin());
	        preparedStatement.setString(2,Fan.getPassword());
	        preparedStatement.setString(3,Fan.getNom());
	        preparedStatement.setString(4,Fan.getPrenom());
	        preparedStatement.setString(5,Fan.getNationalite());
	        preparedStatement.setString(6,Fan.getSexe());
	        preparedStatement.setString(7,Fan.getEmail());
	        preparedStatement.executeUpdate();
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }
		
	}

	@Override
	public void delete(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_DELETE = "DELETE FROM fan WHERE idfan=?;";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = connexion.prepareStatement(SQL_DELETE);
	        preparedStatement.setLong(1, id);
	        preparedStatement.executeUpdate(); 
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }
	}

	@Override
	public void update(String photo) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_UPDATE ="UPDATE fan SET photo=? WHERE idfan=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = connexion.prepareStatement(SQL_UPDATE);
	        preparedStatement.setString(1,photo);
	        preparedStatement.executeUpdate(); 
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }      
	}

	@Override
	public FanBean find(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM fan WHERE idfan=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    FanBean fan = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        preparedStatement.setInt(1,id);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	fan = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return fan;
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
	@Override
	public FanBean logtest(String login, String password) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_POUR_LOG = "SELECT * FROM fan WHERE login=? AND password=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    FanBean fan = null;

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
	        	fan = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return fan;
	}

}
