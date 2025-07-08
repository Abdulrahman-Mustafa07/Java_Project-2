import java.util.*;

public class Process {

    public static void add(Book book) {
        Inventory.books.put(book, Inventory.books.getOrDefault(book, 0) + 1);
    }

    public static List<Book> remove(Integer year) {
        List<Book>outDate = new ArrayList<>();

        for (Map.Entry<Book, Integer> entry : Inventory.books.entrySet()) {
            Book book = entry.getKey();
            Integer quantity = entry.getValue();
            if(book.getYear() <= year && quantity > 0) {
                outDate.add(book);
            }
        }

        for (Book book : outDate) {
            Inventory.books.remove(book);
        }

        return outDate;
    }

    public static double buy(Book book) {
        if(Inventory.books.containsKey(book) == false) throw new RuntimeException("The book " + book.getTitle() + " in not available");

        if(book.isDemoBook() == true) throw new RuntimeException("This is a Demo Book");
        
        Inventory.books.put(book,Inventory.books.get(book) - 1);
        if(Inventory.books.get(book) == 0) Inventory.books.remove(book);

        if(book instanceof PaperBook) {
            System.out.println(book.getTitle() + " to ShippingService");
        }
        
        else if (book instanceof EBook) {
            System.out.println(book.getTitle() + " to MailService");
        }
        
        return book.getPrice();
    }
}
