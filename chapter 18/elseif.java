import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        int age;
        Scanner read=new Scanner(System.in);
        age=read.nextInt();
        if(age>56)
            System.out.println("you are experienced");
        else if(age>46)
            System.out.println("you are semi experienced");
        else if(age>36)
            System.out.println("you are semi semi experienced");
        else
            System.out.println("u are not experienced");
        if(age>2)
          System.out.println("u are not a baby");//this if is not part of above if else ladder
          

        }
}
