package JavaPractice;

public class Mythread implements Runnable {

    @Override
    public void run() {

      System.out.println("Executing task " + taskId + " on thread " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000); // Simulate work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
    }
 

}
