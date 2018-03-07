package com.book.store.controller.entity;

public class Book {

    private String name;
    private String author;
    private Integer id;
    private double rating;
    private boolean available;


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BookDAOEntity{");
        sb.append("name='").append(name).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", id=").append(id);
        sb.append(", rating=").append(rating);
        sb.append(", available=").append(available);
        sb.append('}');
        return sb.toString();
    }
}
