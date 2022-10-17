package itsjava.first.lesson_4.threadsHW;

public class ThreadMainHW {
    public static void main(String[] args) throws InterruptedException{
        ThreadHW thread1 = new ThreadHW("name", 5000);
        Runnable threadR = new RunnableHW("name2", 3000);

        Thread thread2 = new Thread(threadR);

        thread1.start();
        thread2.start();


    }
}
