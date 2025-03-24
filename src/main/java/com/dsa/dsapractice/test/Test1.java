package com.dsa.dsapractice.test;

class Demo {

    class DemoChild implements Runnable {
        @Override
        public void run() {
            System.out.println("inside child inner class");
        }
    }
}

public class Test1 {
    public static void main(String[] args) {

        int threadCount = 10000;
        Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("Runnable Thread");
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        };

        for(int i=0; i<threadCount; i++){
            Thread t1 = new Thread(runnable);
            t1.start();
            System.out.println(String.format("Thread Number: %s", i));
        }

    }
}
