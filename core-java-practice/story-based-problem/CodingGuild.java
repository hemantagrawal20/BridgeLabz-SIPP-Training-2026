package main.java.coreJavaPractice.storyBasedProblem;
import java.util.Scanner;
public class CodingGuild {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your rank: ");
        String rank = sc.next();
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter your membership fee: ");
        float membershipFee = sc.nextFloat();


        int annualBonus = (int)(salary * 0.12);


        System.out.println("=================================");
        System.out.println("      WELCOME TO THE GUILD       ");
        System.out.println("=================================");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : ₹" + salary);
        System.out.println("Membership Fee : ₹" + membershipFee);
        System.out.println("Annual Bonus   : ₹" + annualBonus);
        System.out.println("=================================");
        System.out.println("Welcome, " + name + "! We are glad to have you.");
        System.out.println("=================================");
    }
}
