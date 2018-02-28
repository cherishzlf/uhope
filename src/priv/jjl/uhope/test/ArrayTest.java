package priv.jjl.uhope.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	// create an empty array deque with an initial capacity
	Deque<Integer> deque = new ArrayDeque<Integer>(8);

	// use add() method to add elements in the deque
	deque.add(25);
	deque.add(30);
	deque.add(35);

	// adding elements using push() method
	// deque.push(10);
	// deque.push(15);

	System.out.println("Printing Elements after using push operation:");
	for (Integer number : deque) {
	    System.out.println("Number = " + number);
	}

	int[] arr11 = { 10, 2, 3, 4, 5, 6, 7, 8, 9, 0, 3, 2, 4, 5, 6, 7, 4, 32,
		2, 1, 1, 4, 6, 3 };
	// 计算最大值
	int max = arr11[0];
	for (int i = 1; i < arr11.length; i++) {
	    if (arr11[i] > max) {
		max = arr11[i];
	    }
	}
	System.out.println("Max is " + max);
	// 计算最小值
	int min = arr11[0];
	for (int i = 0; i < arr11.length; i++) {
	    if (arr11[i] < min) {
		min = arr11[i];
	    }
	}
	System.out.println("Min is " + min);

    }

}
