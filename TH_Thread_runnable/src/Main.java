// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("main thread running... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("thread-1-HR-database");
                runnableDemo1.start();

                RunnableDemo runnableDemo2 = new RunnableDemo("thread-2-send-email");
                        runnableDemo2.start();

        System.out.println("main thread stopped!!!");
    }
}