// Story-based Java Tutorial: Understanding Operators in a Fun Way
// Concept Covered: Arithmetic, Assignment, Relational, Logical, Unary, Bitwise, Ternary Operators

public class Operators {
    public static void main(String[] args) {
        
        System.out.println("Welcome to Raja's Monthly Budget Story!");

        // Raja starts with her monthly salary
        int salary = 50000;
        System.out.println("\nRaja's Salary: " + salary);

        // Arithmetic Operators
        int rent = 15000;
        int groceries = 8000;
        int transport = 3000;
        int totalExpenses = rent + groceries + transport;
        int savings = salary - totalExpenses;
        System.out.println("\nArithmetic Ops: Total Expenses = " + totalExpenses);
        System.out.println("Remaining Savings = " + savings);

        // Assignment Operators
        savings += 2000; // She gets a small freelance bonus
        System.out.println("\nAssignment Op: New Savings after bonus = " + savings);

        // Relational Operators
        int goal = 20000;
        boolean goalAchieved = savings >= goal;
        System.out.println("\nRelational Op: Savings >= Goal? " + goalAchieved);

        // Logical Operators
        boolean hasPendingBills = false;
        boolean wantsNewPhone = true;

        if (goalAchieved && !hasPendingBills) {
            System.out.println("\nLogical Op: Raja decides to treat herself with something small");
        } else if (goalAchieved || wantsNewPhone) {
            System.out.println("\nLogical Op: Raja might buy a phone but will think twice");
        } else {
            System.out.println("\nLogical Op: Better save more this month");
        }

        // Unary Operators
        int daysToPay = 5;
        System.out.println("\nUnary Ops: Days to bill payment = " + daysToPay);
        System.out.println("Raja pays one bill, remaining days = " + (--daysToPay));
        System.out.println("After relaxing, she realizes one more day is gone -> " + (++daysToPay));

        // Bitwise Operators
        int rewardPoints = 6;  // binary 110
        int extraPoints = 3;   // binary 011
        int totalPoints = rewardPoints | extraPoints; // Bitwise OR
        System.out.println("\nBitwise Op: Reward Points (6 | 3) = " + totalPoints);

        // Ternary Operator
        String message = (savings > 25000) ? "Raja can plan a trip!" : "Raja will stay home and watch Netflix";
        System.out.println("\nTernary Op Decision: " + message);

        // Final Summary
        System.out.println("\nSummary:");
        System.out.println("Salary = " + salary);
        System.out.println("Total Expenses = " + totalExpenses);
        System.out.println("Savings = " + savings);
        System.out.println("Goal Achieved? " + goalAchieved);
        System.out.println("Final Thoughts: " + message);

        System.out.println("\nEnd of Story — You just learned all major operators in Java through a life example!");
    }
}
