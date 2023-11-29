# QCalc

The objective of this project is to obtain basic skills in Java and OOPs principles by building a subset of features seen in calculators.

During the course of this project, 

1. Made use of different features of VSCode IDE to build the project.
2. Built feature of a calculator by taking OOPS Principles into consideration.
3. Fixed the bugs in the implementation for newly introduced features of calculator.

# Implement Simple Calculator

Scope of work,

1. Generate a Java Gradle Project using Spring Initializer Extension in VSCode IDE.
2. Implement basic arithmetic operations with two numbers and write unit tests to verify the functionalities.
3. Implement new methods to support floating point arithmetic operations using method overloading.

![image](https://github.com/SoumyaMehta/QCalc-main/assets/69056406/e2075546-86c1-46ea-9eb3-1e1182439844)


Skills used:

Java, Unit Testing, JUnit

# Identify and Handle Exceptions

Scope of work,

1. Identify and Handle Exceptions for invalid data.
2. Write unit tests to validate the Exception being thrown.

Skills used:

Java, Unit Testing, JUnit, Exception Handling

# Implement Scientific Calculator
Scope of work,

1. Extend the existing class to support new features for a Scientific Calculator.
2. Re-use and improve upon the existing features.

Skills used:

Java

# Debug and Fix Issues
Scope of work,

1. Fix compilation errors caused probably due to syntax / import issues.
2. Correct logical issues in the code.
3. Fix the behaviour of a method when data is invalid.
4. Write Unit Tests for edge cases initially not thought of.

Skills used:

Java, Unit Testing, JUnit, Exception Handling

# Pre-requisites
Java 1.8/1.11/1.15 Gradle 6 How to run the code We have provided scripts to execute the code.

Use run.sh if you are on Linux/Unix/macOS Operating systems and run.bat if you are on Windows.

Internally both scripts run the following commands

gradle clean build -x test --no-daemon - This will create a jar file geektrust.jar in the build/libs folder. java -jar build/libs/geektrust.jar sample_input/input1.txt - This will execute the jar file passing in the sample input file as the command line argument Use the build.gradle file provided along with this project. Please change the main class entry under the jar task

manifest { attributes 'Main-Class' : 'com.geektrust.backend.App' //Change this to the main class of your program which will be executed } in the build.gradle if your main class has changed.

# How to execute the unit tests
gradle clean test --no-daemon will execute the unit test cases.

# Help
You can refer our help documents here You can read build instructions here
