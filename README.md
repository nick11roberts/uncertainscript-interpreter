# uncertaintyscript-interpreter
Interpreter for uncertaintyscript, a quantum scripting language. 

# What is this? 
* Interpreter for a quantum information programming language
* Uses quantum bits or ‘qubits’ as the unit of information as opposed to classical bits (0/1)
  * Represented as a ‘probability vector’ of complex numbers
* Programmable with quantum logic gates
  * Analogous to classical logic operators

# Why would you do something like this?
* Was taking a quantum information theory class at the time
* Designed and implemented at a hackathon at CalTech, the birthplace of quantum computing
  * Thanks Richard Feynman!
* Wanted to better understand the math behind quantum algorithm design
* Wanted to understand why classical computers can’t simulate quantum computers
  * Spoiler: this is because quantum gate operations are O(1) in nature and O(N^3) in implementation due to matrix multiplications

# How did you do this? 
* Written in Scala using the NLP Breeze package for linear algebra computations
* Used Gradle for building and dependency management
* Interpreter pattern as opposed to Lex and Yacc
  * Wanted to ‘roll my own’ just for fun
* Lots of caffeine 
  * It was a hackathon project after all

![Interpreter pattern](https://en.wikipedia.org/wiki/Interpreter_pattern#/media/File:Interpreter_UML_class_diagram.svg)
Format: ![Alt Text](url)

![uncertaintyscript](https://github.com/nick11roberts/uncertaintyscript-interpreter/blob/master/uncertaintyscript%20(1).png)
Format: ![Alt Text](url)
