package com.cisco.test.com.cisco.test.java.Controller;

import java.util.List;

import com.cisco.test.com.cisco.test.java.Model.book;
import com.cisco.test.com.cisco.test.java.Repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class bookController {


        @Autowired
        private bookRepository bookRepository;

        @GetMapping("/health")
        public String home(){
            return "Hello! This is My First AWS Deployment to EC2!!";
        }

        @PostMapping("/books")
        public book addBook(@RequestBody book Book) {
            return bookRepository.save(Book);
        }


        @GetMapping("/books")
        public ResponseEntity<List<book>> getAllBooks() {
            return ResponseEntity.ok(bookRepository.findAll());
        }


}
