package com.bridgelab.employee;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation");
        int IS_FULL_TIME=2;
        int daily_Employee_Wage=20;
        int TOTAL_EMPLOYEE_WAGE=0;
        int FULL_DAY_HOUR=0;
        int IS_PART_TIME=1;
        double empCheck=Math.floor(Math.random()*10)%3;

        if (empCheck==IS_PART_TIME){
             System.out.println("Employee is Present");
             FULL_DAY_HOUR=4;
        } else if (empCheck==IS_FULL_TIME) {
            FULL_DAY_HOUR=8;
        } else {
            System.out.println("Employee is absent");
            FULL_DAY_HOUR=0;
        }
        TOTAL_EMPLOYEE_WAGE=FULL_DAY_HOUR*daily_Employee_Wage;
        System.out.println(TOTAL_EMPLOYEE_WAGE);
    }
}
