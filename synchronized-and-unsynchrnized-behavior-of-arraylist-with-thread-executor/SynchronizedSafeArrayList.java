package com.synchronize.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SynchronizedSafeArrayList {

	public static void main(String[] args) throws InterruptedException {
		
		List<Integer> safeArrayList = Collections.synchronizedList(new ArrayList<>());
		safeArrayList.add(1);
		safeArrayList.add(2);
		safeArrayList.add(3);
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		
		//Incrementing array value by 1 on particular indexes
		
		Runnable task  =() -> {
			synchronized (safeArrayList) {
	            for (int i = 0; i < safeArrayList.size(); i++) {
	                Integer value = safeArrayList.get(i);
	                safeArrayList.set(i, value + 1);
	            }
	        }
		};
		
		for (int i=0; i<100; i++) {
			service.submit(task);
		}
		
		 service.shutdown();
	     service.awaitTermination(60, TimeUnit.SECONDS);

	     System.out.println(safeArrayList);
		
	}

}
