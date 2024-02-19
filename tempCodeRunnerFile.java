import java.util.Scanner;
public class tempCodeRunnerFile {
    
    public static void main(String[] args) {
        // Q1. What will be the result of the following expression
        float a = 7 / 4 * 9 / 2; // expecting 7.875 ans but ans is 4.0

        // Explanation: Integer division occurs, and then the result is implicitly converted to float.
        // To get the expected result, use float literals or type casting.
        float b = 7 / 4f * 9 / 2f; // Corrected version

        System.out.println(a);
        System.out.println(b);

        // Q2. Write a program to encrypt a grade by adding 8 to it.
        // Decrypt it to show the correct grade
        char grade = 'B';
        
        // Encrypting
        grade = (char) (grade + 8);
        System.out.println("Encrypted Grade: " + grade);

        // Decrypting
        grade = (char) (grade - 8);
        System.out.println("Decrypted Grade: " + grade);

        // Q3. Use comparison operator to find out whether a
        // given number is greater than the user entered number or not.
        Scanner read = new Scanner(System.in);
        int h = read.nextInt();
        int j = 8;
        System.out.println("Is " + h + " greater than " + j + "? " + (h > j));
    }
}
