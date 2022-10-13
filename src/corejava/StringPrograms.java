package corejava;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class StringPrograms {

	/*
	 * // Java Program to determine whether two strings are the anagram public
	 * static void main(String[] args) { String[] s = { "keep", "peek", "stop",
	 * "kepts", "stops", "pots" }; TreeSet ts = new TreeSet(); for (int i = 0; i <
	 * s.length; i++) { for (int j = i + 1; j < s.length; j++) { if (s[i].length()
	 * == s[j].length()) { String s1 = s[i]; char[] ch1 = s1.toCharArray(); String
	 * s2 = s[j]; char[] ch2 = s2.toCharArray(); Arrays.sort(ch1); Arrays.sort(ch2);
	 * if (Arrays.equals(ch1, ch2)) { ts.add(s1); ts.add(s2);
	 * System.out.println(s[i] + " and " + s[j] + " are annagram"); } } }
	 * 
	 * } System.out.println(ts); }
	 */

//......................................................................//
	/*
	 * wap to print 1 to 100 without loop and increment public static void m1(int
	 * num) { if(num>=1) { System.out.println(num); m1(num-1); } } public static
	 * void main(String[] args) { m1(100); }
	 */

//..........................................................//	
	/*
	 * reverse string by words public static void main(String[] args) { String
	 * s="hello my name is Vishwesh"; //String res=""; String [] s1=s.split(" ");
	 * for(String s2:s1) { String rev="";
	 * 
	 * for(int i=s2.length()-1;i>=0;i--) { char ch=s2.charAt(i); rev=rev+ch; }
	 * System.out.print(rev+" "); } }
	 */
//..........................................................//
	/*
	 * //ArrayMerge program public static void main(String[] args) { int []a=
	 * {1,2,3,4,10}; int []b= {6,7,8,9,5}; int []c= new int[a.length+b.length];
	 * for(int i=0;i<a.length;i++) { c[i]=a[i]; } for(int j=0;j<b.length;j++) {
	 * c[a.length+j]=b[j]; } System.out.println(Arrays.toString(c)); }
	 */

//...........................................................//	
	/*
	 * String parts[]=s.split(" "); for(int i=0;i<parts.length;i++) { char []
	 * ch=parts[i].toCharArray(); for(int j=0;j<ch.length;j++) {
	 * ch[0]=Character.toUpperCase(ch[0]); System.out.print(ch[j]); }
	 * System.out.print(" ");
	 */

}
