package com.mulptiple;

import java.util.ArrayList;
import java.util.List;

public class D {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		list.add(59);
		list.add(60);
		System.out.println(list);
		
		List list1=new ArrayList();
		list1.add(60);
		list1.add(59);
		list.addAll(list1);
		System.out.println(list);
		System.out.println(list.containsAll(list1));
		System.out.println(list1.contains(59));
				
	}

}
