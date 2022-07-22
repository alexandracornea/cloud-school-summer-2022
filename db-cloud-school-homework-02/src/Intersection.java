import java.util.Scanner;
import java.util.concurrent.Semaphore;

/**
 * test class, with main method.
 */
public class Intersection {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        Direction NS = new Direction(semaphore, "NS");
        Direction WE = new Direction(semaphore, "WE");
        Scanner scanner = new Scanner(System.in);

        // reads from stdin the number of cars waiting too pass through the two directions:
        System.out.print("Cars waiting to pass through north-south direction: ");
        NS.setCars(Integer.parseInt(scanner.next()));
        System.out.print("Cars waiting to pass through west direction: ");
        WE.setCars(Integer.parseInt(scanner.next()));

        // start threads:
        NS.start();
        WE.start();
        try {
            NS.join();
            WE.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
