import java.io.*;
import java.util.*;

class main{
	public static void main(String[] args) {
		int[]a={1,2,3,4,5};
		int[] ans=new int[a.length];
		Arrays.fill(ans,1);
		int temp=1;
		for (int i=0;i<a.length;i++) {
			ans[i]=ans[i]*temp;
			temp=temp*a[i];
		}
		temp=1;	
		for (int i=a.length-1;i>=0;i--) {
			ans[i]=ans[i]*temp;
			temp=temp*a[i];
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(ans[i]);
		}
	}
}