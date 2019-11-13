package com.mulptiple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Aa {
	public static void main(String[] args) {
		
			
			Map<Integer,List<List<String>>>  list=new HashMap<>();
			 List<String> mh=new ArrayList();
			 mh.add("ABC");
0			 mh.add("PQR");
			 
			 List<String> gh=new ArrayList();
			 gh.add("ABC");
			 gh.add("LMN");
			 
			 List<List<String>> india=new ArrayList();
			 india.add(mh);
			 india.add(gh);
			
			 list.put(1, india);
			 
			 Set<Integer> key=list.keySet();
			
			 Iterator itr=key.iterator();
			 while(itr.hasNext())
			 {
				 Integer i=(Integer)itr.next();
				 System.out.println(i);
				 List<List<String>> s=list.get(i);
				 Iterator<List<String>> itr1=s.iterator();
				 while(itr1.hasNext())
				 {
					 List<String> list1=itr1.next();
					 Iterator itr2=list1.iterator();
					 while(itr2.hasNext())
					 {
						 String ss=(String)itr2.next();
						 System.out.println(ss);
					 }
			 }}
			 
			
			 
			 
			 }
			 
	}
		
		