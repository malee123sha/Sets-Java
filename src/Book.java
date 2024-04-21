import java.util.LinkedHashSet;
public class Book {
    int id,qty;
    String name,author,publisher;
    public Book(int id,String name,String author,String publisher, int qty) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.qty = qty;
    }
}
class SetHashLinked {
    public static void main(String[] args) {
        LinkedHashSet <Book>  lhs = new LinkedHashSet<>();
        Book b1 = new Book(1234,"Java for Beginners","James Gozlin","Sun Micro System",10);
        Book b2 = new Book(5632,"The Secret Garden","Frances Burnett","Collins Classics",12);
        Book b3 = new Book(7895,"Python for Beginners","James Gozlin","Sun Micro System",20);
        lhs.add(b1);
        lhs.add(b2);
        lhs.add(b3);
        for (Book b : lhs)  {
            System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", "+b.qty);
        }
    }
}
