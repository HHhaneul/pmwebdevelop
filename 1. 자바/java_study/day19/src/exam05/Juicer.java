package exam05;

import java.util.ArrayList;

public class Juicer<T> {
    private T item;
    public static void make(FruitBox<? extends Fruit> fruitBox){
        ArrayList<?> items = fruitBox.get();
        System.out.println(items);
    }

    public static <T extends Fruit> void make2 (FruitBox<T> friutBox){
        ArrayList<T> items = friutBox.get();
        System.out.println(items);
    }
    /**
    public static void make(FruitBox<?> fruitBox){
        ArrayList<?> items = fruitBox.get();
        System.out.println(items);
    }
     */
}
