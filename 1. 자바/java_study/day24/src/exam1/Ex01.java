package exam1;

import java.util.function.Supplier;

public class Ex01 {
    public static void main(String[] args){
        Book book = new Book ("책1", "저자1");
        Supplier<String> fucn = book::showInfo;

        System.out.println(fucn.get());
        book.printInfo();
        book.showInfo();
    }
}
