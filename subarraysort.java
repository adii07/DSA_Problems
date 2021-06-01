import java.io.*;
import java.util.*;

class main{


	public static int[] findIndex(int[]a,int maxVal,int minVal){
		int startIndex=-1;int endIndex=-1;
		for (int i=0;i<a.length;i++) {
			if(a[i]>minVal){
				startIndex=i;
				break;
			}
		}
		for (int i=a.length-1;i>=0 ;i-- ) {
			if(a[i]<maxVal){
				endIndex=i;
				break;
			}
		}
		int[] ans={startIndex,endIndex};
		return ans;
	}

	public static void main(String[] args) {
		int[] a={1,2,3,4,5,8,6,7,9,10,11};
		int maxVal=Integer.MIN_VALUE;
		int minVal=Integer.MAX_VALUE;
		for (int i=0;i<a.length;i++) {
			if(i==0){
				if(a[i]>a[i+1]){
					maxVal=Math.max(a[i],maxVal);
					minVal=Math.min(a[i],minVal);
				}
			}else if(i==a.length-1){
					if(a[i]<a[i-1]){
						maxVal=Math.max(a[i],maxVal);
						minVal=Math.min(a[i],minVal);
					}
			}else{
				if(a[i]>a[i+1] && a[i]>a[i-1]){
					maxVal=Math.max(a[i],maxVal);
				}else if(a[i]<a[i-1] && a[i]<a[i+1]){
					minVal=Math.min(a[i],minVal);					
				}
			}
		}
		//System.out.println(minVal+" "+maxVal);
		int[] ans=findIndex(a,maxVal,minVal);
		System.out.println("Subarray out of order lies in between the indexes "+ans[0]+" and "+ans[1]);
	}
}