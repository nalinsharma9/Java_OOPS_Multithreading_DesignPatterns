//Few algos used in hash function are:
    //1. Division method
    //2. Folding method
    //3. Mid-square method

//Internally the hashmap uses a mix of these algorithms for least chances of collisions.

//These can also lead to collisions.
// For example, in Division method we can try to resolve by using each index as array list
// and store the values in ascending order in the list known as chaining. We can use binary search in the list to search for the element.
//This code for division method will fail for arr={11,1,2,3,5} due to collision.

package OOPS.Hashing;

import java.util.Scanner;

//Code to show hash function for division method
public class Collision {
    public static void main(String[] args) {
        int[] arr = {11,12,3,11,3,4};
        int[] hash = new int[13];

        //precompute
        for(int i=0;i<arr.length;i++){
            hash[arr[i]%10]++;
        }

        //Print the frequency of the element passed in next Q queries
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for(int i=0;i<q;i++){
            int num = sc.nextInt();
            //fetch
            System.out.println(hash[num%10]);
        }
    }
}
