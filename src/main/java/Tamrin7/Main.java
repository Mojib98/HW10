package Tamrin7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Inserting inserting = new Inserting();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0 ;i<5;i++){
            executorService.submit(inserting);
        }
        executorService.shutdown();

        System.out.println(executorService.isShutdown());

    }
}
