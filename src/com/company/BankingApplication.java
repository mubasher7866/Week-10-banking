package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class BankingApplication {

    public static void main(String[] args) {

        Scanner readUserType = new Scanner(System.in);
        Scanner readEmployeePin = new Scanner(System.in);
        Scanner readEmployeeAction = new Scanner(System.in);
        Scanner readCustomerDetails = new Scanner(System.in);

        ArrayList<Customer> list = new ArrayList<>();

        int userType, employeeAction, loop = 0;
        String pin, firstName, lastName, email, line;
        String accountNumber, pincode;
        Employee employee = new Employee();
        while (loop != -1) {

            System.out.println("-------------------------------------------");
            System.out.println("PLease login to you account!");
            System.out.println("1: Employee");
            System.out.println("2: Customer");
            System.out.println("3: Close");
            System.out.println("-------------------------------------------");
            System.out.print("Enter 1 or 2 to select user type: ");

            userType = readUserType.nextInt();
            if (userType == 1) {
                System.out.println("Account Type: Employee");
                System.out.print("Enter your pin: ");
                pin = readEmployeePin.nextLine();
                if (!pin.isEmpty()) {
                    if (employee.pin.contentEquals(pin)) {
                        System.out.println("Login Successful!\n");
                        while (userType != 3) {

                            System.out.println("---- Menu ----");
                            System.out.println("1: Create Customer Account");
                            System.out.println("2: Delete Customer Account");
                            System.out.println("3: View Customer Details");
                            System.out.println("4: Log Out");

                            System.out.print("Select the action you want to perfotm: ");
                            employeeAction = readEmployeeAction.nextInt();
                            if (employeeAction == 1) {
                                System.out.println("Create Customer Account!");
                                System.out.println("---- Enter Customer Details ----");
                                System.out.print("Enter First Name: ");
                                firstName = readCustomerDetails.nextLine();
                                System.out.print("Enter Last Name: ");
                                lastName = readCustomerDetails.nextLine();
                                System.out.print("Enter Email: ");
                                email = readCustomerDetails.nextLine();
                            }
                        }

                    }
                }
            }
        }
    }
}
