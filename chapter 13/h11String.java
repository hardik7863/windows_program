import java.util.*;//strings are immutable in order to change u have to create new string

public class h11String {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
       // String name=new String ("hardik");
       String name ="hardik";
       //diff form of printing 
       System.out.print(name);
        System.out.println(name);
        System.out.printf("%s",name);//%d,%c,%f also possible
        int a=6;
        float b=10.4567f;
        System.out.printf("the value of a is %d and the value of b is %8.2f",a,b);
        // it will give output as 6 then 8 spaces and 2 decimal values of b
        System.out.format("%f",b);
        String st=read.next();
        System.out.println(st);
        String nst=read.nextLine();
        System.out.println(nst);

    }
}
