package com.colection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class List_Ex {

	public static void main(String[] args) {
	
		Set <Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(11);
		s.add(12);
		s.add(21);
		s.add(56);
		s.add(55);
		
		Set <Integer> t = new HashSet<Integer>();
		t.add(55);
		t.add(17);
		t.add(19);
		t.add(29);
		t.add(50);
		
		Iterator <Integer> it =t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		Set <Integer> u = new HashSet<Integer>(s);
		u.addAll(t);
		System.out.println(u);
		
		Set <Integer> i = new HashSet<Integer>(s);
		i.retainAll(t);
		System.out.println(i);
	}

}
