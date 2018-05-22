/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refresher;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


/**
 *
 * @author zenga
 */
public class Methods {
    
    // prints the word program in a crossed fashion!
    //**********************************************
    public static void printProgram(){ 
        String word="Program";     
        int fullSize=word.length();     
        int i,j;     
        
        for(i=0;i<fullSize;i++){           
            for(j=0;j<fullSize;j++) {
              if(i==j ||i+j==fullSize-1)              
                  System.out.print(word.charAt(j));    
         if(j==fullSize-1)          
             System.out.println();
          else         
             System.out.print(" ");           
            }      
        }
    }
    
    //rotating a matrix****************************
    //**********************************************
    public static void reverseMatrix(){
        int a[][]=new int[5][5];
        Scanner s=new Scanner(System.in);
        System.out.println("enter order of matrix");
        int l=s.nextInt();


        for(int i=0;i<l;i++){
         for(int j=0;j<l;j++){
          a[i][j]=s.nextInt();
         }
        }
        rotate(a,l); 
    }
    
    public static void rotate(int[][] matrix,int n) {
        //find the transpose
        for ( int i = 0; i < n; i++) {
           for ( int j = i+1; j <n; j++) {
            int tmp = matrix[i][j];
                     matrix[i][j] = matrix[j][i];
                     matrix[j][i] = tmp;
           }
         }
       // swap the columns
        for ( int i = 0; i < n; i++ ) {
               for ( int j = 0; j < n/2; j++ ) {
                   int tmp = matrix[i][j];
                   matrix[i][j] = matrix[i][n-1-j];
                   matrix[i][n-1-j] = tmp;
               }
           }

        for ( int t = 0; t <n; t++) {
         for ( int q = 0; q <n; q++) {
          System.out.print(matrix[t][q]);
         }
         System.out.println();
        }
    }
    
    //panagram************************************
    public static void pangram(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word to test if it's pangram or not!: ");
        String s= sc.nextLine(); 
        s = s.toLowerCase();
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                int put = (int)s.charAt(i);
                //System.out.println(put);
                h.add(put);
            }
        }
        if(h.size()==26)
            System.out.println("pangram");
        else
            System.out.println("not pangram");            
    }  
    
    
    public static void isTriangle(){
        int []arr = {5, 4, 3, 1, 2};
        int N = arr.length;
         
        if(isPossibleTriangle(arr, N))
            System.out.println("Yes" );
        else
            System.out.println("No");
    }
    
    // Method prints possible triangle when
    // array values are taken as sides
    public static boolean isPossibleTriangle(int []arr, int N) {
         
        // If number of elements are less than
        // 3, then no triangle is possible
        if (N < 3)
            return false;
     
        // first sort the array
        Arrays.sort(arr);
     
        // loop for all 3 consecutive triplets
        for (int i = 0; i < N - 2; i++)
     
            // If triplet satisfies triangle
            // condition, break
            if (arr[i] + arr[i+1] > arr[i+2])
                return true;
                 
        return false;
    }
}
 
