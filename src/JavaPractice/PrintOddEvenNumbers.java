package JavaPractice;

public class PrintOddEvenNumbers {
    private int number = 0;
    private int Max = 20;


    public synchronized void printOdd() throws Exception{
        while(number< Max){
            if(number%2 == 0){
                try {
                    wait();
                }catch (Exception e){
                    throw e;
                }
               
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " prints " + number);
            number++;
            notify();
            
        }
    }

     public synchronized void printEven() throws Exception{
        while(number< Max){
            if(number%2 != 0){
               try {
                    wait();
                }catch (Exception e){
                    throw e;
                }
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " prints " + number);
            number++;
            notify();
        }
    }

    public synchronized void increment(){
        number++;
        System.out.println("Thread " + Thread.currentThread().getName() + " prints " + number);
    }

}
