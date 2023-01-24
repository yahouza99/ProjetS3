package com.JAVA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.JAVA.Beans.TitreBean;

public class TitreDaoImpl implements TitreDAO{
	private DAOFactory  daoFactory;

    public TitreDaoImpl ( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
        
    }
    private static TitreBean map( ResultSet resultSet ) throws SQLException {
    	TitreBean titre =new TitreBean(0,null,null,null,0,0);
    	titre.setIdtitre( resultSet.getInt( "idtitre" ) );
    	titre.setLabel_titre( resultSet.getString( "label_titre" ) );
    	titre.setImage_titre( resultSet.getString( "image_titre" ) );
    	titre.setAlbum_titre( resultSet.getString( "album_titre" ) );
    	titre.setTitre_stare( resultSet.getInt( "titre_stare" ) );
    	titre.setId_celeb( resultSet.getInt( "id_celeb" ) );
    	titre.setDate_titre( resultSet.getDate( "date_titre" ) );
		return titre;
		}
    public static PreparedStatement initRequestPrepare( Connection connexion, String sql, Object... objets ) throws SQLException {
	    PreparedStatement preparedStatement = connexion.prepareStatement( sql );
	    for ( int i = 0; i < objets.length; i++ ) {
	        preparedStatement.setObject( i + 1, objets[i] );
	    }
	    return preparedStatement;
	}

	@Override
	public void create(TitreBean Titre) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_INSERT = "INSERT INTO titre(label_titre,image_titre,album_titre,titre_stare,id_celeb,date_titre)VALUES(?,?,?,?,?,?)";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
		try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement=connexion.prepareStatement(SQL_INSERT);
	        preparedStatement.setString(1,Titre.getLabel_titre());
	        preparedStatement.setString(2,Titre.getImage_titre());
	        preparedStatement.setString(3,Titre.getAlbum_titre());
	        preparedStatement.setInt(4,Titre.getTitre_stare());
	        preparedStatement.setInt(5,Titre.getId_celeb());
	        preparedStatement.executeUpdate();
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }
	}

	@Override
	public TitreBean find(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM titre WHERE idtitre=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    TitreBean titre = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        preparedStatement.setInt(1,id);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	titre = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return titre;
	}

	@Override
	public List<TitreBean> getAllTitres() throws DAOException {
		// TODO Auto-generated method stub
		 List < TitreBean > titres = new ArrayList < >();
			
		    final String SQL_SELECT_ALL = "SELECT * FROM titre";
		    Connection connexion = null;
		    PreparedStatement preparedStatement = null;
		    ResultSet resultSet = null;
		    TitreBean titre = null;

		    try {
		        /* Récupération d'une connexion depuis la Factory */
		        connexion = daoFactory.getConnection();
		        
		       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
		       resultSet = preparedStatement.executeQuery();
		       
		        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
		        while ( resultSet.next() ) {
		        	titre  = map( resultSet );
		        	titres.add(titre);
		        }
		    } catch ( SQLException e ) {
		        throw new DAOException( e );
		    } finally {
		        //ClosingAll( resultSet, preparedStatement, connexion );
		    }

		    return titres;
	}
	@Override
	public List<TitreBean> getAllCeleb_Titres(int id) throws DAOException {
		// TODO Auto-generated method stub
		 List < TitreBean > titres = new ArrayList < >();
			
		    final String SQL_SELECT_ALL = "SELECT * FROM titre WHERE id_celeb=? ORDER BY titre_stare DESC";
		    Connection connexion = null;
		    PreparedStatement preparedStatement = null;
		    ResultSet resultSet = null;
		    TitreBean titre = null;

		    try {
		        /* Récupération d'une connexion depuis la Factory */
		        connexion = daoFactory.getConnection();
		        
		       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
		       preparedStatement.setInt(1,id);
		       resultSet = preparedStatement.executeQuery();
		       
		        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
		        while ( resultSet.next() ) {
		        	titre  = map( resultSet );
		        	titres.add(titre);
		        }
		    } catch ( SQLException e ) {
		        throw new DAOException( e );
		    } finally {
		        //ClosingAll( resultSet, preparedStatement, connexion );
		    }

		    return titres;
	}

}
