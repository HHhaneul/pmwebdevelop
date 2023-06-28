package exam01;

import java.util.Optional;

public class Ex07 {
    public static void main(String[] args){
        Book book = null;
        Optional<Book> opt = Optional.ofNullable(book);
        //Book book2 = opt.orElseGet(() -> new Book());
        Book book2 = opt.orElseGet(Book::new); // 위와 동일한 값 람다식
        System.out.println(book2);
    }
}
