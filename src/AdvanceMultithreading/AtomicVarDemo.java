package AdvanceMultithreading;

import java.util.concurrent.atomic.AtomicInteger;

class AtomicCounter {
    private AtomicInteger counter = new AtomicInteger(0);
    public void increment() {
        counter.incrementAndGet();
    }
    public void decrement() {
        counter.decrementAndGet();
    }
    public int value() {
        return counter.get();
    }
}

public class AtomicVarDemo {
    public static void main(String[] args) {
        AtomicCounter atm = new AtomicCounter();
        atm.increment();
//		Thread t1 = new Thread(new Runnable(){
//			public void run(){
//				for(int i=1;i<=10;i++){
//
//				}
//			}
//		});
//		t1.start();
    }
}
