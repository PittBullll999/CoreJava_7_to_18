package org.codes.codingtechnique.multithreading.threadandrunnable;
class MyThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0;i<10;i++)
            {
                Thread.sleep(500);
                System.out.println("Thread 1 is running in "+i+" th step");
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mythread2 is running in "+i+" th step");
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Mythread2 mythread2=new Mythread2();
        myThread.start();
        mythread2.start();
    }
}
