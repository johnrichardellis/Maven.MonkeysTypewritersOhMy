package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MonkeyTypewriter {
    public static void main(String[] args) {
        String intro = "It was the best of times,\n" +
                "it was the blurst of times,\n" +
                "it was the age of wisdom,\n" +
                "it was the age of foolishness,\n" +
                "it was the epoch of belief,\n" +
                "it was the epoch of incredulity,\n" +
                "it was the season of Light,\n" +
                "it was the season of Darkness,\n" +
                "it was the spring of hope,\n" +
                "it was the winter of despair,\n" +
                "we had everything before us,\n" +
                "we had nothing before us,\n" +
                "we were all going direct to Heaven,\n" +
                "we were all going direct the other way--\n" +
                "in short, the period was so far like the present period, that some of\n" +
                "its noisiest authorities insisted on its being received, for good or for\n" +
                "evil, in the superlative degree of comparison only.";

        // Do all of the Monkey / Thread building here
        // For each Copier(one safe and one unsafe), create and start 5 monkeys copying the introduction to
        // A Tale Of Two Cities.

        //badMonkey instance of UnsafeCopier, passing in the intro parameter
        UnsafeCopier badMonkey = new UnsafeCopier(intro);

  ///////////////////////////////////
//        Queue<Thread> monkeys = new LinkedList<Thread>();
//
//        for (int i = 0; i < 5; i++) {
//           monkeys.add(new Thread(badMonkey));
//        }
//        while (badMonkey.stringIterator.hasNext()) {
//            Thread currentMonkey = monkeys.poll();
//            try {
//                currentMonkey.start();
//                Thread.sleep(1000);
//                currentMonkey.stop
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            currentMonkey.start();
//            monkeys.offer(currentMonkey);
//        }
//        System.out.println(badMonkey.copied);
 ////////////////////////////////////////////

        //creating 5 threads
        Thread t1 = new Thread(badMonkey);
        Thread t2 = new Thread(badMonkey);
        Thread t3 = new Thread(badMonkey);
        Thread t4 = new Thread(badMonkey);
        Thread t5 = new Thread(badMonkey);

        //starting the 5 threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        SafeCopier goodMonkey = new SafeCopier(intro);

        //TOBECONTINUED
        Thread[] threads = new Thread[5];





        // This wait is here because main is still a thread and we want the main method to print the finished copies
        // after enough time has passed.
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("MAIN INTERRUPTED");
        }

        // Print out the copied versions here.
        System.out.println("UNSAFE" + "\n" + badMonkey.copied);
    }
}