package com.deloitte.loblow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionShuffle {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		List<Integer> list = new ArrayList<Integer>(n);
		
		for(int i =0; i < n; i++) {
			list.add(in.nextInt());
		}
		
		System.out.println("list before shuffle "+list);
		
		for(int i = 0; i < n; ) {
			int ele = list.get(i);
			int newLoc =   (int) (i * Math.random());
			
			if(newLoc < n) {
				int temp = list.get(newLoc);
				list.set(newLoc, ele);
				list.set(i,temp);
			}
			i+= (int) (i * Math.random());
		}
		
		System.out.println("list after shuffle "+list);

	}
	
	

}
