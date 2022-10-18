package itsjava.first.lesson_4.anonym_daemons;

public class ThreadPractice {
    public static void main(String[] args) {
        Runnable anonymousRunnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("Привет из анонимного класса");
            }
        };

        anonymousRunnable.run();

        Thread thread = new Thread(anonymousRunnable);
        thread.start();

        Runnable functionRunnable = () -> System.out.println("Привет из функционального программирования");
        new Thread(functionRunnable).start();

        Runnable runnable = () ->{
            for (int i = 0; i < 5; i++) {
                System.out.println("Привет после сна в 3 секунды");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.setDaemon(true);
        thread1.start();

        System.out.println("HW____________");
        //HW
        Runnable helloRunnable = () -> System.out.println("Привет, я Runnable");
        new Thread(helloRunnable).start();

        Runnable wakeUp = () ->{
            for (int i = 0; i < 3; i++) {
                System.out.println("Привет, я проснулся после 4 секунд");
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(wakeUp);
        thread2.setDaemon(true);
        thread2.start();
    }
}
