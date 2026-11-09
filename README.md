# Employee Salary Analysis

A Java console application that reads employee data from a CSV file and generates salary reports using the **Java Streams API**.

![Java](https://img.shields.io/badge/Java-25%2B-orange?logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue?logo=intellijidea&logoColor=white)
![Status](https://img.shields.io/badge/Status-Study%20Project-green)

---

## Table of Contents

- [About](#about)
- [Features](#features)
- [Requirements](#requirements)
- [Input File Format](#input-file-format)
- [How to Run](#how-to-run)
- [How It Works](#how-it-works)
- [Project Structure](#project-structure)
- [Possible Improvements](#possible-improvements)

---

## About

This project was developed to practice Java programming, file reading, and data processing using the **Streams API**.

The application loads employee information from a CSV file and generates two reports based on the data.

## Features

| # | Report | Description |
|---|---|---|
| 01 | **Emails Above a Salary** | Lists the email addresses of employees whose salary is greater than a value provided by the user. |
| 02 | **Total Salary of Employees with M Names** | Calculates the total salary of employees whose names start with the letter `M` (case-insensitive). |

## Requirements

- Java 25 or later.
- IntelliJ IDEA or another Java IDE.
- Alternatively, `javac` and `java` for command-line execution.

> **Note:** Java versions older than 25 require the traditional entry point: `public static void main(String[] args)`.

## Input File Format

The application expects a CSV file containing one employee per line, following this format:

```csv
maria,maria@gmail.com,3200.00
alex,alex@gmail.com,1900.00
marco,marco@gmail.com,1700.00
bob,bob@gmail.com,3500.00
anna,anna@gmail.com,2800.00
```

**File specifications:**

- Fields must be separated by commas.
- No header line is required.
- Salary values must use a dot (`.`) as the decimal separator.

## How to Run

1. Clone this repository.
2. Open the project in IntelliJ IDEA or your preferred Java IDE.
3. Compile and run the `Main` class.
4. Enter the full path to the CSV file when prompted.
5. Enter the minimum salary for the first report.

### Example Execution

```text
Enter full file path: C:\data\employees.csv
Enter salary: 3300

Email of people whose salary is more than 3300.0:
bob@gmail.com

Sum of salary of people whose name starts with 'M':
4900.00
```

## How It Works

The application uses the **Java Streams API** to process employee data:

- **File Reading:** Loads employee records from the CSV file.
- **Filtering:** Selects employees based on salary and name criteria.
- **Mapping:** Extracts email addresses for the first report.
- **Reduction:** Calculates the total salary for employees whose names start with `M`.



<p align="center">
  Developed as a Java study project.
</p>
