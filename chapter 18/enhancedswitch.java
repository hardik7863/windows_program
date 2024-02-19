import java.util.Scanner;

public class enhancedswitch {
    public static void main(String[] args) {
        //NORMAL SWITCH CASE
        // String var1="harry";
        // switch (var1) { 
        //     case "hardik":
        //          System.out.println("you are going to adult");
        //         break;
        //     case "shubham":
        //          System.out.println("u are going join the job soon");
        //          break;
        //     case "rohit":
        //          System.out.println("u are going to retired soon");

        //     default:System.out.println("enjoy ur life!!");
        //         break;
        //     }
    

        //ENHANCED SWITCH
        //BREAK is not needed in enhanced switch
        String var1="harry";
        switch (var1) {
            case "hardik"-> {
                System.out.println("you are going to adult");
                System.out.println("you are going to adult");
                System.out.println("you are going to adult");
        }
                
            case "shubham"->System.out.println("u are going join the job soon");
                 
            case "rohit"->System.out.println("u are going to retired soon");

            default->System.out.println("enjoy ur life!!");
                
            
        }
    }
}
