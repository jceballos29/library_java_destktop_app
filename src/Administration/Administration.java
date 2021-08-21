/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administration;

import Classes.Author;
import Classes.Book;
import java.util.ArrayList;

/**
 *
 * @author jcebalus
 */
public class Administration {
    
    ArrayList<Author> authors = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>();
    
    public void addAuthor(Author author){
        System.out.println(author.toString());
        authors.add(author);
    }
    
    public int getAuthorsSize(){
        return authors.size();
    }
    
    public Author getAuthor(String name){
        Author author = null;
        for(int i = 0; i < authors.size(); i++){
            if(authors.get(i).getName().equals(name)){
                author = authors.get(i);
            }
        }
        return author;
    }
    
    public void getAllAuthorsName(){
        //ArrayList<String> authors_name = new ArrayList<>();
        for(int i = 0; i < authors.size(); i++){
            //authors_name.add(authors.get(i).getName());
            String author_name = authors.get(i).getName();
            System.out.println(author_name);
        }
        //return authors_name;
    }
    
    public void addBook(Book book){
        System.out.println(book.toString());
        books.add(book);
    }
    
    public int getBooksSize(){
        return books.size();
    }
}
