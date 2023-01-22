package com.devdanmovieproject.movie.repository;

import com.devdanmovieproject.movie.model.Movie;
import com.devdanmovieproject.movie.model.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {

}
