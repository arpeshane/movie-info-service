package com.movie.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movie.demo.entity.MovieInfo;
import com.movie.demo.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	MovieRepository movieRepo;
	
	public List<MovieInfo> getAllMovieInfo(){
		return movieRepo.findAll();
	}
	
	public void saveMovie(MovieInfo movie) {
		movieRepo.save(movie);
	}

	public MovieInfo getMovieInfoById(int id) {
		return movieRepo.findById(id);
		
	}
}
