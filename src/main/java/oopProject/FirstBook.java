package oopProject;

import java.awt.print.Book;

public class FirstBook implements Product{
    private String name;
    private double price;
    private String author;
    private String description;
    private int bookID;


    public FirstBook(double price, String name, String author, String description, int bookID) {
        setName(name);
        setPrice(price);
        setAuthor(author);
        setDescription(description);
        setBookID(bookID);

    }

    @Override
    public void setPrice(double price) {

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setDescription(String description) {

    }

    @Override
    public String getDescription() {
        return "";
    }

    @Override
    public void setAuthor(String author) {

    }

    @Override
    public String getAuthor() {
        return "";
    }

    @Override
    public void setBookID(int bookID) {

    }

    @Override
    public int getBookID() {
        return 0;
    }

    @Override
    public boolean isAvailable() {
        return false;
    }
}
