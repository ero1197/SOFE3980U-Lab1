# SOFE3980U-Lab1

Report: BinaryCalculator Design and Testing

The BinaryCalculator project demonstrates the implementation of binary operations, including Addition, Bitwise OR, Bitwise AND, and Multiplication. This report outlines the source code modifications, the testing approach, and the results achieved.

Source Code Modifications 
2.1 Binary Class: The Binary class was extended to include three new methods to handle the following operations: 
- Bitwise OR: Computes the logical OR of two binary numbers.
- Bitwise AND: Computes the logical AND of two binary numbers. 
- Multiplication: Multiplies two binary numbers using repeated addition. 

2.2 App Class: The App class was enhanced to make the program more interactive. It allows users to:
- Input two binary numbers. 
- Select an operation (Addition, OR, AND, Multiplication). 
- View the result of the selected operation. 


Testing Code 
The BinaryTest class was extended with new test methods to validate the OR, AND, and Multiplication methods. Each method was tested with various inputs, including binary numbers of the same length, different lengths, and special cases such as zero and one. 

Results
The Maven build process was successful, and the JAR file BinaryCalculator-1.0.0-jar-with-dependencies.jar was generated. All test cases passed successfully, confirming the correctness of the new methods. 

Conclusion 
The project demonstrates the successful addition of binary operations, interactive user functionality, and comprehensive test coverage. This project highlights the effective use of Maven for build management and the JUnit framework for testing, ensuring software quality and maintainability.
