class Main {
    public static void main(String[] args) throws java.lang.Exception {

        Book book1 = new PaperBook("War", "123", 2020, 150, 20);
        Book book2 = new EBook("Nice", "124", 2013, 120, "PDF");

        Process.add(book1);
        Process.add(book2);

        for(Book book : Process.remove(2015)) {
            System.out.println(book.getTitle());
        }
        
        System.out.println(Process.buy(book1));
        System.out.println(Process.buy(book2));
    }
}
