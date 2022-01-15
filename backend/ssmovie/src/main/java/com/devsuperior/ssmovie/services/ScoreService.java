/**
 * 
 */
package com.devsuperior.ssmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.ssmovie.dto.MovieDTO;
import com.devsuperior.ssmovie.dto.ScoreDTO;
import com.devsuperior.ssmovie.entities.Movie;
import com.devsuperior.ssmovie.entities.Score;
import com.devsuperior.ssmovie.entities.User;
import com.devsuperior.ssmovie.repositories.MovieRepository;
import com.devsuperior.ssmovie.repositories.ScoreRepository;
import com.devsuperior.ssmovie.repositories.UserRepository;

/**
 * @author sabrina
 *
 */
@Service
public class ScoreService {

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ScoreRepository scoreRepository;
	
	@Transactional
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = userRepository.findByEmail(dto.getEmail());
		
		if(user == null) {
			user = new User();
			user.setEmail(dto.getEmail());
			user = userRepository.saveAndFlush(user);
		}
		
		Movie movie = movieRepository.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		score = scoreRepository.saveAndFlush(score);
		
		double sum = 0;
		for (Score s : movie.getScores()) {
			sum =+ s.getValue();
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie  = movieRepository.save(movie);
		
		return new MovieDTO(movie);
	}
	
	
}