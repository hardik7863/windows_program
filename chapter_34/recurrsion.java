package chapter_34;//pending


public class recurrsion  {
    static int factorial_n(int n){
        if(n==0 ||n==1)
            return 1;
        else
        return factorial_n(n*(n-1));
    }
    public static void main(String[] args) {
       int n=4;
       System.out.println("the value of factorial n is:"+ factorial_n(n));
    }
}
//write a program to print fibinoci series using recursion?