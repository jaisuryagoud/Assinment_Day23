import java.util.Scanner;
public class Employee {
int workingDays = 0;
int totalHours = 0;
int empHours = 0;
int empRatePerHour = 20;
int salary = 0;
public void companyMethod(int wage, int days, int hours){
int totalWage = ( wage * days * hours);
System.out.println("Total wage for a employee working full-time for a
month:"+totalWage);
}
System.out.println("Total salary :" + salary + " Hours worked:" + totalHours + "
Working Days:" + workingDays);

}
public static void main(String[] args) {
Employee ep = new Employee();
Scanner sc = new Scanner(System.in);
ArrayList<Employee> al = new ArrayList<Employee>();
System.out.println("Welcome to Employee Wage Computation Program\n");
System.out.println("Enter the wage per hour of your company :");
int wage = sc.nextInt();
System.out.println("Enter the number of working day in a month :");
int days = sc.nextInt();
System.out.println("Enter the number of working hours in a day :");
int hours = sc.nextInt();
ep.companyMethod(wage, days, hours);
}
}