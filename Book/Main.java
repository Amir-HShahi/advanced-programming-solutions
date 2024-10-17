public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("hitchhiker's guide to the galaxy");
        book.setAuthor(""); //invalid input
        book.setPrice(42);
        //author input was invalid so author property is null
        System.out.println(book.getAuthor()); 

        //invalid input, so title won't change
        book.setTitle(null); 

        book.setAuthor("Douglas Adams");

        //invalid input, so price will still be 42
        book.setPrice(-10); 
        System.out.println(book);

        book.borrowBook();
        System.out.println(book);

        //You cant sell book because it has been borrowed
        book.sellBook();

        book.returnBook();
        System.out.println(book);

        book.sellBook();

        //You cant sell book because it has been sold
        book.sellBook();
        System.out.println(book);

    }
}