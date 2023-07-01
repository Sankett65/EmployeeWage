package com.bridgelab.employee;

class Employee {
    public static final int IS_FULL_TIME = 2;
    public static int FULL_DAY_HOUR = 0;
    public static final int IS_PART_TIME = 1;

    String companyName;
    int daily_Employee_Wage_Per_Hour;
    public  int max_total_Working_Days;
    public  int max_total_Working_hour;

    public  void computeMonthSalaryForCompany(String companyName, int daily_Employee_Wage_Per_Hour, int max_total_Working_Days) {

             int emphour = 0;
             int total_working_days=0;
             int total_working_hour=0;
             int temp = 0;


            while (total_working_days < max_total_Working_Days){
                total_working_days++;
                    int empCheck = (int) Math.floor(Math.random() * 10) % 3;

                    switch (empCheck) {
                    case 1:
                        IS_PART_TIME:
                        emphour = 4;
                        break;
                    case 2:
                        IS_FULL_TIME:
                        emphour = 8;
                        break;
                    default:
                        emphour = 0;


                }
                total_working_hour += emphour;
                System.out.println("\nDay: "+total_working_days+" Hour: "+total_working_hour);

                int totalWage = total_working_hour * daily_Employee_Wage_Per_Hour;
                System.out.println("Wage of an employee of an "+companyName+" Company is "+totalWage);
                temp+=totalWage;

            }
        System.out.println("\nTotal wage of an Employee till day "+total_working_days+" is "+temp);
    }

}
public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Wage Computation ");

         Employee e = new Employee();
         e.computeMonthSalaryForCompany("Tata",20,2);
         e.computeMonthSalaryForCompany("Jio",30,3);



    }
}
