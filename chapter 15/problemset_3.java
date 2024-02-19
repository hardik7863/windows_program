

public class problemset_3 {
    public static void main(String[] args) {
        //Q1. write a java program to convert a string to lowercase.
        String name="Hardik Batwal";
        System.out.println(name.toLowerCase());
        
        //Q2.write a program in java to replace spaces with underscores
        System.out.println(name.replace(" ","_"));
    
        //Q3.WAP to fill in a letter template which looks like below:
        //letter ="dear<|name|>,thanks a lot"
        //replace<|name|> with some name?
        System.out.println("dear "+name+",thanks alot");
       
        //Q4. wap to detect double and triple space in string.
        String name1="harry  bhai   kamal ho";
        System.out.println(name1.indexOf("  "));
        System.out.println(name1.indexOf("   "));
   
        //Q5.wap to format the following letter using escape sequence character
        //letter="dear harry, 
                       //this java course is nice.
                       //Thanks"
        String letter1="dear harry,\n\tthis java course is nice.\n\tThanks";
        System.out.println(letter1);
    }
}
