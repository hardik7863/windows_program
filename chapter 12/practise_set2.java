import java.util.Scanner;
public class practise_set2 {
    
    public static void main(String[] args) {
        //q1. what will be the result of the following expression
         float a=7 / 4 * 9 / 2;//expecting 7.875 ans but ans is 4.0
         //because 7/4 int evaluate hota then multiply then again integer me evaluate hoga
         //phir last me jake float me convert hoga.
         float b= 7 / 4f * 9 / 2f ;
         System.out.println(a);
         System.out.println(b);
        
        //q2.write a program to encrypt a grade by adding 8 to it.decrypt it to show the correct grade
          char grade ='B';
          //Encrypting
          grade=(char)(grade+8);
          System.out.println(grade);
          //Decrypting
           grade=(char)(grade-8);
           System.out.println(grade);

        //Q3. use comparision operator to find out whether a
        // given number is greator than user entered number or not.
        Scanner read =new Scanner(System.in);
        int h=read.nextInt();
        int j=8;
       // System.out.println(h>j);
       System.out.println("Is " + h + " greater than " + j + "? " + (h > j));//GPT fail
       
    //Q4. write the following expression in java?
       // float p=((v*v)-(u*u)/2*a*s);
    
       //Q5. find the value of the following expresion
        int n =7;
        int g=7*49/7 + 35/ 7;
        System.out.println(g);
    }
     }

