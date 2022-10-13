package corejava;

import java.util.Arrays;

public class CoreJavaPrograms {
public static void main(String[] args) {
	/*int []a= {1,2,3,4};
	int []b= {5,6,7,8};
	
	int first=a.length;
	int sec=b.length;
	int []c= new int[first+sec];
	System.arraycopy(a,0,c,0,first);
	System.arraycopy(b,0,c,first,sec);
	System.out.println(Arrays.toString(c));
		*/
	int count=0;
	int []b= {10,20,60,50,20,10,90};
	for(int i=0;i<=b.length-1;i++) {
		for(int j=0;j<i;j++) {
		if(b[i]==b[j]) {
			count++;
		}
		}
		if(count<1) {
			System.out.println(b[i]);
		}
		count=0;
	}
}


}

