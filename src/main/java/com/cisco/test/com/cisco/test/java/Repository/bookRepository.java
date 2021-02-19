package com.cisco.test.com.cisco.test.java.Repository;
import com.cisco.test.com.cisco.test.java.Model.book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface bookRepository extends MongoRepository< book, Integer> {

}
