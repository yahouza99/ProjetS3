package com.JAVA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.JAVA.Beans.CelebBean;;

public class CelebDaoImpl implements CelebDAO {
	private DAOFactory  daoFactory;

    public CelebDaoImpl ( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    private static CelebBean map( ResultSet resultSet ) throws SQLException {
    	CelebBean celeb =new CelebBean(0,null,null,null,null,null,null,null,null);
    	celeb.setId( resultSet.getInt( "idceleb" ) );
    	celeb.setLogin( resultSet.getString( "login" ) );
    	celeb.setPassword( resultSet.getString( "password" ) );
    	celeb.setNom( resultSet.getString( "nom" ) );
    	celeb.setPrenom( resultSet.getString( "prenom" ) );
    	celeb.setNationalite( resultSet.getString( "nationalite" ) );
    	celeb.setSexe( resultSet.getString( "sexe" ) );
    	celeb.setEmail( resultSet.getString( "email" ) );
    	celeb.setPhoto( resultSet.getString( "photo" ) );
    	celeb.setType(resultSet.getString( "type" ));
    	celeb.setInsta(resultSet.getString( "insta" ));
    	celeb.setFacebook(resultSet.getString( "facebook" ));
    	celeb.setTwiter(resultSet.getString( "twiter" ));
		return celeb ;
		}
    public static PreparedStatement initRequestPrepare( Connection connexion, String sql, Object... objets ) throws SQLException {
	    PreparedStatement preparedStatement = connexion.prepareStatement( sql );
	    for ( int i = 0; i < objets.length; i++ ) {
	        preparedStatement.setObject( i + 1, objets[i] );
	    }
	    return preparedStatement;
	}

	@Override
	public void create(CelebBean Celeb) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_INSERT = "INSERT INTO celeb(login,password,nom,prenom,nationalite,sexe,email,photo,type,"
				+ "insta,facebook,twiter)"
				+ " VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
		try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement=connexion.prepareStatement(SQL_INSERT);
	        preparedStatement.setString(1, Celeb.getLogin());
	        preparedStatement.setString(2,Celeb.getPassword());
	        preparedStatement.setString(3,Celeb.getNom());
	        preparedStatement.setString(4,Celeb.getPrenom());
	        preparedStatement.setString(5,Celeb.getNationalite());
	        preparedStatement.setString(6,Celeb.getSexe());
	        preparedStatement.setString(7,Celeb.getEmail());
	        preparedStatement.setString(8,Celeb.getPhoto());
	        preparedStatement.setString(9,Celeb.getType());
	        preparedStatement.setString(10,Celeb.getInsta());
	        preparedStatement.setString(11,Celeb.getFacebook());
	        preparedStatement.setString(12,Celeb.getTwiter());
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
		final String SQL_DELETE = "DELETE FROM celeb WHERE idceleb=?;";
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
		final String SQL_UPDATE ="UPDATE celeb SET photo=? WHERE idceleb=?";
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
	public CelebBean find(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM celeb WHERE idceleb=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    CelebBean celeb = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        preparedStatement.setInt(1,id);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	celeb = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return celeb;
	}

	@Override
	public List<CelebBean> getAllCelebs() throws DAOException {
		// TODO Auto-generated method stub
		List <  CelebBean > celebs = new ArrayList < >();
		
	    final String SQL_SELECT_ALL = "SELECT * FROM celeb";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    CelebBean celeb = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        
	       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
	       resultSet = preparedStatement.executeQuery();
	       
	        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
	        while ( resultSet.next() ) {
	        	celeb = map( resultSet );
	        	celebs.add(celeb);
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return celebs;
	}

	@Override
	public CelebBean logtest(String login, String password) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_POUR_LOG = "SELECT * FROM celeb WHERE login=? AND password=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    CelebBean  celeb = null;

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
	        	celeb= map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return celeb;
	}

}
