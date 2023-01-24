package com.JAVA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.JAVA.Beans.SondageBean;
import com.JAVA.Beans.Sondage_tBean;

public class SondageDaoImpl implements SondageDAO{
	private DAOFactory  daoFactory;

    public SondageDaoImpl ( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    private static SondageBean map( ResultSet resultSet ) throws SQLException {
    	SondageBean sondage =new SondageBean(0,null,0,0,0,null,0);
    	sondage.setIdsondage( resultSet.getInt( "idsondage" ) );
    	sondage.setType_sondage( resultSet.getString( "type_sondage" ) );
    	sondage.setId1( resultSet.getInt( "id1" ) );
    	sondage.setId2( resultSet.getInt( "id2" ) );
    	sondage.setDate_sondage( resultSet.getDate( "date_sondage" ) );
    	sondage.setResultat( resultSet.getInt( "resultat" ) );
    	sondage.setSatut_sondage( resultSet.getInt( "satut_sondage" ) );
    	sondage.setTotal(resultSet.getInt( "total" ));
		return sondage;
		}
    private static Sondage_tBean mapt( ResultSet resultSet ) throws SQLException {
    	Sondage_tBean sondage =new Sondage_tBean(0,null,0,0,0,null,0);
    	sondage.setIdsondage_titre( resultSet.getInt( "idsondage_titre" ) );
    	sondage.setType_st( resultSet.getString( "type_st" ) );
    	sondage.setResultat( resultSet.getInt( "resultat" ) );
    	sondage.setId1( resultSet.getInt( "id1" ) );
    	sondage.setId2( resultSet.getInt( "id2" ) );
    	sondage.setDate_st( resultSet.getDate( "date_st" ) );
    	sondage.setSatut_st( resultSet.getInt( "satut_st" ) );
    	sondage.setTotal_st(resultSet.getInt( "total_st" ));
		return sondage;
		}
    public static PreparedStatement initRequestPrepare( Connection connexion, String sql, Object... objets ) throws SQLException {
	    PreparedStatement preparedStatement = connexion.prepareStatement( sql );
	    for ( int i = 0; i < objets.length; i++ ) {
	        preparedStatement.setObject( i + 1, objets[i] );
	    }
	    return preparedStatement;
	}


	@Override
	public void create(SondageBean Sondage) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_INSERT = "INSERT INTO sondage(id1,id2)VALUES(?,?)";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
		try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement=connexion.prepareStatement(SQL_INSERT); 
	        preparedStatement.setInt(1,Sondage.getId1());
	        preparedStatement.setInt(2,Sondage.getId2());
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
		final String SQL_DELETE = "DELETE FROM sondage WHERE idsondage=?;";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = connexion.prepareStatement(SQL_DELETE);
	        preparedStatement.setInt(1, id);
	        preparedStatement.executeUpdate(); 
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }
	}

	@Override
	public SondageBean find(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM sondage WHERE idsondage=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    SondageBean sondage = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        preparedStatement.setInt(1,id);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	sondage = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return sondage;
	}

	@Override
	public List<SondageBean> getAllSondages() throws DAOException {
		// TODO Auto-generated method stub
        List <  SondageBean > sondages = new ArrayList < >();
		
	    final String SQL_SELECT_ALL = "SELECT * FROM Sondage";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    SondageBean sondage = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        
	       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
	       resultSet = preparedStatement.executeQuery();
	       
	        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
	        while ( resultSet.next() ) {
	        	sondage = map( resultSet );
	        	sondages.add(sondage);
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return sondages;
	}
	@Override
	public void create_t(Sondage_tBean Sondage) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_INSERT = "INSERT INTO sondage_titre(id1,id2)VALUES(?,?)";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
		try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement=connexion.prepareStatement(SQL_INSERT);
	        preparedStatement.setInt(1,Sondage.getId1());
	        preparedStatement.setInt(2,Sondage.getId2());
	       
	        preparedStatement.executeUpdate();
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }
	}
	@Override
	public void delete_t(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_DELETE = "DELETE FROM sondage_titre WHERE idsondage_titre=?;";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = connexion.prepareStatement(SQL_DELETE);
	        preparedStatement.setInt(1, id);
	        preparedStatement.executeUpdate(); 
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }
	}
	@Override
	public Sondage_tBean find_t(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM sondage_titre WHERE idsondage_titre=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    Sondage_tBean sondage = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        preparedStatement.setInt(1,id);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	sondage = mapt( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return sondage;
	}
	@Override
	public List<Sondage_tBean> getAllSondages_t() throws DAOException {
		// TODO Auto-generated method stub
List <  Sondage_tBean > sondages = new ArrayList < >();
		
	    final String SQL_SELECT_ALL = "SELECT * FROM Sondage_titre";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    Sondage_tBean sondage = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        
	       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
	       resultSet = preparedStatement.executeQuery();
	       
	        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
	        while ( resultSet.next() ) {
	        	sondage = mapt( resultSet );
	        	sondages.add(sondage);
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return sondages;
	}
	@Override
	public void update(int statu,int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_UPDATE ="UPDATE sondage SET satut_sondage=? WHERE idsondage=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = connexion.prepareStatement(SQL_UPDATE);
	        preparedStatement.setInt(1,statu);
	        preparedStatement.setInt(2,id);
	        preparedStatement.executeUpdate(); 
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }  
		
	}
	@Override
	public void update_t(int statu,int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_UPDATE ="UPDATE sondage_titre SET satut_st=? WHERE idsondage_titre=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = connexion.prepareStatement(SQL_UPDATE);
	        preparedStatement.setInt(1,statu);
	        preparedStatement.setInt(2,id);
	        preparedStatement.executeUpdate(); 
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }  
	}

	public SondageBean findligne() throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM sondage WHERE satut_sondage=1";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    SondageBean sondage = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	sondage = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }
	    return sondage;
	}
	@Override
	public Sondage_tBean find_tligne() throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM sondage_titre WHERE satut_st=1";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    Sondage_tBean sondage = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	sondage = mapt( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return sondage;
	}

}
