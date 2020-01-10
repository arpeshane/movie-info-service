package com.movie.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.demo.entity.MovieInfo;
import com.movie.demo.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieSer;
	
	@GetMapping("movie")
	public List<MovieInfo> getMovieInfo() {
		return movieSer.getAllMovieInfo();
	}
	@PostMapping("savemovie")
	public void saveCatalog(@RequestBody MovieInfo movie) {
		movieSer.saveMovie(movie);
	}

	@GetMapping("movie/{id}")
	public MovieInfo getMovieInfoById(@PathVariable("id") int id) {
		return movieSer.getMovieInfoById(id);
	}
}
