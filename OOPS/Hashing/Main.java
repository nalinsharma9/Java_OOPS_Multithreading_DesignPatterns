//Hashing is the process of transforming any given key or a string of characters into another value using the mathematical formulas known as hash functions.
// This technique determines an index or location for the storage of an item in a data structure so that fetching can be faster.

//Time complexity: Best case: O(1), Worst case: O(n)

//Few algos used in hash function are:
    //1. Division method
    //2. Folding method
    //3. Mid square method

//These can also lead to collisions check Collision class for more details.

package OOPS.Hashing;

import java.util.Scanner;

//An example where we are given an array of each element can have max value 12
// We need to count the frequency of each element in the array.
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            arr[i] = x;
        }

        //precompute
        //Note that JVM can only declare an array of max size 10^9, hence we need to use other computations techniques
        //One of them could be taking modulus of each number to get the hash index.
        //int[] hash = new int[10000000000];

        int[] hash = new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }


        //Print the frequency of the element passed in next Q queries
        int q;
        q = sc.nextInt();
        for(int i =0;i<q;i++){
            int num = sc.nextInt();
            //fetch
            System.out.println(hash[num]);
        }
    }
}
