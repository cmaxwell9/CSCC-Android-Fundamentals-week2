package com.cmax.week1308;

/**
 * Created by Clint on 4/20/2016.
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args)
    {
        final BlockingQueue<Character> queue = new ArrayBlockingQueue<Character>(5);
        final ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(new Runnable() {
            @Override
            public void run() {
                for (char ch = 'A'; ch <= 'Z'; ch++) {
                    try {
                        queue.put(ch);
                        System.out.println(ch + " produced by producer.");
                        // ensures console output is consistent
                        Thread.sleep(200);
                    }
                    catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                }
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                char ch = '\0';
                do {
                    try {
                        ch = queue.take();
                        System.out.println(ch + " consumed by consumer.");
                    }
                    catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                } while (ch != 'Z');
                executor.shutdown();
            }
        });
    }
}
