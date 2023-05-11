// Imports
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

// Attention:
// The first method will take a lot of time to compute large numbers
// The second will take a fraction of a second to compute large numbers

class Main{
    public static void main(String[] args){

        // Scanner to create take user input
        Scanner scan = new Scanner(System.in);

        // Variable holding the number to be computed
        int n = 0;

        // Prompt the user for a positive integer input
        do {
            System.out.print("Enter a positive integer to compute its fibonacci: ");

            // Checks if the input is an integer
            while (!scan.hasNextInt()) {
                System.out.println("That's not an integer!");
                scan.next();
            }
            n = scan.nextInt();

        // Checks if the input is positive or = 0
        } while (n < 0);
        
        // Output
        System.out.println("The "+n+"th Fibonacci number is: "+ fib(n));
        System.out.println("The "+n+"th Fibonacci number using the optimized algorithm is: "+ optimizedFib(n));
    }

    // Recursive method calling
    // Time Complexity: O(2^n)
    // Space Complexity: O(n)
    private static int fib(int n) {
        // Base Cases
        if(n <= 1) return n;

        // Computes Fib(n) = Fib(n - 1) + Fib(n - 2) if n is not 0 or 1
        return fib(n - 1) + fib(n -2);
    }
    // The time complexity can be explained by the double recursive call on each iteration
    // The space complexity can be explained by the recursive stack call that holds at maximum n/2 hence O(n)


    // Optimized recursive calling
    // Relies on memoization to avoid recomputation of previously computed numbers
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    // Creating the hasmap globally to avoid recreatipon on each iteration
    // Holds the number the couple (n, fib(n))
    // This is way better because the get() method has a linear runtime
    private static Map<Integer, Integer> map = new HashMap<>();

    private static int optimizedFib(int n){
        // Base cases
        if(n <= 1) return n;

        // Check if we already computed the nth fibonacci number
        // If not compute it and store it in the hashmap
        if(!map.containsKey(n)){
            // Computing it with the optimized method is important
            map.put(n, optimizedFib(n - 1) + optimizedFib(n - 2));
        }

        // returning fib(n)
        return map.get(n);
    }
    // The time complexity can be explained by the fact that each number from 0 to n will be computed just once
    // The space complexity can be explained by the fact that the hashmap will hold every fibonacci number from 2 to n
}