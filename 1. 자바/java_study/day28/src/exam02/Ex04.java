package exam02;

public class Ex04 {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();

        Thread mainThread = new MyThread();
        Thread th2 = Thread.currentThread();
        for (int i = 1; i < 11; i++){
            System.out.println(th2.getName() + " : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    class MyThread2 implements Runnable{

        @Override
        public void run() {
            Thread th = Thread.currentThread();
            for(int i = 1; i < 11; i++){
                System.out.println(th.getName() + " : " + i);

                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
