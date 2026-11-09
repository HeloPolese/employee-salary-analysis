<h1 align="center">💼 Employee Salary Analysis</h1> <p align="center"> Console application in Java that reads employees from a CSV file<br> and generates salary reports using the Streams API. </p> <p align="center"> <img src="https://img.shields.io/badge/Java-25%2B-orange?logo=openjdk&logoColor=white" alt="Java 25+"> <img src="https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue?logo=intellijidea&logoColor=white" alt="IntelliJ IDEA"> <img src="https://img.shields.io/badge/Status-Study%20project-green" alt="Status"> </p>
📑 Table of Contents
About
Features
Requirements
Input file format
How to run
How it works
Project structure
Possible improvements
📖 About

The program loads a list of employees (name, e-mail and salary) from a text file and answers two questions about the data, using Java Streams.

✨ Features
#	Report	Description
1	E-mails above a salary	Lists the e-mails of every employee whose salary is greater than a value informed by the user
2	Total salary of "M" names	Sums the salaries of all employees whose name starts with M (case-insensitive)
🧰 Requirements
Java 25 or later (the entry point is declared as static void main())
Any IDE (built with IntelliJ IDEA) or the javac / java command line

[!NOTE] On older Java versions, change the entry point to public static void main(String[] args).

📄 Input file format

A plain text file with one employee per line, as name,email,salary:

csv
maria,maria@gmail.com,3200.00
alex,alex@gmail.com,1900.00
marco,marco@gmail.com,1700.00
bob,bob@gmail.com,3500.00
anna,anna@gmail.com,2800.00
Fields are separated by commas, with no header line.
The salary uses a dot as the decimal separator (e.g. 3200.00).
▶️ How to run
Compile and run the Main class.
Enter the full path of the input file when prompted.
Enter the minimum salary.

Example session

text
Enter full file path:
C:\data\employees.csv
Enter salary:
3300

Email of people whose salary is more than 3300.0:
bob@gmail.com

Sum of salary of people whose name starts with 'M':

4900.00
