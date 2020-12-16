package com.restuarent.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.restuarent.model.Grade;

public interface GradeResposigory extends MongoRepository<Grade, String> {

}