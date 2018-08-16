package com.example.vvasquez.biblioteca.models;

import com.google.gson.annotations.SerializedName;

public class Book {
    @SerializedName("Error") private String error;
    @SerializedName("Time") private String time;
    @SerializedName("ID") private String id;
    @SerializedName("Title") private String title;
    @SerializedName("SubTitle") private String subTitle;
    @SerializedName("Description") private String description;
    @SerializedName("Author") private String author;
    @SerializedName("isbn") private String isbn;
    @SerializedName("Page") private String page;
    @SerializedName("Year") private String year;
    @SerializedName("Publisher") private String publisher;
    @SerializedName("Image") private String image;
    @SerializedName("Download") private String download;

    public Book() {
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setDownload(String download) {
        this.download = download;
    }

    public String getError() {
        return error;
    }

    public String getTime() {
        return time;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPage() {
        return page;
    }

    public String getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImage() {
        return image;
    }

    public String getDownload() {
        return download;
    }
}
