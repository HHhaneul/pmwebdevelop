package exam02;

public class Ex02 {

    public static void main(String[] args){
            MyThread myThread = new MyThread();
            myThread.start();

        for (int i = 1; i < 11; i++){
            System.out.println("main: " + i);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        // 실행될 작업 내용
        for (int i = 1; i < 11; i++){
            System.out.println("My Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
