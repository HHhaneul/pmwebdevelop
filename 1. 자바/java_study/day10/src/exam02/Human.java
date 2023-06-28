package exam02;

public class Human extends Animal {
    public void readBook(){
        System.out.println("독서를 한다.");
    }
    /**
    @Override
    public void move(){
        System.out.println("두다리로 직립 보행한다.");
    }
    */

    @Override
    protected void move() {
        //super.move();
        System.out.println("두다리로 직립 보행한다.");
    }
}
