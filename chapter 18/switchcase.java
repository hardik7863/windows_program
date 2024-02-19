import java.util.Scanner;
//switch case supports integer ,string and character values only
public class switchcase {
    public static void main(String[] args) {
        int age;
        Scanner read=new Scanner(System.in);
        age=read.nextInt();
        switch (age) {//switch case ka ek bhi case true ho gya useke baad ka bhi sara print ho jata hai
            //eg: agar age=18 huve toh 18 ka or 18 ke baad ka sara print ker dega 
            //i.e why break is use to avoid such situation
            case 18:
                 System.out.println("you are going to adult");
                break;
            case 23:
                 System.out.println("u are going join the job soon");
                 break;
            case 60:
                 System.out.println("u are going to retired soon");

            default:System.out.println("enjoy ur life!!");
                break;

        }

        
        char var='r';
        switch (var) { 
            case 'r':
                 System.out.println("you are going to adult");
                break;
            case 'l':
                 System.out.println("u are going join the job soon");
                 break;
            case 'k':
                 System.out.println("u are going to retired soon");

            default:System.out.println("enjoy ur life!!");
                break;
            }
    
    String var1="harry";
        switch (var1) { 
            case "hardik":
                 System.out.println("you are going to adult");
                break;
            case "shubham":
                 System.out.println("u are going join the job soon");
                 break;
            case "rohit":
                 System.out.println("u are going to retired soon");

            default:System.out.println("enjoy ur life!!");
                break;
            }
    
    
    
        }
    }
