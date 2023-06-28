package exam04;

public class Box<T extends Fruit> {

    private T item;

    public void put(T item){
        this.item = item;
    }

    public T get(){
        return item;
    }
    public void showInfo(){
        item.showInfo();
    }
}
