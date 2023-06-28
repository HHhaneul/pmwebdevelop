package exam1;

import java.util.function.Supplier;

public class Book {
    private String title;
    private String author;

    public Book (String title, String author){
        this.title = title;
        this.author = author;
    }
        public void printInfo(){
            Supplier<String> supplier = this::showInfo;
            System.out.println(showInfo());
        }
        public String showInfo(){
            return String.format("title= %s, author= %s%n", title, author);
    }

}
