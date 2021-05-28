import java.io.*;
import java.util.*;

class main{
	public static void main(String[] args) {
		int[] a={5,6,1,2,3,4,5,4,3,2,0,1,2,3,-2,4};
		int maxLength=0;
		ArrayList<Integer> peak=new ArrayList<>();
		for(int i=0;i<a.length;i++){
			if(i==0){
				if(a[i]>a[i+1]) peak.add(i);
			}else if(i== a.length-1){
				if(a[i]>a[i-1]) peak.add(i);
			}else{
				if(a[i]>a[i+1] &&a[i]>a[i-1]) peak.add(i);
			}
		}
		//System.out.println(peak);
		for (Integer i :peak ) {
			int x=0;
			int z=i;int w=i;
			while(z>0 && a[z-1]<a[z]){
				x++;z--;
			}
			while(w<a.length-1 && a[w+1]<a[w]){
				x++;w++;
			}
			maxLength=Math.max(maxLength,x);
		}
		System.out.print(maxLength);
	}
}