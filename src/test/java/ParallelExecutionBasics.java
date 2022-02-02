import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Instant;

/**
 * Created by tairovich_jr on 2022-02-01.
 */
public class ParallelExecutionBasics {

    long start = 0;
    long end = 0;

    @BeforeTest
    public void start(){
        start = Instant.now().getEpochSecond();
    }

    @AfterTest
    public void end(){
        end = Instant.now().getEpochSecond();

        System.out.println(end - start);
    }


    @Test
    public void test1() throws InterruptedException {

    //    System.out.println("test case 1 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 1 using Thread : " + id);
    }

    @Test
    public void test2() throws InterruptedException {
    //    System.out.println("test case 2 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 2 using Thread : " + id);
    }

    @Test
    public void test3() throws InterruptedException {
     //   System.out.println("test case 3 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 3 using Thread : " + id);
    }


    @Test
    public void test4() throws InterruptedException {
        //   System.out.println("test case 3 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 4 using Thread : " + id);
    }

    @Test
    public void test5() throws InterruptedException {
        //    System.out.println("test case 2 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 2 using Thread : " + id);
    }

    @Test
    public void test6() throws InterruptedException {
        //   System.out.println("test case 3 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 3 using Thread : " + id);
    }


    @Test
    public void test7() throws InterruptedException {
        //   System.out.println("test case 3 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 4 using Thread : " + id);
    }
    @Test
    public void test8() throws InterruptedException {
        //    System.out.println("test case 2 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 2 using Thread : " + id);
    }

    @Test
    public void test9() throws InterruptedException {
        //   System.out.println("test case 3 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 3 using Thread : " + id);
    }


    @Test
    public void test10() throws InterruptedException {
        //   System.out.println("test case 3 running");
        Thread.sleep(2000);
        long id = Thread.currentThread().getId();
        System.out.println("test case 4 using Thread : " + id);
    }
}
