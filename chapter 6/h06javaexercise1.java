import java.util.*;
public class h06javaexercise1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of subject 1:");
        int s1=sc.nextInt();
        System.out.println("enter marks of subject 2:");
        int s2=sc.nextInt();
        System.out.println("enter marks of subject 3:");
        int s3=sc.nextInt();
        System.out.println("enter marks of subject 4:");
        int s4=sc.nextInt();
        System.out.println("enter marks of subject 5:");
        int s5=sc.nextInt();
        int sum=s1+s2+s3+s4+s5;
        int per=sum/5;
        System.out.println("percentage is:"+ per);
    }
}