package Google;

import java.util.LinkedList;

public class movingAvgDataStream {
    double sum;
    int size;
    LinkedList<Integer> list;
 
    /** Initialize your data structure here. */
    public movingAvgDataStream(int size) {
    	this.size = size;
    	this.list = new LinkedList();
    }
 
    public double next(int val) {
    	sum = sum + val;
    	list.offer(val);
    	if(list.size()<=size) { // can be got anytime
    		return sum/list.size();
 
    	} 
    	//else slide , by removing the head
    	sum = sum - list.poll();
		return sum/size;

    }
	public static void main(String[] args) {
		movingAvgDataStream m = new movingAvgDataStream(3);
		m.next(1);
		m.next(10);
		m.next(3);
		m.next(5);
		
		//1
		//(1 + 10) / 2
		//(1 + 10 + 3) / 3
		//(10 + 3 + 5) / 3
		
	}

}
//public class MovingAverageInSlidingWIndow {
//int windowsize;
//Queue queue;
//int sum;
//
//public MovingAverageInSlidingWIndow(int windowsize) {
//this.windowsize = windowsize;
//this.queue = new LinkedList();
//this.sum = 0;
//}
//
//// finds moving average after inserting item n into data stream
//private double findMovingAverage(int n) {
//if (queue.size() > windowsize - 1) {
//sum = sum - queue.poll();