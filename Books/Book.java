public abstract class Book {
    protected String title;
    protected String ISBN;
    protected Integer year;
    protected double price;
    
    public Book(String title, String ISBN, Integer year, Integer price) {
        this.title = title;
        this.ISBN = ISBN;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    
    public String getISBN() {
        return ISBN;
    }

    public Integer getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    
    public abstract boolean isDemoBook();
}
