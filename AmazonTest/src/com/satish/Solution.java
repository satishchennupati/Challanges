package com.satish;

//IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//DEFINE ANY CLASS AND METHOD NEEDED
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
//CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
 // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
 public static List<List<Integer>> closestLocations(int totalCrates, 
                                      List<List<Integer>> allLocations, 
                                      int truckCapacity)
	{
     // WRITE YOUR CODE HERE
     int truckXlocation = 0;
     int truckYlocation = 0;
     int xLocation = 0, yLocation = 1;
     int count =0;
     
     List<List<Integer>> result = new ArrayList<List<Integer>>(truckCapacity);
     Double distanceFromTruck = 0.0;
     Map<Double, List<Integer>> temp = new TreeMap<Double, List<Integer>>();
     
     for(int i=0; i  < totalCrates; i++){
         List<Integer> currentLocation = allLocations.get(i);
         distanceFromTruck = Math.sqrt((truckXlocation - currentLocation.get(xLocation)) * (truckXlocation - currentLocation.get(xLocation)) + (truckYlocation - currentLocation.get(yLocation)) * (truckYlocation - currentLocation.get(yLocation)));     
         temp.put(distanceFromTruck, currentLocation);
     }
     
     for(Map.Entry<Double, List<Integer>> entry : temp.entrySet()) {  
         result.add(entry.getValue());
         count++;
         if(count == truckCapacity) {
    	    count =0;
    	    break;
         }
     }
     
     return result;
 }
 // METHOD SIGNATURE ENDS
 
 public static void main(String[] args) {
	 int totalCrates = 3;
	 List<List<Integer>> allLocation = new ArrayList<List<Integer>>();
	 
	 allLocation.add(Arrays.asList(1,-3));
	 allLocation.add(Arrays.asList(1,2));
	 allLocation.add(Arrays.asList(3,4));
	 
	 int truckCapacity = 2;
	 
	 System.out.println(closestLocations(totalCrates, allLocation, truckCapacity));
	 
 }
}