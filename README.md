# Data Structures & Algorithms in Java ☕📊

Welcome to my personal repository dedicated to mastering **Data Structures and Algorithms (DSA)** in Java. This repository contains my implementations of foundational computer science concepts, tracking runtime performance ($O(n)$ complexity), and solving algorithmic problems.

---

## 🏗️ Implemented Data Structures

Here is the breakdown of the custom data structures implemented in this repository:

* **Linear Data Structures:**
  * **Arrays:** `DynamicArray.java`, `Dynamic_Arrays.java`
  * **Linked Lists:** `Linked_List.java`, `Linked_Array.java`
  * **Stacks & Queues:** `Stackk.java`, `Queuee.java`, `Queue_Priority.java` (Priority Queue)
* **Non-Linear Data Structures:**
  * **Trees:** Binary Search Tree implementation (`Tree_lesson/BinarySearchTree.java`, `Node.java`, `Main.java`)
  * **Hash Tables:** `HashTable.java`
  * **Graphs (Representations):** 
    * `AdjancencyMatrix/` — Graph implementation using an Adjacency Matrix.
    * `AdjencyList/` — Graph implementation using an Adjacency List.

---

## ⚡ Algorithms & Problem Solving

### 1. Sorting Algorithms
* **Basic Sorts ($O(n^2)$):** `Bubble_sort.java`, `InsertionSort.java`, `Selection_sort.java`
* **Advanced Sorts ($O(n \log n)$):** `MergeSort.java`, `QuickSort.java`

### 2. Searching Algorithms
* `LinearSearch.java` — Sequential search ($O(n)$)
* `BinarySearch.java` — Logarithmic search for sorted arrays ($O(\log n)$)
* `InterpolationSearch.java` — Optimized search for uniformly distributed sorted arrays

### 3. Graph Traversal
* `BFS.java` — Breadth-First Search algorithm for exploring graphs.

### 4. Mathematical & Core Logic
* `Eratosthenes.java` — Sieve of Eratosthenes for finding prime numbers efficiently.
* `primeNumber.java` — Prime number verification logic.
* `recursion.java` — Practice problems on recursive thinking.
* `executeTime.java` — Utility to measure and analyze algorithm execution time.

---

## ⏱️ Complexity Reference (Big O)

| Algorithm / Structure | Average Time | Worst Time | Space Complexity |
| :--- | :--- | :--- | :--- |
| **Binary Search** | $O(\log n)$ | $O(\log n)$ | $O(1)$ |
| **Quick Sort** | $O(n \log n)$ | $O(n^2)$ | $O(\log n)$ |
| **Merge Sort** | $O(n \log n)$ | $O(n \log n)$ | $O(n)$ |
| **Sieve of Eratosthenes**| $O(n \log \log n)$| $O(n \log \log n)$| $O(n)$ |

---

## 🛠️ Environment & Tools
* **Language:** Java (JDK 17+)
* **Concepts:** OOP, Memory Management, Time Complexity Analysis
* **Execution:** Run individual `Main.java` or sorting/searching files to test functionality.

## 🚀 How to Run
1. Clone this repository.
2. Open it in IntelliJ IDEA, Eclipse, or VS Code.
3. To check runtime performance, run `executeTime.java` alongside any sorting algorithm.
