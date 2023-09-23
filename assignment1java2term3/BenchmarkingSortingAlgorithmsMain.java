/* University of the People - Introduction to Programming 2 - Assignment solution for Unit 1
Part 1: Benchmarking Sorting Algorithms
The same task can take vastly different amounts of time, depending on the algorithm that is used to perform the task. You are familiar with simple sorting algorithms such as insertion sort and selection sort. (See Section 7.4 in the textbook.) While these methods work fine for small arrays, for larger arrays they can take an unreasonable amount of time. The question is whether we can do any better.
Java has some built-in sorting methods. They can be found in the class named Arrays in the package java.util. The one that you will use in this lab is Arrays.sort(A), which sorts the entire array A into increasing order. (Actually, there are different methods for different array base types, but all the methods have the same name and are used in the same way. You will be using an array of ints in this lab.)
You should write a program that does the following:
- Create two arrays of type int[]. Both arrays should be the same size, and the size should be given by a constant in the program so that you can change it easily.
- Fill the arrays with random integers. The arrays should have identical contents, with the same random numbers in both arrays. To generate random integers with a wide range of sizes, you could use (int)(Integer.MAX_VALUE * Math.random()).
- Sort the first array using either Selection Sort or Insertion Sort. You should add the sorting method to your program; you can copy it from Section 7.4 if you want. (It is a good idea to check that you got the sorting method correct by using it to sort a short array and printing out the result.)
- Time how long it takes to sort the array and print out the time.
- Now, sort the second (identical) array using Arrays.sort(). Again, time how long it takes, and print out the time.
You should run your program using array sizes of 1,000, 10,000, and 100,000. Record the sort times. Add a comment to the top of the program that reports the times.
Note: The general method for getting the run time of a code segment is:
long startTime = System.currentTimeMillis();
doSomething();
long runTime = System.currentTimeMillis() - startTime;
This gives the run time in milliseconds. If you want the time in seconds, you can use runTime/1000.0.
*/

package assignment1java2term3;

public class BenchmarkingSortingAlgorithmsMain {
    public static void main(String[] args) {
    
    BenchmarkingSortingAlgorithms SortingTest = new BenchmarkingSortingAlgorithms();
    // Create new class of type BenchmarkingSortingAlgorithms
    
    }

}