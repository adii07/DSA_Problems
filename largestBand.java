import java.io.*;
import java.util.*;

class main{
	public static void main(String[] args) {
		int[] a={1,9,3,0,18,5,2,4,10,7,12,6,8};
		HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
		for (int i=0;i<a.length ;i++ ) {
			map.put(a[i],false);
		}
		int maxLen=Integer.MIN_VALUE;
		for (int i=0;i<a.length;i++) {
			int l=1;int temp=a[i];
			if(map.containsKey(temp-1)){

			}else{
				while(map.containsKey(temp+1)){
					l++;
					temp++;
				}
			}
			maxLen=Math.max(maxLen,l);
		}
		System.out.println(maxLen);
	}
}