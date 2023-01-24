package com.JAVA.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.JAVA.Beans.MovieBean;



public class MovieDaoImpl implements MovieDAO{
	private DAOFactory  daoFactory;

    public MovieDaoImpl ( DAOFactory daoFactory ) {
        this.daoFactory = daoFactory;
       
    }
    private static MovieBean map( ResultSet resultSet ) throws SQLException {
    	MovieBean movie =new MovieBean(0,null,null,null,null,0,0);
    	movie.setIdmovie( resultSet.getInt( "idmovie" ) );
    	movie.setNom_movie( resultSet.getString( "nom_movie" ) );
    	movie.setDesc_movie( resultSet.getString( "desc_movie" ) );
    	movie.setMovie_date( resultSet.getDate( "movie_date" ) );
    	movie.setMovie_image( resultSet.getString( "movie_image" ) );
    	movie.setMovie_star( resultSet.getInt( "movie_star" ) );
    	movie.setId_celeb( resultSet.getInt( "id_celeb" ) );
		return movie;
		}
    public static PreparedStatement initRequestPrepare( Connection connexion, String sql, Object... objets ) throws SQLException {
	    PreparedStatement preparedStatement = connexion.prepareStatement( sql );
	    for ( int i = 0; i < objets.length; i++ ) {
	        preparedStatement.setObject( i + 1, objets[i] );
	    }
	    return preparedStatement;
	}

	@Override
	public void create(MovieBean Movie) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_INSERT = "INSERT INTO movie(nom_movie,desc_movie,movie_date,movie_image,movie_star,id_celeb)VALUES(?,?,?,?,?,?)";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
		try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	        preparedStatement=connexion.prepareStatement(SQL_INSERT);
	        preparedStatement.setString(1,Movie.getNom_movie());
	        preparedStatement.setString(2,Movie.getDesc_movie());
	        preparedStatement.setDate(3,Movie.getMovie_date());
	        preparedStatement.setString(4,Movie.getMovie_image());
	        preparedStatement.setInt(5,Movie.getMovie_star());
	        preparedStatement.setInt(6,Movie.getId_celeb());
	        preparedStatement.executeUpdate();
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }
	}

	@Override
	public MovieBean find(int id) throws DAOException {
		// TODO Auto-generated method stub
		final String SQL_SELECT_PAR_ID = "SELECT * FROM movie WHERE idmovie=?";
	    Connection connexion = null;
	    PreparedStatement preparedStatement = null;
	    ResultSet resultSet = null;
	    MovieBean movie = null;

	    try {
	        /* Récupération d'une connexion depuis la Factory */
	        connexion = daoFactory.getConnection();
	       // preparedStatement = initRequestPrepare( connexion, SQL_SELECT_PAR_CIN, cin );
	        preparedStatement = connexion.prepareStatement(SQL_SELECT_PAR_ID);
	        preparedStatement.setInt(1,id);
	        resultSet =  preparedStatement.executeQuery();
	        /* Parcours de la ligne de données de l'éventuel ResulSet retourné */
	        if ( resultSet.next() ) {
	        	movie = map( resultSet );
	        }
	    } catch ( SQLException e ) {
	        throw new DAOException( e );
	    } finally {
	        //ClosingAll( resultSet, preparedStatement, connexion );
	    }

	    return movie;
	}

	@Override
	public List<MovieBean> getAllMovies() throws DAOException {
		// TODO Auto-generated method stub
		 List <  MovieBean > movies = new ArrayList < >();
			
		    final String SQL_SELECT_ALL = "SELECT * FROM movie";
		    Connection connexion = null;
		    PreparedStatement preparedStatement = null;
		    ResultSet resultSet = null;
		    MovieBean movie = null;

		    try {
		        /* Récupération d'une connexion depuis la Factory */
		        connexion = daoFactory.getConnection();
		        
		       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
		       resultSet = preparedStatement.executeQuery();
		       
		        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
		        while ( resultSet.next() ) {
		        	movie  = map( resultSet );
		        	movies.add(movie);
		        }
		    } catch ( SQLException e ) {
		        throw new DAOException( e );
		    } finally {
		        //ClosingAll( resultSet, preparedStatement, connexion );
		    }

		    return movies;
	}
	@Override
	public List<MovieBean> getAllCeleb_Movies(int id) throws DAOException {
		// TODO Auto-generated method stub
		 List <  MovieBean > movies = new ArrayList < >();
			
		    final String SQL_SELECT_ALL = "SELECT * FROM movie WHERE id_celeb=? ORDER BY movie_star DESC";
		    Connection connexion = null;
		    PreparedStatement preparedStatement = null;
		    ResultSet resultSet = null;
		    MovieBean movie = null;

		    try {
		        /* Récupération d'une connexion depuis la Factory */
		        connexion = daoFactory.getConnection();
		        
		       preparedStatement = initRequestPrepare( connexion, SQL_SELECT_ALL);
		       preparedStatement.setInt(1,id);
		       resultSet = preparedStatement.executeQuery();
		       
		        /* Parcours de la ligne de dosnnées de l'éventuel ResulSet retourné */  
		        while ( resultSet.next() ) {
		        	movie  = map( resultSet );
		        	movies.add(movie);
		        }
		    } catch ( SQLException e ) {
		        throw new DAOException( e );
		    } finally {
		        //ClosingAll( resultSet, preparedStatement, connexion );
		    }

		    return movies;
	}

}
