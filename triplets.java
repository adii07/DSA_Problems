import java.io.*;import java.util.*;
class trip{

public static void main(String[] args) {
	int[] a={1,2,3,4,5,6,7,8,9,15};
	int target=18;
	ArrayList<ArrayList<Integer> > list =new ArrayList<ArrayList<Integer> >();
	findTriplets(a,target,list);
	System.out.println(list);
}

public static void findTriplets(int[] a,int target,ArrayList<ArrayList<Integer> > list){

	for (int i=0;i<a.length-1;i++) {
		ArrayList<Integer>  alist=new ArrayList<Integer>();
		int pairTarget=target-a[i];
		int c=i+1;int b=a.length-1;
		while(c<b){
			if((a[c]+a[b])>pairTarget){
				b--;
			}else if((a[c]+a[b])<pairTarget){
				c++;
			}else{
				alist.add(a[i]);alist.add(a[c]);alist.add(a[b]);break;
			}
		}
		if(!alist.isEmpty()){
		list.add(alist);}
	}
}	
}