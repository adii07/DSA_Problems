import java.io.*;
import java.util.*;

class main{
	public static int cycle(int[] a,int i,boolean[] val,HashMap<Integer,Integer> map){
		int count=0;
		while(!val[i]){
			count++;
			val[i]=true;
			i=map.get(a[i]);
		}
		return count;
	}
	public static void main(String[] args) {
		int[] a={5,4,3,2,1};
		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i=0;i<a.length;i++) {
			map.put(a[i],i);
		}
		//System.out.println(a[0]);
		Arrays.sort(a);
		//System.out.println(a[0]);
		boolean[] val=new boolean[a.length];
		Arrays.fill(val,false);
		int swaps=0;
		for (int i=0;i<a.length;i++) {
			if(!val[i]){
				int t=cycle(a,i,val,map);
				swaps+=t-1;
			}
		}
		System.out.println(swaps);
	}
}