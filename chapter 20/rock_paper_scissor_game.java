//import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor_game {
    public static void main(String[] args) {
    System.out.println("enter your choice:\n1.rock\n2.paper\n3.scissor\n");
    Scanner read= new Scanner(System.in);
    int ch=read.nextInt();
    switch (ch) {
        case 1:
            System.out.println("your choice:rock");
            break;
        case 2:
            System.out.println("your choice:paper");
            break;
        case 3:
            System.out.println("your choice:scissor");
            break;
    
        default:System.out.println("invalid entry");
            break;
    }
    Random r = new Random();
    int a = r.nextInt(3);
    //System.out.println(a);
     switch (a) {
        case 0:
            System.out.println("computer choice:rock");
            break;
        case 1:
            System.out.println("computer choice:paper");
            break;
        case 2:
            System.out.println("computer choice:scissor");
            break;
    
        default:System.out.println("invalid entry by computer");
            break;
    }
    if(ch==a+1){
        System.out.println("tie,try again!!!");
    }
    else if ((ch==1&&a==1)||(ch==2&&a==2)||(ch==3&&a==0)) {
        System.out.println("you losed try again!!!");
    }
    else{
        System.out.println("you won!!!");
    }
    }
    }

