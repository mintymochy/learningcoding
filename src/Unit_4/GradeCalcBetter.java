package Unit_4;

import java.util.Scanner;

/*
 * August Jones
 * 2023-10-31 08:22
 * AP CSA
 *
 */
public class GradeCalcBetter {

    public static void main(String[] args) {
        Scanner uI = new Scanner(System.in);

        // assignments
        System.out.print("How many assignments do you have to put in?: ");
        int aCount = uI.nextInt();
        double aTotal = 0;
        int i = 0;
        while (aCount != i) {
            i++;
            System.out.print("Input your assignment grades: ");
            double assignment = uI.nextDouble();
            aTotal += assignment;
        }
        // double aTotal = assignments(aCount);

        // quizzes
        System.out.print("How many quizzes do you have to put in?: ");
        int qCount = uI.nextInt();
        double qTotal = 0;
        while (qCount != i) {
            i++;
            System.out.print("Input your quiz grades: ");
            double quizzes = uI.nextDouble();
            qTotal += quizzes;
        }
        // double qTotal = assignments(qCount);

        // exams
        System.out.print("How many exams do you have to put in?: ");
        int eCount = uI.nextInt();
        double eTotal = 0;
        while (eCount != i) {
            i++;
            System.out.print("Input your exam grades: ");
            double exam = uI.nextDouble();
            eTotal += exam;
        }
        // double eTotal = assignments(eCount);

        // returning grade
        System.out.print("Your number grade is: " + calcAverage(aTotal, qTotal, eTotal));
    }

    public static double calcAverage(double a, double q, double e) {
        double grade = (e + q + a) / 3;
        if (grade < 100 && grade > 90) {
            System.out.print("your letter grade is: A");
        } else if (grade < 89 && grade > 80) {
            System.out.print("your letter grade is: B");
        } else if (grade < 79 && grade > 70) {
            System.out.println("your letter grade is: C");
        } else if (grade < 69 && grade > 60) {
            System.out.println("your letter grade is: D");
        } else {
            System.out.println("your letter grade is: E");
        }
        return grade;
    }
}