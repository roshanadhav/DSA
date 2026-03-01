import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in) ; 
		
		
	    String a = sc.next() ; 
	    String b = sc.next() ; 
	    int n = a.length() ; 
	    int m = b.length() ; 
	    
        StringBuilder sb = new StringBuilder(b);
        for(int j = 0 ; j < m ; j++) {
            //try swapping each char right
            for(char ch = 'a' ; ch <= 'z' ; ch++) {
                sb.setCharAt(j , ch ) ;
                //check now valid or not;
                
                int s1 = 0 ;
                int s2 = 0 ; 
                
                while(s1 < n && s2 < m) {
                    if(a.charAt(s1) == sb.charAt(s2)) {
                        s1++ ; 
                        s2++ ; 
                    }else{
                        s1++ ; 
                    }
                }
                sb.setCharAt(j , b.charAt(j) ) ;
                if(s2 == m)  {
                    System.out.println(true) ;
                    return ; 
                }; 
            }
        }
	   
         System.out.println(false) ;
	}
}
