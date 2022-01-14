/**
 * 
 */
package com.devsuperior.ssmovie.repositories;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ssmovie.entities.Movie;

/**
 * @author sabrina
 *
 */
public interface MovieRepository extends JpaRepository<Movie, Long>{

	

}
