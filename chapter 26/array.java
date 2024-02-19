

public class array {
    public static void main(String[] args) {
        //classroom of 500 students -you have to store marks of these 500 students
        //you have 2 options:
        //1.create 500 variables
        //2.use array(recommended)  

        //way to assign array in java

       //method 1:-  int [] marks= new int[5];// declaration and memory allocation
       //method 2:- 
        int [] marks;//first declaration and then memory allocation
        marks=new int [5];
        //initialization
        marks[0]=100;
        marks[1]=70;
        marks[2]=60;
        marks[3]=90;
        marks[4]=80;
        //method 3:- int [] marks={100,70,60,90,80};//declaration +initialize +inialization 
        //try to print marks[5]:- it will throw an error
        //error="index 5 out of bound of length 5"
        System.out.println(marks[5]);
        //indexing in array start from 0 to n-1

    }
}
