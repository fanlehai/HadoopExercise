// Basic task cooperation.
package com.fanlehai.java.thread;

import java.util.concurrent.*;

//class Car {
//	private boolean waxOn = false;
//
//	public synchronized void waxed() {
//		System.out.println("waxed");
//		waxOn = true; // Ready to buff
//		notifyAll();
//	}
//
//	public synchronized void buffed() {
//		System.out.println("buffed");
//		waxOn = false; // Ready for another coat of wax
//		notifyAll();
//	}
//
//	public synchronized void waitForWaxing() throws InterruptedException {
//		System.out.println("waitForWaxing in");
//		while (waxOn == false)
//			wait();
//		
//		System.out.println("waitForWaxing out");
//	}
//
//	public synchronized void waitForBuffing() throws InterruptedException {
//		System.out.println("waitForBuffing in");
//		while (waxOn == true)
//			wait();
//		System.out.println("waitForBuffing out");
//	}
//}
//
//class WaxOn implements Runnable {
//	private Car car;
//
//	public WaxOn(Car c) {
//		car = c;
//	}
//
//	public void run() {
//		
//		System.out.println("WaxOn run() ");
//		
//		try {
//			while (!Thread.interrupted()) {
//				System.out.println("Wax On! ");
//				TimeUnit.MILLISECONDS.sleep(200);
//				car.waxed();
//				//car.waitForBuffing();
//			}
//		} catch (InterruptedException e) {
//			System.out.println("Exiting via interrupt");
//		}
//		System.out.println("Ending Wax On task");
//	}
//}
//
//class WaxOff implements Runnable {
//	private Car car;
//
//	public WaxOff(Car c) {
//		car = c;
//	}
//
//	public void run() {
//		
//		System.out.println("WaxOff run() ");
//		
//		try {
//			while (!Thread.interrupted()) {
//				//car.waitForWaxing();
//				System.out.println("Wax Off! ");
//				TimeUnit.MILLISECONDS.sleep(200);
//				car.buffed();
//			}
//		} catch (InterruptedException e) {
//			System.out.println("Exiting via interrupt");
//		}
//		System.out.println("Ending Wax Off task");
//	}
//}

public class WaxOMatic {
	public static void main(String[] args) throws Exception {
//		Car car = new Car();
//		ExecutorService exec = Executors.newCachedThreadPool();
//		exec.execute(new WaxOff(car));
//		exec.execute(new WaxOn(car));
//		TimeUnit.SECONDS.sleep(5); // Run for a while...
//		exec.shutdownNow(); // Interrupt all tasks
	}
} /*
	 * Output: (95% match) Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off!
	 * Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax
	 * On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On! Wax Off! Wax On!
	 * Wax Off! Wax On! Exiting via interrupt Ending Wax On task Exiting via
	 * interrupt Ending Wax Off task
	 */// :~
