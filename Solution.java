import java.util.*;
import java.lang.*;

class Solution
{  
    public static void main(String args[])
    {
        System.out.println("Enter number of even followed by number of odd");
        Scanner scan = new Scanner(System.in);
        int even = scan.nextInt();
        int odd = scan.nextInt();
        
        // the o-th odd number is 2*odd-1
        // the e-th even number is 2*even
        
        int oth = 2*odd-1, eth = 2*even;
        
        /*
        
        for 5: 4,2 are the younger siblings(that is the even numbers less than 5)
        for 6: 5,3,1 are the younger siblings(odd numbers less than 6)
        for 10: 9,7,5,3,1
        for 7: 6,4,2
         so we can see that the number of younger siblings is ...
          ... n/2 if n is even and (n-1)/2 if odd...
          ... and programming languages give us that by simple division by 2


         now, 8 can shoot with 7,5,3,1
         so, it can be like 
         (8,7), (8,5), (8,3), (8,1), 
         (8,7,5), (8,7,3), (8,7,1), (8,5,3), (8,5,1), (8,3,1)
         (8,7,5,3), (8,7,5,1), (8,7,3,1), (8,5,3,1)
         (8,7,5,3,1)

         we can make a observation that in all the combinations 8 is with the subsets of {7,5,3,1}, except the null set {}.
         and the number of subsets for a set of size n is 2^n  and here we wont be counting the null set therefore we have (2^n)-1.
        
        */
        
        int ans = 0, consider;
        
        // going for the even numbers
        for(int n=2; n<=eth; n+=2){ // going from 2 to the e-th number
            if (n > oth){

                // all odd numbers can be considered as n is more than the biggest odd number.

                consider = odd;

            }else{ // n < oth   ... n cant be equal to oth because n is even and oth is odd

                // all odd number less than n are to be considered... that is the n/2 numbers

                consider = n/2;
            }
            
            ans += Math.pow(2, consider)-1;
        
        }

        // now for the odd numbers
        for (int n=1; n<=oth; n+=2){

            if (n > eth){

                consider = even;

            }else{

                consider = n/2;
            }
        
            ans += Math.pow(2, consider)-1;
        }
        
        System.out.println(ans);
    }
}
