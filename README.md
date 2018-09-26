# spark-assignment

Simple Spark Assignment =========>

Clone it form the url : https://github.com/Abhiknoldur/sparks-assignment.git

Run commands :

1 : cd sparks-assignment
2 : sbt clean compile
3 : sbt run


Apache Spark
Assignment 1
Aim​ :
Complete all the questions given below using Spark Shell or creating an SBT application using
Spark dependencies.
Questions​ :
Q1​​ . We have two Pair RDDs of type (Int, Double) and what we want is, when the keys are the
same, subtract their values.
E.g​ .
RDD_1 : (1, 3.6)
RDD_2: (1, 1.1)
Wanted result​ : (1, 2.5)
Q2​ . We have a RDD like below:
val rdd1 = sc.parallelize(Array((1,Array((3,4),(4,5))),(2,Array((4,2),(4,4),(3,9)))))
Which is ​ RDD[(Int,Array[(Int,Int)])]​ . We want to get the result like ​ RDD[(Int,(Int,Int)]​ by some
operations such as flatMap or else. The result should be:
(1,(3,4))
(1,(4,5))
(2,(4,2))
(2,(4,4))
(2,(3,9))
Q3​ . We have data like below
val rdd2 = sc.parallelize(Array((1,List(1,2,3,4)),(2,List(1,2,3,4)),(3,List(1,2,3,4)),(4,List(1,2,3,4))))
and we want output to be printed like following :
1--1
2--2
3--3
4--4Form of Submission​​ :
Assignment can be submitted in 2 ways
1. By Creating a SBT application containing answers and code for the above questions.
2. Or, by giving answers and code snippets for above questions, if you are using Spark
Shell.
Note​​ : All submissions should be done by sharing answers and code via GitHub. You can create
a public repository on your GitHub account, push your answers to it and provide its link for
submission. The last date for submission is 11 September 2018, 6:00 PM. A Form will be sent
via which the answers can be submitted.
