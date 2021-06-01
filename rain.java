import java.io.*;
import java.util.*;

class main{
	public static void main(String[] args) {
		try{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] parts = br.readLine().split(" ");
		int len=parts.length;
		int[]a=new int[len];
		for (int i=0;i<len;i++ ) {
			a[i]=Integer.parseInt(parts[i]);
		}
		int[] l=new int[len];
		int[] r=new int[len];
		int maxL=Integer.MIN_VALUE;
		int maxR=Integer.MIN_VALUE;
		for (int i=0;i<len ;i++ ) {
			maxL=Math.max(maxL,a[i]);
			l[i]=maxL;
		}
		for (int i=len-1;i>=0;i-- ) {
			maxR=Math.max(maxR,a[i]);
			r[i]=maxR;
		}

		int water=0;
		for (int i=0;i<len ;i++ ) {
			int capacity=Math.min(r[i],l[i])-a[i];
			water+=capacity;
		}
		System.out.println("Amount of water enclosed within the structure = "+water+"L");
	
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}



//mkdir combined
//unzip '*.zip' -d combined