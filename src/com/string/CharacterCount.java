package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class CharacterCount {
	
	
	public static void main(String[] args) {
	String s="aabbjjffldksaa";
	char[]s1=s.toCharArray();
	TreeSet treeSet=new TreeSet();
	for(int i=0;i<s1.length;i++) {
		treeSet.add(s1[i]);
	}
	System.out.println("treeser : "+treeSet);
	ArrayList al=new ArrayList(treeSet);
	System.out.println("treeset in al : "+al);
	ArrayList al2=new ArrayList();
	for(int i=0;i<s1.length;i++) {
		al2.add(s1[i]);
		
	}
	System.out.println("al2 : "+al2);
	
	for(int i=0;i<al.size();i++) {
		int count=0;
		for(int j=0;j<al2.size();j++) {
			if(al.get(i)==al2.get(j)) {
				count++;
			}
		}
		System.out.println("char : "+al.get(i)+" occurence : "+count);
	}
	}
	
	
	
	
	
	
	/*//Java Program to determine whether two strings are the anagram
public static void main(String[] args) {
	String s="nitin";
	String s1="tinin";
	char[]s2=s.toLowerCase().toCharArray();
	char [] s3=s1.toLowerCase().toCharArray();
	Arrays.sort(s2);
	System.out.println(s2);
	Arrays.sort(s3);
	System.out.println(s3);
	
	if(Arrays.equals(s2, s3)) {
		System.out.println("anan");
	}
}*/
	
//..........................................................................//	
	
	
	/*//Java Program to count the total number of vowels and in a string
	public static void main(String[] args) {
		String s="vishwesh lives in udgir";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		System.out.println(count);
	}
	*/
	
//...................................................................................//
	
	// Java Program to count the total number of characters in a string
/*public static void main(String[] args) {
	String s="vishwesh vijaykumar bapure";
	String res="";
	int count=0;
	for(int i=0;i<s.length();i++) {
		char ch=s.charAt(i);
		
		if(ch >= 'a' && ch<= 'z') {
			count++;
		}
	}
	System.out.println(count);
}*/
}
