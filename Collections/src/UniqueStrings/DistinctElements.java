package UniqueStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

class strFreqComparator implements Comparator<String>
{
	
	public HashMap<String,Integer> hm = null;
	public strFreqComparator(HashMap<String,Integer> hm) {
		this.hm = hm;
	}
	public int compare(String s1,String s2)
	{
		
		int freqCompare = hm.get(s1).compareTo(hm.get(s2));
		int valCompare = s1.compareTo(s2);
		
		if(freqCompare == 0)
		{
			return -valCompare;
			
		}
		else {
			return -freqCompare;
		}
		
	}
}

public class DistinctElements {

	public static void main(String[] args)
	{
		ArrayList<String> array1 = new ArrayList<String>();
		HashMap<String,Integer> map = new HashMap<>();
		String tempStr = null;
		System.out.println("Enter number of Strings");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println("Enter the "+num+" Strings :");
		for(int i=0;i<num;i++)
		{
			tempStr = in.next();
			array1.add(tempStr);
			int freq = map.getOrDefault(tempStr, 0);
			map.put(tempStr,freq+1);
			
		}
		ArrayList<String> array2 = new ArrayList<>(map.keySet());

		//array2.sort(Comparator.comparing(map::get));
	    //Collections.reverse(array2);
		
		strFreqComparator cmp = new strFreqComparator(map);
		Collections.sort(array2, cmp);
		System.out.println(array2);
		
		
		
		
	}
	
	
}
