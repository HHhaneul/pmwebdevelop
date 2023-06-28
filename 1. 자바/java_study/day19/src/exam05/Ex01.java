package exam05;

public class Ex01 {
    public static void main(String[] args){
        FruitBox<Apple> applebox = new FruitBox<>();
        applebox.add(new Apple());
        applebox.add(new Apple());
        applebox.add(new Apple());

        Juicer.make(applebox);

        FruitBox<Melon> melonbox = new FruitBox<>();
        melonbox.add(new Melon());
        melonbox.add(new Melon());
        melonbox.add(new Melon());

        Juicer.make(melonbox);

        /**
        FruitBox<Toy> toyBox = new FruitBox<>();
        toyBox.add(new Toy());

        Juicer.make(toyBox);
         */
    }
}
