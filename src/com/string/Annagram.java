package com.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Annagram {
	
	
	public static void main(String[] args) {
		int count=0;
	String s="asjjskkkqwer";
	String res="";
	for (int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		for(int j=0;j<i;j++) {
			char ch1=s.charAt(j);
			if(ch==ch1) {
			count++;
			}else {
				res=res+ch;
			
			}
		}
	
	}
	System.out.println(res);
		
		
		
		
		
		
		
		
	}
//..............................................................................//
	//to reomve duplicate 
	/*public static void main(String[] args) {
		String s = "i have is a have so no do so";
		String[] s1 = s.split(" ");
		
		 Set ts=new LinkedHashSet();
		 for(String s2:s1) {
			 ts.add(s2);
		 }
		
		 Iterator itr=ts.iterator();
		 while(itr.hasNext()) {
			 System.out.print(itr.next() + " ");
		 }
		
	}*/

//...................................................................................///	
	/*annagram program
	 * public static void main(String[] args) { String s1 = "nitIn"; String s2 =
	 * "Tinin"; char[] ch1 = s1.toLowerCase().toCharArray(); char[] ch2 =
	 * s2.toLowerCase().toCharArray(); Arrays.sort(ch1); Arrays.sort(ch2);
	 * System.out.println(ch1); System.out.println(ch2); if (Arrays.equals(ch1,
	 * ch2)) { System.out.println("annagram"); } else {
	 * System.out.println(" not annagram"); } }
	 */

}
