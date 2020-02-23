# SortManager
Java project implementing different array sorting methods using an MVC architecture. 


**Project includes:**


### App (view)

A class that contains the main method and this is where the user can input their sort type and arrays into pre-made methods that give back the sorted and/or merged arrays. 

### UserInput (controller)

A class that includes the implementation of the sortArray method that takes parameters from the user.

### Logic of the sorts (model):

### SwapNumber

A class that implements a method to swap an element in an array with the next element later to be used in bubbleSort

### BubbleSort: 

A class with a method implementing a way to sort the elements of a random length integer array into ascending order with Bubble Sort.

### SortedMerger

A class with a method implementing a way to merge two sorted arrays into one combined sorted array (ascending). 

### DivideAndMerge

A class with a method implementing a way to divide up an unsorted array into one element sub array and then use the SortedMerger to merge them into a single sorted array in ascending order (divide and conquer method). 

### BinaryTree

Consists of a class called BinaryTreeImpl that implements the BinaryTree interface to sort an array of ints by first puting them into a binary tree and then going through the tree to sort them, and a class called Node that sets up the methods and variables needed for building the binaryTree structure. Ascendign + descending.

### Other (not MVC) 

### ManualTests

A class that uses the above methods for a couple of example cases I have used to manually test them while I was working on it.



