

public class problem_set_6 {
    public static void main(String[] args) {
        //Q1.create an array of 5 floats abd calculate their sum.
        // float arr[]={34.5f,56.4f,52.5f,56.3f};
        // float sum=0;
        // for (float f : arr) {//no need to use sum=sum+arr[f] this is wrong way of doing it
        //     sum=sum+f;//do it this way
        // }
        // System.out.println("the sum is:" + sum);


        //Q2.wap to find out whether a given input is presnt in an array or not?
        // int key=80;
        // int arr[]={10,20,30,40,50};
        // boolean presnt=false;
        // for (int i : arr) {
        //     if(key==i){
        //        // System.out.println("yes element found ");
        //        presnt=true;
        //     }
        // }
        // if(presnt==true)
        //    System.out.println("yes element is present in the array");
        // else
        //    System.out.println("element is not present in the array");
    
      
        //Q3.calculate the average marks from an array containing marks of all student in phys using for each loop
        // int marks[]={10,20,30,40,50};
        // int sum=0;
        // for (int i : marks) {
        //     sum=sum+i;
        // }
        // System.out.println("avg marks is: " + (sum/5));

    
        //Q4.wap to add two matrices of size 2*3
        //  int matrices1[][]={{2,4,5},
        //                     {3,5,6}};
        //  int matrices2[][]={{4,6,7},
        //                     {5,7,8}};
        //  int result[][]={{0,0,0},
        //                     {0,0,0}};
        //  for (int i = 0; i < matrices1.length; i++) {//row number of times
        //     for (int j = 0; j < matrices1[i].length; j++) {//column number of times
        //         result[i][j]=matrices1[i][j]+matrices2[i][j];
        //         System.out.println(result[i][j] + " ");
        //     }
        //     System.out.println("");
        //  }

        //Q5.wap to reverse an array
        //my way:-
        //  int marks[]={10,20,30,40,50};
        //  int mid=marks.length/2;
        //  int temp;
        //  for (int index = 0; index < mid; index++) {
        //       temp=marks[marks.length-1-index];
        //       marks[marks.length-1-index]=marks[index];
        //       marks[index]=temp;
        //  }
        //  for (int i : marks) {
        //     System.out.println(i);
        //  }

        //harry way:-
        // int arr []={1,2,3,4,5,6};
        // int l=arr.length;
        // int n=Math.floorDiv(arr.length,2);
        // for (int i = 0; i <n; i++) {
        //     //swap a[i] and a[l-1-i]
        //     int temp=arr[i];
        //     arr[i]=arr[l-i-1];
        //     arr[l-i-1]=temp;
        // }
        // for (int i : arr) {
        //     System.out.println(i);
        // }


        // //Q6.wap to find the max element in an array
        // int marks[]={10,20,30,40,50};
        // int small=Integer.MIN_VALUE;
        // for (int i = 0; i < marks.length; i++) {
        //     if(marks[i]>small){
        //         small=marks[i];
        //     }
        // }
        // System.out.println(small);
         

        //Q7.wap to find the min element in an array
        // int marks[]={10,20,30,40,50};
        // int max=Integer.MAX_VALUE;
        // for (int i = 0; i < marks.length; i++) {
        //     if(marks[i]<max){
        //         max=marks[i];
        //     }
        // }
        // System.out.println(max);
         
        
        //Q8.wap to find whether an array is sorted or not
        boolean isSorted = true;
        int [] arr = {1, 12, 3, 4, 5, 34, 67};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not sorted");
        }


    }
}
