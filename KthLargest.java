// Frank Anastasia 
// Dr. Grabowski 
// Algorithms asgm 1
// Due Date 

import java.util.*
import java.io.*

public class KthLargest  {

	int [] tester = {5,3,16,5,8,7,12,13,2};
	
	public int kthLargest(int [] a, int k) {

		ArrayList<Integer> store = new ArrayList<>();

		int maxPos = a.length-1; 

		for (int spot = 0; spot < k; spot++) {
			for (int i = maxPos; i > 0; i--) { 

				if ((a[i-1] > a[maxPos]) && (!store.contains(a[maxPos])) {
					maxPos = i-1; 
				}
			}
			store.add(a[maxPos]);
		}

		System.out.println("Returns: " + storer[k-1]);	
		return storer[k-1];
	}

}