package exam04;

public class Ex01 {
    public static void main(String[] args){
        Box<Apple> appleBox = new Box ();
        appleBox.put(new Apple());

        Apple apple = appleBox.get();
        apple.showInfo();

        //Apple apple = appleBox.get();
        //apple.showInfo();

        Box<Melon> melonBox = new Box();
        melonBox.put(new Melon());
        melonBox.showInfo();
    }
}
