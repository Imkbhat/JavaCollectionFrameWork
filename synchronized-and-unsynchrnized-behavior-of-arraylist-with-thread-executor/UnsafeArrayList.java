package com.synchronize.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UnsafeArrayList {

	public static void main(String[] args) throws InterruptedException {
		
		//Produces random output every time u run
		//Unpredictable behavior of arrayList if not synchronized 
		
		List<Integer> unsafeList = new ArrayList<>();
		unsafeList.add(1);
		unsafeList.add(2);
		unsafeList.add(3);
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		Runnable task = () -> {
			for (int i=0; i<unsafeList.size(); i++) {
				Integer value = unsafeList.get(i);
				unsafeList.set(i, value+1);
			}
		};
		
		for (int i=0; i<100; i++) {
			service.submit(task);
		}
		
		service.shutdown();
		service.awaitTermination(60, TimeUnit.SECONDS);
		
		System.out.println("Unsafe ArrayList ==> "+unsafeList);
	}

}
