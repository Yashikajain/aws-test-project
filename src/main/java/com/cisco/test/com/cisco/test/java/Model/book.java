package com.cisco.test.com.cisco.test.java.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Books")
public class book {

    private String title;
    private String Author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
