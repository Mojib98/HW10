package Tamrin7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Inserting inserting = new Inserting();
        ExecutorService executorService = Executors.newFixedThreadPool(5);


            executorService.submit(inserting);
            executorService.submit(inserting);
            executorService.submit(inserting);
            executorService.submit(inserting);
            executorService.submit(inserting);
            executorService.submit(inserting);
            executorService.submit(inserting);

        executorService.shutdown();

        System.out.println(executorService.isShutdown());

    }
}
