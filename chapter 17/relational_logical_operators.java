
public class relational_logical_operators {

    public static void main(String[] args) {
        System.out.println("For Logical operator AND......");
        boolean a=true;
        boolean b=false;
       // boolean c=true;//in case 3 variable aajaye && operation (a && b && c) 
        //toh left to right associativity ke hisab se solve hoga pehle a and b then uska result with c
        if (a&&b ){//&&c) {
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }


        System.out.println("For Logical operator OR......");
        boolean x=true;
        boolean y=false;

        if (x||y) {
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }
        System.out.print("NOT(a) is:");
        System.out.println(!a);
        System.out.print("NOT(b) is:");
        System.out.println(!b);
    }
}