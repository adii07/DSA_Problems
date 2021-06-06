import java.io.*;
import java.util.*;

class main{
	public static void main(String[] args) {
		int[]a={23,5,10,17,30};
		int[]b={26,134,135,14,19};
		Arrays.sort(a);Arrays.sort(b);
		int diff=Integer.MAX_VALUE;
		int z=-1;int w=-1;
		int i=0;int j=0;
		while(i<a.length && j<b.length){
			int d=Math.abs(a[i]-b[j]);

			if(d<diff){
				z=i;w=j;
				diff=d;
			}

			if(a[i]<b[j]){
				i++;
			}else{
				j++;
			}
		}
		if(z==-1||w==-1) System.out.println("Invalid");
		else System.out.println(a[z]+","+b[w]+" = "+diff);
	}
}