package com.colection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collection_Ex {

	public static void main(String[] args) {
		//add elem
		
		Collection <Integer> c = new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(5);
		
		System.out.println(c);
		c.remove(2);
		System.out.println(c);
//		for(int number : c) {
//			System.out.println(number);
//		}
		
		List<Integer> b= new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		c.removeAll(b);
		System.out.println(c);
		System.out.println(b);
		System.out.println(c);
		
	Iterator <Integer> i = c.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}

	}

}
