package chapter_33;

public class varags {
// static int sum(int a, int b){
//             return a+b;}
// static int sum(int a, int b,int c){
//             return a+b+c;}
// static int sum(int a, int b,int c,int d){
//             return a+b+c+d;}

// //inmstead of doing this again we will use varags concept in java 
// //in this it stores all the varables in an array

 
//class calculate {

    static int add(int ...arr){
        int result = 0;
        for (int a : arr){
            result = result + a;
        }
        return result;
}

public static void main(String[] args){
    System.out.println(add(1,2));
    System.out.println(add(2,3,4));
    System.out.println(add(4,5,6));
}
}


    // public static void main(String[] args) {
    //     System.out.println("welcome to Varargs tutorial");
    //     System.out.println("the sum of 4 and 5 is:"+sum(4,5));
    //     System.out.println("the sum of 4 and 5 is:"+sum(4,3,5));
    //     System.out.println("the sum of 4 and 5 is:"+sum(4,3,5,6));
    //     }
     //}
