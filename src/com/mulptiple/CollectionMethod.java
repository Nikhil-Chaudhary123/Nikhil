package com.mulptiple;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(1, 12);
		l1.add(34);
		System.out.println(l1);
		List list1=new ArrayList();
		list1.add(23);
		list1.add(34);
		list1.addAll(list1);
		System.out.println(list1);
		/*l1.remove(2);*/
		//l1.removeAll(l1);
		/*System.out.println(l1);
		System.out.println(l1.size());
       l1.set(1, 9);
		System.out.println(l1);*/
		l1.contains(3);
		System.out.println("jjjjj");
System.out.println(l1);
System.out.println("jjj");
l1.containsAll(l1);
System.out.println(l1);
l1.retainAll(l1);
System.out.println(l1);


}}
