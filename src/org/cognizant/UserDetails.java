package org.cognizant;
// child 1
public class UserDetails extends EmployeeLogin{
public void userName() {
	System.out.println("rk");
}
public static void main(String[] args) {
	UserDetails a = new UserDetails();
	             a.userName();
	             a.employeeName();
}
}
