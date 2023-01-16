package com.github.flashvayne.heatlaptop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Heating your laptop
 *
 * @author flashvayne
 */
public class HeatLaptop {

    public static void main(String[] args) {
        //set an appropriate number of threads according to the number of CPU cores
        int threadNum = 6;
        ExecutorService executorService = Executors.newFixedThreadPool(threadNum);
        for (int i = 0; i < threadNum; i++) {
            executorService.submit(()->{while(true);});
        }
        System.out.println("Heating...");
    }

}
