import java.text.ParseException;
import java.util.*;
import java.util.function.*;
/**
 * Kyle Evangelisto
 * Lab 04A
 */

/**
 *  OOPDA  FA20
 *  Lab 04A/B For-each Activity
 *  
 *  In this lab, we will focus on using 
 *  Lambdas individually, and with forEach() iteration, 
 *  by exploring the functional interface(s)
 *  for Consumer and Predicate and their standard methods.
 *
 */
public class ForEachDemo {
	
    private final static double RAISE = 1.05;
    private final static double BONUS_RAISE = 1.01;
    
    public static void main(String[] args) throws ParseException {
        //=====================================================================
        // Make an ArrayList with some test data
        List < Employee > emps = new ArrayList < Employee > ();
        emps.add(new Employee("Sue", "IT", 70000));
        emps.add(new Employee("Jon", "HR", 50000));
        emps.add(new Employee("Ken", "IT", 60000));
        //=====================================================================
        // Let's make some lambda functions, which can be used as parameters
        // Consumers take one argument (emp) and return no results
        //    Consumer<T>    -- Standard Functional Method = accept()
        Consumer < Employee > giveRaise = emp -> emp.setSalary(emp.getSalary() * RAISE);
        Consumer < Employee > giveBonus = emp -> emp.setSalary(
            emp.getDept().equals("IT") ? emp.getSalary() * BONUS_RAISE : emp.getSalary());
        //if true //: otherwise
        //====================================================================================
        // Use the Consumer functional interface to give a raise to an instance
        //   Consumer<T>    -- Standard Functional Method = accept()
        System.out.println("\nTesting Consumer functional interface");
        Employee john = new Employee("John", "Sales", 80000);
        System.out.println("\t" + john + " before running lambda");
        giveRaise.accept(john);
        System.out.println("\t" + john + " after running lambda");
        //====================================================================

        // we are invoking the forEach method of ArrayList [an Iterable implementor]
        System.out.println("\nUsing Consumer lambda functions in forEach");
        System.out.println("\nStarting salaries");
        emps.forEach(emp -> System.out.println(emp));
        System.out.println("\nThe standard raise");
        emps.forEach(giveRaise); // <-- Calls the function
        //An alternative syntax using an explicit declaration:
        emps.forEach((Employee emp) -> System.out.println(emp));
        //        note: class name
        System.out.println("\nThe IT bonus raise");
        emps.forEach(giveBonus); // <-- Call the function: only applies to IT emps
        emps.forEach(emp -> System.out.println(emp));

        //----------------------------------------------
        /* Activity:  
         * 1)   Complete code to declare a new Predicate that will 
         *      test for employees earning more than $50,000 
         *      and less than $70,000
         */

        /**
         * Make a new Predicate of type employee 
         * Test to see if employee salary is above 50,000 and below 70,000
         * Predicate returns a boolean
         */
        Predicate <Employee> checkSalary = employee -> {
            double salary = employee.getSalary();
            if (salary > 50000 && salary < 70000) {
                return true;
            }
            return false;
        };

        //-----------------------------------------------

        System.out.println("\nEmployees in range:");

        //-----------------------------------------------
        /*  2) For each employee in emps, filter for any inRange
         *     and display data
         * 
         */
        emps.forEach(employee -> System.out.println(
            "Name: " + employee.getName() + " " +
            "Department: " + employee.getDept() + " " +
            "In Range 50k ->70k? " + checkSalary.test(employee)));





        //-----------------------------------------------

        System.out.println("\nEmployees eligible for 2nd raise:");

        //-----------------------------------------------		
        /* 3) Make a BiPredicate so we can give a special, 
         * additional raise to impoverished workers who would 
         * make less than a given limit after a second raise.
         *
         * Then, re-process for another raise using $65,000 as the limit, 
         * and then display the list of eligible employees.
         *
         * [Note: using a limit of 65000.0 makes it a double, whereas 65000 is int]
         * 
         * [Note: assume variable RAISE is within scope for the purpose of calculating]
         * 
         *       Hint as pseudo-code:   
         *              list.forEach( e->  {
         *                  if(predicte_method)
         *                      desired action statement  
         *             }
         *          );
         * 
         */
        /**
         * Created a BiPredicate of type employee and double named "special" 
         * this BiPredicate gets an employee salary and sees if it is less that the bonus
         * if so, for each employee that makes less than 65000 it will get the salary and set the salary
         * to the salary * raise and output
         */
        BiPredicate <Employee, Double> special = (employee, bonus) -> employee.getSalary() < bonus; {
            emps.forEach(employee -> {
                if (special.test(employee, 65000.0)) {
                    employee.setSalary(employee.getSalary() * RAISE);
                    System.out.println(employee);
                }
            });

        };


    }
}