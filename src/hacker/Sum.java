package hacker;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Sum {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        
   Integer[] intArray = new Integer[100];
   String[] strArray = new String[100];     
       
        for(int i=0;i<intArray.length;i++){
            if(scanner.hasNextInt()){
            intArray[i]=scanner.nextInt();
            }else if(scanner.hasNext()){
                strArray[i]=scanner.next();
            }
        }
        if(intArray[0]!=null){
            System.out.println(sum(intArray));
        }else{
            System.out.println(sum(strArray));
        }
        
       
    }
     public static Integer sum(Integer [] ints){
            int s=0;
            for(int i =0;i<ints.length;i++){
                if(ints[i]!=null){
                     s+=ints[i];
                }
              
                
                
            }
            return s;
        }
         public static String sum(String [] str){
            StringBuilder s=null;
            for(int i =0;i<str.length;i++){
                s.append(str[i]);
            }
            return s.toString();
        }
}