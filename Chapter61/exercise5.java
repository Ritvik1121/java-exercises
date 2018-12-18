import java.io.* ;
import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

class exercise5
{

  public static void main ( String[] args )
  {
    int[] alphabet = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z};
    int[] lettersUsed = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    Scanner scan = new ScanEnvironment(System.in);
    System.out.println("What is the phrase?");
    String phrase = scan.next();

    int count = 0;
    for ( int j=0; j < alphabet.length; j++)
    {
        count++;
    }
    for(int i = 0; i < data.length; i++){
        System.out.println(result[i]);
    }
  }
}
