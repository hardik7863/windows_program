import java.util.Scanner;;

public class decrement_forloop {
    public static void main(String[] args) {
        // for (int i = 10; i!=0; i--) {
        //     System.out.println(i);}


            //quick quiz Q.wap to print first n natural no. in reverse order
            Scanner read=new Scanner(System.in);
            int n=read.nextInt();
            for (int i = n; i!=0; i--) {
                System.out.println(i);
            }
    }
}
