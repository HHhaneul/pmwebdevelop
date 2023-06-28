package exam01;

import java.io.*;

public class Ex02 {
    public static void main(String[] args){
        try(FileInputStream fis = new FileInputStream("book.obj");
            ObjectInputStream ois = new ObjectInputStream(fis)) {

            Book book = (Book)ois.readObject();
            System.out.println(book);

            Book book2 =  (Book)ois.readObject();
            System.out.println(book2);

            String str = (String)ois.readObject();
            System.out.println(str);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
