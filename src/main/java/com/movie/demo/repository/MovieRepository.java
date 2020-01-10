package com.movie.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movie.demo.entity.MovieInfo;

@Repository
public interface MovieRepository extends JpaRepository<MovieInfo, Integer> {

	
	@Query("select m from MovieInfo m where id=:id")
	public MovieInfo findById(@Param("id") int id);
}



