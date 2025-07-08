public class EBook extends Book {
    private String fileType;
    public EBook(String title, String ISBN, Integer year, Integer price, String fileType) {
         super(title, ISBN, year, price);
         this.fileType = fileType;
     }

     public String getFileType() {
        return fileType;
     }

     public boolean isDemoBook() {
        return false;
     }
}