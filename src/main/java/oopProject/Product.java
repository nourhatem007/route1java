package oopProject;

public interface Product {
    void setPrice(double price);
    double getPrice();
    void setName(String name);
    String getName();
    void setDescription(String description);
    String getDescription();
    void setAuthor(String author);
    String getAuthor();
    void setBookID(int bookID);
    int getBookID();

    boolean isAvailable();

    default String barCode() {
        return "no barcode";
    }

}
