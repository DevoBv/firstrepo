package com.collection;

import java.util.ArrayList;
import java.util.TreeSet;

//I have text file I want to know which word occurred multiple items
public class SalarySequence {
	public static void main(String[] args) {
		String s = "i have a text file and i also have evn number and odd number";
		String[] s1 = s.split(" ");
		TreeSet ts = new TreeSet();
		for (int i = 0; i < s1.length; i++) {
			ts.add(s1[i]);
		}
		//System.out.println("tree set " + ts);
		ArrayList al = new ArrayList(ts);
		//System.out.println("al is " + al);
		ArrayList al2 = new ArrayList();
		for (int i = 0; i < s1.length; i++) {
			al2.add(s1[i]);
		}
		//System.out.println("al2 is " + al2);
		for (int i = 0; i < al.size(); i++) {
			int count = 0;
			for (int j = 0; j < al2.size(); j++) {
				if (al.get(i).equals( al2.get(j))) {
					count++;
				}
			}
			System.out.println("word  : " + al.get(i) + " occurance : " + count);

		}

	}

}
