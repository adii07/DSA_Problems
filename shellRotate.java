import java.io.*;
import java.util.*;

public class Main {   

    public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int shell = sc.nextInt();
        int rotate = sc.nextInt();

        rotateShell(a, shell, rotate);
        display(a);
    }
   
    public static void rotateShell(int[][] arr, int s, int r) {
        int[] oned = fillOneDfromShell(arr, s);
        rotate(oned, r);
        fillShellFromOneD(arr, s, oned);
    }
    public static int[] fillOneDfromShell(int[][] arr, int s) {
        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        int t = 2 * (maxr - minr + maxc - minc);
        int[] oned = new int[t];
        //lw
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            oned[idx] = arr[i][j];
            idx++;
        }
        //bottom wall
        for (int i = maxr, j = minc+1; j <= maxc; j++) {
            oned[idx] = arr[i][j];
            idx++;
        }        
        //right wall
        for (int i = maxr-1, j = maxc; i >= minr; i--) {
              oned[idx] = arr[i][j];
            idx++;
        }
        //top wall
        for (int i = minr, j = maxc-1; j >= minc+1; j--) {
            oned[idx] = arr[i][j];
            idx++;
        }
        return oned;


    }
    public static int[] fillShellFromOneD(int[][] arr, int s, int[] oned) {

        int minr = s - 1;
        int minc = s - 1;
        int maxr = arr.length - s;
        int maxc = arr[0].length - s;
        //lw
        int idx = 0;
        for (int i = minr, j = minc; i <= maxr; i++) {
            arr[i][j]=oned[idx] ;
            idx++;
        }
        //bottom wall
        for (int i = maxr, j = minc + 1; j <= maxc; j++) {
            arr[i][j]=oned[idx] ;
            idx++;
        }
        //right wall
        for (int i = maxr-1, j = maxc; i >= minr; i--) {
          arr[i][j]=oned[idx] ;
            idx++;
        }
        //top wall
        for (int i = minr, j = maxc-1; j >= minc+1; j--) {
           arr[i][j]=oned[idx] ;
            idx++;
        }
        return oned;

    }

    public static void rotate(int[] a, int r) {
        r = r % a.length;
        if (r < 0) {
            r = r + a.length;
        }
        reverse(a, 0, a.length - r - 1);
        reverse(a, a.length - r, a.length - 1);
        reverse(a, 0, a.length - 1);
    }
    public static void reverse(int[] oned, int li, int ri) {

        while(li < ri) {
            int temp = oned[li];
            oned[li] = oned[ri];
            oned[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}