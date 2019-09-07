package com.lav.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LockWithReentrantTimeout {

	ReentrantLock r1 = new ReentrantLock();
	ReentrantLock r2 = new ReentrantLock();

	public void execute() {
		new Thread(() -> {
			try {
				process1();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}).start();

		new Thread(() -> {
			try {
				process2();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}).start();
	}

	public void process1() throws InterruptedException {
		r1.tryLock(1, TimeUnit.SECONDS);
		r2.tryLock(1, TimeUnit.SECONDS);

		System.out.println("process 1 executing");

		r1.unlock();
		r2.unlock();
	}

	public void process2() throws InterruptedException {
		r2.tryLock(1, TimeUnit.SECONDS);
		r1.tryLock(1, TimeUnit.SECONDS);

		System.out.println("process 2 executing");

		r2.unlock();
		r1.unlock();
	}

	public static void main(String[] args) {
		LockWithReentrantTimeout tle1 = new LockWithReentrantTimeout();
		tle1.execute();

	}

}
