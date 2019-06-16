package LetterFrequency;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharFreq {
     public static void display(TreeMap<Character,Integer> map)
     {
    	 Iterator itr= map.entrySet().iterator();
 		while(itr.hasNext())
 		   {
 		      Map.Entry record=(Map.Entry)itr.next();  //will give next (Key, Value) pair
 		      System.out.print(record.getKey()+"\t");
 		      for(int i=0; i <(int)record.getValue();i++)
 		      {
 		    	  System.out.print("#");
 		      }
 		      System.out.print("\n");
 		   }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Character,Integer> map = new TreeMap<Character,Integer>();
		System.out.println("Enter any String.");
		Scanner in = new Scanner(System.in);
		String str= in.nextLine();
		str = str.toUpperCase();
		for(Character c:str.toCharArray())
		{
			if(Character.isAlphabetic(c))
			{
				if(map.containsKey(c))
				{
					map.put(c,map.get(c)+1);
				}
			
			else {
				map.put(c,1);
			}
			}
		}
		display(map);
		

	}

}
