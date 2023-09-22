package tri.nguyen;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Recursion {

    /*
   Recursion:              When a thing is defined in terms of itself
                           Occurs when the definition of a concept or process depends on a simpler version of itself.
                           [Wikipedia: https://en.wikipedia.org/wiki/Recursion]

                           Apply the result of a procedure to a procedure.
                           A recursive method calls itself.
                           Can be a substitute for iteration.
                           Divide a problem into sub-problems of the same type as the original.
                           Commonly used with advanced sorting algorithms and navigating trees.

   Runtime Complexity:     Quadratic time O(n^2)
                           small data set = okay-ish
                           large data set = BAD (should never use this)

   Pros:                    Easier to Read/Write
                            Easier to Debug

   Cons:                    Sometimes slower
                            Use more memory
    */

    /*
    Call Stack:
    In computer science, a call stack is a stack data structure that store info about the active subroutines of a computer program.
    This kind of stack is also known as an execution stack, program stack, control stack, run-time stack, or machine stack,
    and is often shortened to just "the stack".
    [Wikipedia: https://en.wikipedia.org/wiki/Call_stack]
     */

    /*
                            Iteration                           Recursion
    Implementation          uses loops                          calls itself

    State                   control index                       parameter values
                            (int steps = 0)                     walk (int steps)

    Progression             move toward value in condition      converge towards base case

    Termination             index satisfies condition           base case = true

    Size                    More Code                           Less Code
                            Less Memory                         More Memory

    Speed                   Faster                              Slower


     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to find the factorial: ");

        int num = input.nextInt();

        System.out.println("The factorial of " + num + " is:  " + factorial(num));

        System.out.print("Please enter the base: ");
        int base = input.nextInt();

        System.out.print("Please enter the exponent: ");
        int exponent = input.nextInt();

        System.out.println("The result of " + base + " to the power of " + exponent + " is " + power(base, exponent));
    }

    private static int factorial(int num) {

        if (num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive
    }

    private static int power(int base, int exponent) {

        if (exponent < 1) return 1; // base case
        return base * power(base, exponent -1); // recursive case
    }
  }
