import java.util.Scanner;
public class Employee {
int workingDays = 0;
int totalHours = 0;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;

int wage = 0;
int days = 0;
int hours = 0;
int totalWage = 0;
Employee(int wage, int days, int hours){
this.wage = wage;
this.days = days;
this.hours = hours;
this.totalWage = ( wage * days * hours);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Welcome to Employee Wage Computation Program\n");
System.out.println("How many companies are there: ");
int size = sc.nextInt();
Employee[] emp = new Employee[size];
for(int i =0; i < size; i++){
System.out.println("Enter details for company "+i);
System.out.println("Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println("Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println("Enter the number of working hours in a day :");
int hours = sc.nextInt();
emp[i] = new Employee(wage, days, hours);
}
Int i = 0;
for (Employee p : emp){
i++;
System.out.println("Total Wage for Company "+i+" is :"+ p.totalWage);
}

}
}