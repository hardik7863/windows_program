

public class break_continue {
    public static void main(String[] args) {
        int a=5;
        for (int i =0; i <=5; i++) {
            System.out.println(i);
            System.out.println("java is great");
            if(i==2){
                break;
            }
        }
        System.out.println("loop is breaked");
        
        //whileloop
        // int j=5;
        // while (j>0) {
        //     System.out.println(j);
        //     System.out.println("java is great");
        //     if(j==2){
        //         break;
        //     }
        //     j--;
        // }
        // System.out.println("loop is breaked");

        //dowhile loop
        // do {
        //     System.out.println(j);
        //     System.out.println("java is great");
        //     if(j==2){
        //         break;
        //     }
        //     j--;
        // } 
        // while(j>0);
        // System.out.println("loop is breaked");
        
    }
}