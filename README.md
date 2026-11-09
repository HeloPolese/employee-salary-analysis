Employee Salary Analysis

A small Java console application that reads employee data from a CSV file and produces two reports using the Streams API:

The e-mails of all employees whose salary is greater than a value informed by the user.
The sum of the salaries of all employees whose name starts with M (case-insensitive).
Requirements
Java 25 or later (the entry point is declared as static void main(), without parameters)
Any IDE (this project was built with IntelliJ IDEA) or the javac/java command line

On older Java versions, change the entry point to public static void main(String[] args).

Input file format

A plain text file with one employee per line, in the format name,email,salary:

maria,maria@gmail.com,3200.00
alex,alex@gmail.com,1900.00
marco,marco@gmail.com,1700.00
bob,bob@gmail.com,3500.00
anna,anna@gmail.com,2800.00
Fields are separated by commas, with no header line.
The salary uses a dot as the decimal separator (e.g. 3200.00).
How to run
Compile and run the Main class.
Enter the full path of the input file when prompted.
Enter the minimum salary.
Example
Enter full file path:
C:\data\employees.csv
Enter salary:
3300

Email of people whose salary is more than 3300.0:
bob@gmail.com

Sum of salary of people whose name starts with 'M':

4900.00
How it works
The file is read line by line with a BufferedReader inside a try-with-resources block, so it is always closed.
Each line becomes an Employee object, stored in a TreeSet.
The reports are built with streams:
filter + map + toList for the e-mail report;
filter + mapToDouble + sum for the salary total.
