package com.mulptiple;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class College {
	
	public static void main(String[] args, Object lit) {
		
		List<String> mh=new ArrayList<>();
		mh.add("pune");
		mh.add("mumbai");
		
		List<String> jh=new ArrayList<>();
		jh.add("ranchi");
		jh.add("jharkhand");
		
	List <String> aa=new ArrayList<>();
	aa.add("dd");
	aa.add("kk");
	 
	List <String> bb=new ArrayList<>();
	bb.add("dd");
	bb.add("kk");
	
	List <List <String>> ind=new ArrayList();
	ind.add(mh);
	ind.add(jh);
	
	List <List <String>> aus=new ArrayList();
	aus.add(aa);
	aus.add(bb);
	
	
	List <List<List<String>>> wrld=new ArrayList();
	 wrld.add(ind);
	 wrld.add(aus);
	          
	 Iterator <List<List<String>>> itr=wrld.iterator();
		
		while(itr.hasNext())
		{
			List<List<String>> l=itr.next();
			
			Iterator itr1=l.iterator();
			
			  while(itr1.hasNext())
			  {
				  List<String> i=(List<String>) itr1.next();
				  //System.out.println(i);
				  Iterator itr2=i.iterator();
				  while(itr2.hasNext())
				  {
					  String s=(String)itr2.next();
					  System.out.println(s);
				  }
				  
			  }
			
			  
	
	/*
			for(List<List<String>> i:wrld)
			{
			for(List <String> s:i)
			{
				for(String s1:s)
				{
					System.out.println(s1);
				}
			}*/
		
		
	}}}