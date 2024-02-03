package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 6, 7, 8, 6, 4, 2, 4, 6, 2, 2, 3, 4, 5, 6, 3, 11, 11 };

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int b:a)
		{
			if(hm.containsKey(b))
			{
				hm.put(b, hm.get(b)+1);
			}
			else {
				hm.put(b, 1);
			}
		}
			System.out.println(hm);
			
			for(Map.Entry<Integer, Integer> h1:hm.entrySet())
			{
				if(h1.getValue()==4);
				System.out.println(h1.getKey()+" ");
			}
				
		
		System.out.println();
	}
}