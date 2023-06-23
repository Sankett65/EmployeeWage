package com.bridgelab.employee;

class Employee {
    public static final int IS_FULL_TIME = 2;
    public static int TOTAL_EMPLOYEE_WAGE = 0;
    public static int FULL_DAY_HOUR = 0;
    public static final int IS_PART_TIME = 1;

    int daily_Employee_Wage = 10;

    int empCheck = (int) Math.floor(Math.random() * 10) % 3;

    public void computeMonthSalaryUsingDays( int total_Working_Days) {
        if (total_Working_Days >= 20) {
            for (int i = 1; i <= total_Working_Days; i++) {

                switch (empCheck) {
                    case 1:
                        IS_PART_TIME:
                        FULL_DAY_HOUR = 4;
                        break;
                    case 2:
                        IS_FULL_TIME:
                        FULL_DAY_HOUR = 8;
                        break;
                    default:
                        FULL_DAY_HOUR = 0;


                }

                TOTAL_EMPLOYEE_WAGE = FULL_DAY_HOUR * daily_Employee_Wage;
                TOTAL_EMPLOYEE_WAGE *= total_Working_Days;


            }
            System.out.println("\nWage of a employee for a month using days "+TOTAL_EMPLOYEE_WAGE);
        }

    }
        public void computeMonthSalaryUsingHour( int total_Working_Hour){
        if (total_Working_Hour >= 100){
            for (int i = 1; i <= total_Working_Hour; i++) {

                switch (empCheck) {
                    case 1:
                        IS_PART_TIME:
                        FULL_DAY_HOUR = 4;
                        break;
                    case 2:
                        IS_FULL_TIME:
                        FULL_DAY_HOUR = 8;
                        break;
                    default:
                        FULL_DAY_HOUR = 0;


                }

                TOTAL_EMPLOYEE_WAGE = FULL_DAY_HOUR * daily_Employee_Wage;
                TOTAL_EMPLOYEE_WAGE *= total_Working_Hour;

            }
            System.out.println("\nWage of a employee for a month using hours "+TOTAL_EMPLOYEE_WAGE);
        }


    }
}
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");

         Employee e = new Employee();
         e.computeMonthSalaryUsingDays(30);
         e.computeMonthSalaryUsingHour(98);

    }
}
