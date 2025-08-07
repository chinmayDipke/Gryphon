import java.util.Scanner;

public class LastQue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Collect input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your year of birth: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        sc.nextLine(); // clear newline

        System.out.print("Enter your father's name: ");
        String father = sc.nextLine();

        System.out.print("Enter your mother's name: ");
        String mother = sc.nextLine();

        System.out.print("Enter number of family members: ");
        int members = sc.nextInt();

        System.out.print("Enter number of earning members: ");
        int earners = sc.nextInt();
        sc.nextLine();

        System.out.print("Do you own a house? (yes/no): ");
        String house = sc.nextLine();

        System.out.print("Do you own a vehicle? (yes/no): ");
        String vehicle = sc.nextLine();

        System.out.print("Do you use internet? (yes/no): ");
        String internet = sc.nextLine();

        System.out.println("\n--- Final Result ---");

        int currentYear = 2025;
        int age = currentYear - birthYear;

        int perHeadIncome = 0;
        if (earners > 0) {
            perHeadIncome = salary / earners;
        }

        // 11 if and 11 else
        if (name.length() > 0) {
            if (age >= 18) {
                if (salary >= 20000) {
                    int tax = salary * 10 / 100;
                    int net = salary - tax;
                    System.out.println("You're an adult earning well.");
                    System.out.println("Tax deducted: ₹" + tax);
                    System.out.println("Net salary after tax: ₹" + net);
                } else {
                    if (salary > 0) {
                        System.out.println("You're earning but below tax limit.");
                    } else {
                        System.out.println("You should try to find a job.");
                    }
                }
            } else {
                if (age >= 10) {
                    System.out.println("You are a student. Focus on studies.");
                } else {
                    System.out.println("You are too young.");
                }
            }
        } else {
            if (father.length() == 0) {
                if (mother.length() == 0) {
                    System.out.println("Parent details missing.");
                } else {
                    System.out.println("Only father's name missing.");
                }
            } else {
                if (members > 0) {
                    int incomePerPerson = salary / members;
                    if (incomePerPerson > 5000) {
                        System.out.println("Your family income per person is decent: ₹" + incomePerPerson);
                    } else {
                        System.out.println("Try to increase family income.");
                    }
                } else {
                    System.out.println("Enter valid family members count.");
                }
            }
        }

        // Extra if-else blocks (to meet the total count)
        if (house.equals("yes")) {
            System.out.println("House owned.");
        } else {
            System.out.println("No house owned.");
        }

        if (vehicle.equals("yes")) {
            System.out.println("You have a vehicle.");
        } else {
            System.out.println("No vehicle owned.");
        }

        if (internet.equals("yes")) {
            System.out.println("Internet user.");
        } else {
            System.out.println("You should start using internet.");
        }

        sc.close();
    }
}
