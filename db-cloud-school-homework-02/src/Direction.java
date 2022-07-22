import java.util.concurrent.Semaphore;

/**
 * the program will have two instances of the current Direction class, one for
 * the north-south direction and one for the west-east direction.
 */
public class Direction extends Thread {
    private final Semaphore semaphore;
    /**
     * NS, north-south or WE, west-east.
     */
    private final String currentDirection;
    /**
     * the number of cars waiting to pass the intersection.
     */
    private int cars;

    public Direction(Semaphore semaphore, String currentDirection) {
        this.semaphore = semaphore;
        this.currentDirection = currentDirection;
    }

    /**
     * assuming the traffic light changes its color after 5 seconds, a car needs
     * one second to pass the intersection and just two cars can pass simultaneously,
     * the street has two lanes.
     */
    @Override
    public void run() {
        try {
            this.semaphore.acquire();
            Utils.changeToGreen(this.currentDirection);
            // current number of passing car:
            int curr = 0;
            long start = System.currentTimeMillis();

            while (System.currentTimeMillis() - start < 5000 && cars > 0) {
                // first lane:
                Utils.go(this.currentDirection, ++curr);
                cars--;

                // second lane:
                if (cars > 0) {
                    Utils.go(this.currentDirection, ++curr);
                    cars--;
                }
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Utils.changeToRed(this.currentDirection, cars);
        this.semaphore.release();
    }

    public void setCars(int cars) {
        this.cars = cars;
    }
}
