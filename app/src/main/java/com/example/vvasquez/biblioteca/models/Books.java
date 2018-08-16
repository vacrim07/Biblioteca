package com.example.vvasquez.biblioteca.models;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Books {
    @SerializedName("Error")private ArrayList<Book> error;
    @SerializedName("Time")private ArrayList<Book> time;
    @SerializedName("Total")private ArrayList<Book> total;
    @SerializedName("Page")private ArrayList<Book> page;
    @SerializedName("Books")private ArrayList<Book> books;

    public Books() {
    }

    public void setError(ArrayList<Book> error) {
        this.error = error;
    }

    public void setTime(ArrayList<Book> time) {
        this.time = time;
    }

    public void setTotal(ArrayList<Book> total) {
        this.total = total;
    }

    public void setPage(ArrayList<Book> page) {
        this.page = page;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getError() {
        return error;
    }

    public ArrayList<Book> getTime() {
        return time;
    }

    public ArrayList<Book> getTotal() {
        return total;
    }

    public ArrayList<Book> getPage() {
        return page;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
