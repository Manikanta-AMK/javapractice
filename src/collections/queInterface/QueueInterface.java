package collections.queInterface;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		
		//create a object of queue with priority queue
		Queue<Integer> pq = new PriorityQueue<>();    //by default this object will store the element from min to max value
//		Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  //if we wan to reverse the order then go with comparatro.reverse() method
		
		//adding the elements with add and offer method
		pq.offer(1);
		pq.offer(3);
		pq.offer(8);
		pq.offer(5);
		pq.add(4);
		pq.add(9);
		System.out.println(pq);
		
		System.out.println();
		//print the elements in sort oder
		
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());  //poll method will be used to remove the element one after one
		}
		System.out.println();
		
		//retrieve of the element
		System.out.println(pq.peek());
		
		//remove element from queue with poll method
		System.out.println(pq.poll());
		
		//remove the element with remove method
		System.out.println(pq.remove());
		System.out.println(pq); 
		//retrieve the size of  the element with size method
		System.out.println(pq.size());
		//verify  whether the object has  the element with empty method
		System.out.println(pq.isEmpty());
		//clear the element with clear method
		pq.clear();
		System.out.println(pq.contains(5));
		
		
		
//		pq.removeAll(anotherCollection);
		
	}
}
