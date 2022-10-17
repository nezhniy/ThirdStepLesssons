package itsjava.first.lesson_4.threadsHW;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ThreadHW extends Thread{
    private final String name;
    private final int count;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(count);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}
