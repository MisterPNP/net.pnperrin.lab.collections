package net.jgp.pnp.labs.collections;

import java.util.*;  

public class PriorityQueueLab{  
	public static void main(String args[]) { 
		
		PriorityQueue<String> pqueue=new PriorityQueue<String>();  
		
		pqueue.add("A");  
		pqueue.add("B");  
		pqueue.add("C");  
		pqueue.add("D");  
		
		System.out.println("Head of queue: " + pqueue.peek() + " (peek), " + pqueue.element() + " (element)");
	
		System.out.println("iterating the queue elements:");  
		
		Iterator iterator = pqueue.iterator();
		
		while(iterator.hasNext()){  
			System.out.println(iterator.next());  
		}  
		System.out.println("\n");
		
		//remove two elements
		pqueue.remove();  
		pqueue.poll();  
		
		Iterator<String> itr2=pqueue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  
}  
