package labs.lab1;

import java.util.Scanner;

class EquationTester{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a, b and c for first equation:");
        Equation equation1 = new Equation(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter the value of a, b and c for second equation:");
        Equation equation2 = new Equation(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("the sum of the equations are");
        System.out.println(equation1.equation_add(equation2).toString());


        System.out.println("Enter the value of a, b and c for first equation:");
        Equation equation3 = new Equation(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Enter the value of a, b and c for second equation:");
        Equation equation4 = new Equation(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Subtraction of the equations:");
        System.out.println(equation3.equation_sub(equation4).toString());

        sc.close();
    }
}