public class PaperBook extends Book {
    private double weight;
     public PaperBook(String title, String ISBN, Integer year, Integer price,  double weight) {
         super(title, ISBN, year, price);
         this.weight = weight;
     }

     public double getWeight() {
        return weight;
     }

     public boolean isDemoBook() {
        return false;
     }
}
