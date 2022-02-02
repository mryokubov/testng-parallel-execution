import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * Created by tairovich_jr on 2022-02-01.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {


        long start = Instant.now().getEpochSecond();
        Thread.sleep(2000);
        long end = Instant.now().getEpochSecond();
        System.out.println(end - start);
    }
}
