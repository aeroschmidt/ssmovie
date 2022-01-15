/**
 * 
 */
package com.devsuperior.ssmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.ssmovie.entities.User;

/**
 * @author sabrina
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);

}
