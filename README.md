# Developpement Data Analyse

## Getting started ?

- [Download and install Scala](https://www.scala-lang.org/download/)
- Clone the repository on your local machine

  `git clone https://gitlab.com/epsi1982729/developpement_data_analyse.git`

- Open the repository using an IDE (VSCode or IntelliJ Idea)

- Enable auto-import to import the dependencies from build.sbt

## Lists 

### [P01](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P01.scala) (*) Find the last element of a list.
  ``` scala
  scala> last(List(1, 1, 2, 3, 5, 8))
  res0: Int = 8
  ```

### [P02](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P02.scala) (*) Find the last but one element of a list.
  ``` scala
  scala> penultimate(List(1, 1, 2, 3, 5, 8))
  res0: Int = 5
  ```

### [P03](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P03.scala) (*) Find the Kth element of a list.
  ``` scala
  scala> nth(2, List(1, 1, 2, 3, 5, 8))
  res0: Int = 2
  ```

### [P04](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P04.scala) (*) Find the number of elements of a list.
  ``` scala
  scala> length(List(1, 1, 2, 3, 5, 8))
  res0: Int = 6
  ```

### [P05](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P05.scala) (*) Reverse a list.
  ``` scala
  scala> reverse(List(1, 1, 2, 3, 5, 8))
  res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  ```

### [P06](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P06.scala) (*) Find out whether a list is a palindrome.
  ``` scala
  scala> isPalindrome(List(1, 2, 3, 2, 1))
  res0: Boolean = true
  ```

### [P07](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P07.scala) (**) Flatten a nested list structure.
  ``` scala
  scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  ```

### [P08](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P08.scala) (**) Eliminate consecutive duplicates of list elements.
If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed. 
  ``` scala
  scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  ```

### [P09](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P09.scala) (**) Pack consecutive duplicates of list elements into sublists.
If a list contains repeated elements they should be placed in separate sublists. 
  ``` scala
  scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  ```

### [P10](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P10.scala) (*) Run-length encoding of a list.
Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E. 
  ``` scala
  scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  ```

### [P11](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P11.scala) (*) Modified run-length encoding.
Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms. 
  ``` scala
  scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  ```

### [P12](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P12.scala) (**) Decode a run-length encoded list.
Given a run-length code list generated as specified in problem P10, construct its uncompressed version. 
  ``` scala
  scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  ```

### [P13](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P13.scala) (**) Run-length encoding of a list (direct solution).
Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly. 
  ``` scala
  scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  ```

### [P14](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P14.scala) (*) Duplicate the elements of a list.
  ``` scala
  scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  ```

### [P15](https://github.com/codingkapoor/99-scala-problems/blob/master/src/main/scala/com/codingkapoor/p99/_01_lists/P15.scala) (**) Duplicate the elements of a list a given number of times.
  ``` scala
  scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  ```

## Test

- Use the following commands in the terminal from tp_spark/ :
    - `sbt test` : to test all classes
    - `sbt "test:testOnly *P01Spec"` : to test only the `P01Spec` class 