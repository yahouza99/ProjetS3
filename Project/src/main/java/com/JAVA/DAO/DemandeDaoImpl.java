package com.JAVA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.JAVA.Beans.DemandeBean;

public class DemandeDaoImpl implements DemandeDAO{
	private DAOFactory  daoFactory;

    public DemandeDaoImpl ( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
    }
    
    private static DemandeBean map( ResultSet resultSet ) throws SQLException {
    	DemandeBean demande =new DemandeBean(0,null,null,null,null,0,0,null,0);
    	demande.setIddemande( resultSet.getInt( "iddemande" ) );
    	demande.setType_demande( resultSet.getString( "type_demande" ) );
    	demande.setMotif_demande(resultSet.getString( "motif_demande" ));
    	demande.setContenu(resultSet.getString( "contenu" ));
    	demande.setDate_demande(resultSet.getDate( "date_demande" ));
    	demande.setIdf(resultSet.getInt( "idf" ));
    	demande.setIdc(resultSet.getInt( "idc" ));
    	demande.setMot_celeb(resultSet.getString( "mot_celeb" ));
    	demande.setStatut_demande(resultSet.getInt( "statut_demande" ));
		return demande;
		}
    public static PreparedStatement initRequestPrepare( Connection connexion, String sql, Object... objets ) throws SQLException {
	    PreparedStatement preparedStatement = connexion.prepareStatement( sql );
	    for ( int i = 0; i < objets.length; i++ ) {
	        preparedStatement.setObject( i + 1, objets[i] );
	    }
	    return preparedStatement;
	}

	@Override
	public void create(DemandeBean Demande) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_INSERT = "INSERT INTO demande(type_demande,motif_demande,idf,idc) VALUES(?,?,?,?)";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
		try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement=connexion.prepareStatement(SQL_INSERT);
	        preparedStatement.setString(1, Demande.getType_demande());
	        preparedStatement.setString(2,Demande.getMotif_demande());
	        preparedStatement.setInt(3,Demande.getIdf());
	        preparedStatement.setInt(4,Demande.getIdc());
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
		final String SQL_DELETE = "DELETE FROM demande WHERE iddemande=?;";
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
	public void update(int statut,String contenu, String mot,int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_UPDATE ="UPDATE demande SET statut_demande=?,contenu=?,mot_celeb=? WHERE iddemande=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement = connexion.prepareStatement(SQL_UPDATE);
	        preparedStatement.setInt(1,statut);
	        preparedStatement.setString(2,contenu);
	        preparedStatement.setString(3,mot);
	        preparedStatement.setInt(4,id);
	        preparedStatement.executeUpdate(); 
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    } 
	}

	@Override
	public DemandeBean find(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM demande WHERE iddemande=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    DemandeBean demande = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        preparedStatement.setInt(1,id);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	demande = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return demande;
	}

	@Override
	public List<DemandeBean> getAllDemandes() throws DAOException {
		// TODO Auto-generated method stub
List <  DemandeBean > demandes = new ArrayList < >();
		
	    final String SQL_SELECT_ALL = "SELECT * FROM demande";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    DemandeBean demande = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        
	       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
	       resultSet = preparedStatement.executeQuery();
	       
	        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
	        while ( resultSet.next() ) {
	        	demande = map( resultSet );
	        	demandes.add(demande);
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return demandes;
	}

}
