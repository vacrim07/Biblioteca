package com.example.vvasquez.biblioteca;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.vvasquez.biblioteca.models.Book;

import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.ViewHolder> {

    private List<Book> books;

    public BooksAdapter(List<Book> books) {
        this.books = books;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.content_books, viewGroup, false);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Book book = books.get(i);
        viewHolder.setClickListener();
        viewHolder.bookButton.setText(book.getTitle());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public Button bookButton;
        Context context;

        public ViewHolder(View v) {
            super(v);
            context = v.getContext();
            bookButton = (Button) v.findViewById(R.id.bookButton);
        }

        public void setClickListener(){
            bookButton.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            // Aqui se abre la actividad de book
        }
    }
}
