// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       OddThread oddThread = new OddThread();
       EvenThread evenThread = new EvenThread();

       oddThread.start();
       try {
           oddThread.join();
       }catch (InterruptedException e){
           e.printStackTrace();
       }
       evenThread.start();
    }
}