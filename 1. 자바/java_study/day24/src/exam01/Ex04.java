package exam01;

import java.util.Arrays;
import java.util.Optional;

public class Ex04 {
    public static void main(String[] args){
        Book book1 = new Book();
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
        //Book book2 = opt.orElseGet(() -> new Book()); // 같다
        Book book2 = opt.orElseGet(Book::new); // 같다
        System.out.println(book2);
        System.out.println(book1);
    }
}
