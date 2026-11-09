package org.example;


import java.io.*;
import java.math.BigDecimal;
import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        System.out.println("Enter full file path: ");
        File file = new File(sc.nextLine());


        Set<Employee> employees = new TreeSet<>();


        try(BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line = bf.readLine();


            while (line != null){
                String[] pieces = line.split(",");
                String name = pieces[0];
                String email = pieces[1];
                double salary = Double.parseDouble(pieces[2]);


                Employee employee = new Employee(name, email, salary);
                employees.add(employee);


                line = bf.readLine();
            }


            System.out.println("Enter salary: ");
            double x = sc.nextDouble();


            List<String> emailsAboveMinSalary  = employees.stream().
                    filter(employee -> employee.getSalary() > x)
                    .map(Employee::getEmail)
                    .toList();


            System.out.println("\nEmail of people whose salary is more than " + x + ":");


            for (String email : emailsAboveMinSalary){
                System.out.println(email);
            }


            System.out.println("\nSum of salary of people whose name starts with 'M':");


            Double totalSalaryNamesStartingWithM = employees.stream()
                    .filter(employee -> employee.getName().toUpperCase().startsWith("M"))
                    .map(Employee::getSalary)
                    .reduce(0.0,Double::sum);


            System.out.println("\n"+ String.format("%.2f",totalSalaryNamesStartingWithM));


        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        finally {
            sc.close();
        }


    }
}




