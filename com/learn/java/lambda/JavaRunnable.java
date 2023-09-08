package com.learn.java.lambda;

public class JavaRunnable {
    public static void main(String[] args) {
        /*
        traditional way
         */
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("In runnable");
            }
        };
        new Thread(r).start();

        //Funtional way
        Runnable r1 = ()->{
            System.out.println("In runnable 1");
        };
        new Thread(r1).start();

        Runnable r2 = () -> System.out.println("In runnable 2");

        new Thread(r2).start();

        new Thread(()-> System.out.println("In runnable 3")).start();
    }
}
