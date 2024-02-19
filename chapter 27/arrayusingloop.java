public class arrayusingloop {
    public static void main(String[] args) {
        int [] marks={98,45,79,99,88};
        //  float [] marks={98.5f,45.5f,79.5f,99.5f,88.5f};
        //  //.length return the length of the array
        //  System.out.println(marks.length);
        //  System.out.println(marks[2]);
        //  String [] students ={"harry","rohan","shubham","lovish"};
        //  System.out.println(students.length);
        //  System.out.println(students[2]);
        //  //displaying the array(naive way)
        //    System.out.println("printing naive way");
        //   System.out.println(marks[0]);
        //   System.out.println(marks[1]);
        //   System.out.println(marks[2]);
        //   System.out.println(marks[3]);
        // displaying the array (for loop)
        // System.out.println("displaying using loop");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        //quick quiz
        //Q. wap to print elemenet in reverse order
        for (int i =marks.length-1; i>=0; i--) {
            System.out.println(marks[i]);
        }


    }
}
