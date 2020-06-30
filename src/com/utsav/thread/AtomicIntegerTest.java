package com.utsav.thread;

public class AtomicIntegerTest {

    public static void main(String[] args) throws InterruptedException {

        WorkingThread wt = new WorkingThread();
        
        Thread t1 = new Thread(wt, "t1");
        t1.start();
        Thread t2 = new Thread(wt, "t2");
        t2.start();
        
        t1.join();
        t2.join();
        System.out.println("Processing count=" + wt.getCount());
    }
}
class WorkingThread implements Runnable {
	
	//private AtomicInteger count = new AtomicInteger();
    private int count;

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            processSomething(i);
            count++;
            //count.incrementAndGet();
        }
    }
    public int getCount() {
        return this.count;
    	//return this.count.get();
    }
    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}