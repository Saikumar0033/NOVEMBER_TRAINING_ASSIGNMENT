package Oops_Q11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the emp id ");
		int empId = sc.nextInt();
		System.out.println("enter the emp name");
		String empName = sc.next();
		System.out.println("enter the emp salary");
		int empSalary = sc.nextInt();
		System.out.println("enter the emp Address ");
		String empAddress = sc.next();
		System.out.println("enter the emp Date of Birth ");
		String empDOB = sc.next();
		Date empDob = new SimpleDateFormat("dd/MM/yy").parse(empDOB);
		System.out.println("enter the emp date of joining ");
		String empDoj = sc.next();
		Date empDOJ = new SimpleDateFormat("dd/MM/yy").parse(empDoj);
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpSalary(empSalary);
		employee.setEmpAddress(empAddress);
		employee.setEmpDOB(empDob);
		employee.setEmpDoj(empDOJ);
		System.out.println("Employee Id : " + employee.getEmpId());
		System.out.println("Employee Name : " + employee.getEmpName());
		System.out.println("Employee Salary  : " + employee.getEmpSalary());
		System.out.println("Employee Address : " + employee.getEmpAddress());
		System.out.println("Employee DOB : " + employee.getEmpDOB());
		System.out.println("Employee DOJ : " + employee.getEmpDoj());
	}
	
}
