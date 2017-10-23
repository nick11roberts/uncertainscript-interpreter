# uncertaintyscript-interpreter
Interpreter for UncertaintyScript, a quantum scripting language developed by a caffeinated UCSD undergrad at a CalTech hackathon. 

## What is this? 
* Interpreter for a quantum information programming language
* Uses quantum bits or ‘qubits’ as the unit of information as opposed to classical bits (0/1)
  * Represented as a ‘probability vector’ of complex numbers
* Programmable with quantum logic gates
  * Analogous to classical logic operators

## Why would you do something like this?
* Was taking a quantum information theory class at the time
* Designed and implemented at a hackathon at CalTech, the birthplace of quantum computing
  * Thanks Richard Feynman!
* Wanted to better understand the math behind quantum algorithm design
* Wanted to understand why classical computers can’t simulate quantum computers

## How did you do this? 
* Written in Scala using the NLP Breeze package for linear algebra computations
* Used Gradle for building and dependency management
* Interpreter pattern as opposed to Lex and Yacc
  * Wanted to ‘roll my own’ just for fun
* Lots of caffeine 
  * It was a hackathon project after all

## How the code organized?
The class relationships are described in the following UML diagram. Most classes are in their own files. 
![uncertaintyscript](https://github.com/nick11roberts/uncertaintyscript-interpreter/blob/master/uncertaintyscript%20(1).png)

## How do I run this?
If you aren't familiar with Gradle, check it out [here](https://gradle.org/). 
