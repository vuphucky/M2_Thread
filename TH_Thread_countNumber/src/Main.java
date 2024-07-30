// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Count count = new Count();
        try {
            while (count.getMyThread().isAlive()){
                System.out.println("main thread will be alive sill the child thread is alive");
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("main thread run is over");
    }
}