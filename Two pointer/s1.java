import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    
    public static int find(int arr[] , int  n , int k) {
        int start = 0 ; int end = n-1 ; 
        int ans = 0 ; 
        
        while(start < end) {
            if(arr[start] + arr[end] <= k) {
                ans += end - start; //all pairs valid before start ?
                start++ ; 
            }else{
                end--;
            }
        }
        
        return ans ; 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in) ;
		
		int n = sc.nextInt() ; 
		int l = sc.nextInt() ; 
		int r = sc.nextInt() ; 
		
		
		
		int arr[] = new int[n] ; 
		
		for(int i = 0; i < n ; i++) {
		    arr[i] = sc.nextInt() ; 
		}
		Arrays.sort(arr) ; 
		int la = find(arr , n , l-1) ; 
		
	    int ra = find(arr , n , r) ; 
	    
	    System.out.println(ra - la);
		

	}
}
