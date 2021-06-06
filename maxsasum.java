import java.io.*;
import java.util.*;

class main{
	public static void main(String[] args) {
		int[]a ={-1,2,3,4,-2,6,-8,3};
		int sum=0;
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			sum+=a[i];
			if(sum>max) max=sum;
			if(sum<0) sum=0;
		}
		System.out.println(max);
	}
}