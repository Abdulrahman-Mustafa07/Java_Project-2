public class DemoBook extends Book {

    public DemoBook(String title, String ISBN, Integer year, Integer price) {
        super(title, ISBN, year, price);
    }

    public boolean isDemoBook() {
        return true;
     }
}
