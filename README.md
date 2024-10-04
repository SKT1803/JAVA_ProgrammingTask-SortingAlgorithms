<h2>Part 1:</h2>
In this part of the assignment, you are asked to write different sorting algorithms. The goal of the
task is to exercise the details of sorting algorithms and have hands-on experience with
programming with sorting APIs.
<br>
<br>
Here are the steps 
<br>
<br>
<b>Step 1. </b>In this step, first write a program (i) that loads N integers from a file and (ii) that creates a
random array and uses the insertion sort algorithm. (In the text file, the first line in the input file should be the size of the array, and each following line should consist
of a single integer).
<br>
<br>
<b>Step 2. </b>In this second step, modify this insertion sort algorithm such that it sorts the input integer
array in descending order, and start sorting the array FROM-RIGHT-TO-LEFT.
<br>
<br>
<b>Step 3.</b> Use the Insertion sort algorithm on Page 251, now to sort an array of double values instead of integers.
<br>
<br>
<b>Step 4.</b> Modify the top-down Merge Sort algorithm on page 273 to sort the input integer array in descending order.
<br>
<br>
<b>Step 5.</b> In this step, create a Route class. Each route should have two fields: a String attribute,
called source, and a second String attribute called destination. The Route class should
implement the Comparable interface to be able to compare Route objects with respect to their
source and destination. The Route objects are first ordered (alphabetically) with respect to their
source. If their sources are the same, they are ordered (alphabetically) with respect to their
destinations.
<br>
<br>
<b>Step 6. </b>Use the Quick Sort method to sort the given Route objects. For this
purpose, create 10 different Route objects, each with a source and destination from of one these
four cities: Ankara, Istanbul, Antalya, and Izmir. Then, call this method to sort these objects with
respect to source and destination.
<br>
<br>
<b>Step 7.</b> In this step, modify the Quick Sort partition method to sort the elements
in descending order.
<br>
<br>
<b>Step 8.</b> In this last step, assume that (recursive) Quick Sort method receives an int parameter
depth; from the main driver that is initially approximately 2 log N. Modify this recursive Quick
Sort to call Merge Sort on its current subarray if the level of recursion has reached depth.
(Hint: Decrement depth as you make recursive calls; when it is 0, switch to Merge Sort.) Call
this new function to sort the elements in descending order.
<br>
<br>
<h2>Part 2:</h2>
In this part, first, you are expected to write a static method that takes an arrayof
n integers and prints the smallest pairwise absolute difference between them along with the
corresponding pair of numbers.
<br>
<br>
Your solution is expected to be composed of two steps:
<br>
<br>
<ul>
  <li>Sort the given array.</li>
  <li>Print <b>the smallest pairwise absolute difference</b> along with the corresponding pair of numbers.
     The running time complexity of this step has to be O(n).
  </li>
</ul>

If there are more than one pair with the smallest absolute difference, only the one whose sum is the
smallest is printed.

  <b>Example input and outputs should be as follows:</b>
<pre>
  ->There is one pair with the smallest absolute difference
  Input: 23, 1, 5, 102, 34, 99
  Output: 3 [99 102]
  
  ->There are more than one pair with the smallest absolute difference, only the one whose sum isthe
  smallest is printed
  Input: 23, 1, 4, 102, 34, 99
  Output: 3 [1 4]
  
  Input: 113, 23, 1, 109, 4, 102, 7, 105, 100, 107
  Output: 2 [100 102]
</pre>

After writing your method as described above, you are expected to make its experimental run time
analysis in the four different settings where in each setting you are going to use a differentsorting
algorithm:
<ul>
  <li>Selection Sort</li>
  <li>Insertion Sort</li>
  <li>Merge Sort</li>
  <li>Quick Sort</li>
</ul>

In this way, you are going to observe and report how the performance of your method changes
when different sorting algorithms are used. Based on the experimental results that you obtain,
comment on the complexity of your method using each sorting method.
<br>
<br>
While doing experimental analysis of the method in each setting, you are expected to run it for
<b>different sizes</b> of <b>ascending/descending</b> and <b>random ordered</b> integer arrays.

<ol>
  <li>To make experimental analysis of your method, create a new SortingAlgorithmTester class,
and within the main method create an array with (i) ascending, (ii) descending, or (iii)
random integers, to be sorted with each algorithm. You can get a random list using the java
class Random, located in java.util.Random.
 </li>
  <br>
  <li>
    As you test your method in different settings, collect time measures. Time is measured in
milliseconds. You should use the System.currentTimeMillis() method, which
returns a long that contains the current time (in milliseconds). It is recommended that you
do several runs of your method on a given array and take the median value (throw out the
lowest and highest time). In order to get the most accurate runtimes possible, you may want
to close other programs that might be taking a lot of processing power and memory and
affecting the runtimes of your method.
  </li>
</ol>




