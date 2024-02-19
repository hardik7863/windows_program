import java.util.Random;
import java.util.Scanner;
public class problemset_4 {
    public static void main(String[] args) {
        //Q1.What will be the output of this program:
        // int a=10;
        // if (a=11) {
        //     System.out.println("I am 11");
        // }
        // else
        //     System.out.println("I am not 11");
        //ANS:- ERROR BECAUSE IN IF condition it should be a==11



        //Q2.wap to find out whether a student is pass or fail.if it requires
        //total 40% to pass.assume 3 subject and take marks as an input from the user
        byte s1,s2,s3;//becoz marks 100 ke kam ke rehenge
        Scanner read=new Scanner(System.in);
        s1=read.nextByte();
        s2=read.nextByte();
        s3=read.nextByte();
        float total_per=(s1+s2+s3)/3.0f;
        System.out.println("total percentage is:"+total_per);
        if(total_per>=40&& s1>=33&& s2>=33&& s3>=33){
            System.out.println("yes u are pass");
        }
        else{
            System.out.println("fail");

        }
        //Q3.calculate income to paid by an employee to the govt as per the slabs mention belows:
        //income -slab              tax
        //2.5Lac-5.0Lac              5%
        //5.0Lac-10.0Lac             20%
        //above10.0Lac              30%
        //note that there is no tax below 2.5 lac .take input amount as an input from the user
       
//        System.out.println("Enter your income in Lakhs per annum");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income <= 5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income <= 10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 10.0f);
//        }
//
//        System.out.println("The total tax paid by the employee is: " + tax);

//        Question 4:wap to find out the day of the weeek given the number[1 for monday,2 for tuesday....and so on!!]

//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }


//        Q5.wap to find whether a year entered by the user is a leap year or not
           
//        Question 6.wap to find out the type of website from the url 
          //.com ->commercial website
          //.org ->organizational
          //.in  ->indian website
//        Scanner sc = new Scanner(System.in);
//        String website = sc.next();
//        if(website.endsWith(".org")){
//            System.out.println("This is an organizational website");
//        }
//        else if(website.endsWith(".com")){
//            System.out.println("This is a Commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("This is an Indian website");
//        }
    Random r = new Random();
    int a = r.nextInt();
        System.out.println(a);

    }
}

   
    