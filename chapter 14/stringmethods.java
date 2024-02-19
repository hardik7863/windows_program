
public class stringmethods {
    public static void main(String[] args) {
        String name="Hardik";
        String name2="Harry";
        System.out.println(name);
        int value=name.length();//gives length of the string
        System.out.println(value);
        String lstr=name.toLowerCase();
        System.out.println(lstr);
        String ustr=name.toUpperCase();
        System.out.println(ustr);
        String nonTrimedString="     hardik    ";
        //System.out.println(nonTrimedString.trim());
        String Trimmedstring =nonTrimedString.trim();
        System.out.println(Trimmedstring);
        System.out.println(name.substring(4));//index start from 0
        //starting index 4 se last tak print ker dega
        System.out.println(name.substring(1, 4));
        //start from 1 and print till 3,4 will excluded 
        System.out.println(name2.replace('r', 'p'));
        //all the 'r' will be replace by the 'p'
        System.out.println(name2.replace("r","ier"));
        //all r will be replace with ier 
        //note '' for characters but ""for more than one character can be string
        System.out.println(name2.replace("ry","py"));
        //in this case first r is as it is but later ry is replace by py
        System.out.println(name.startsWith("har"));
        //it will print true
        System.out.println(name.endsWith("har"));
        //it will print false
        System.out.println(name.charAt(2));
        //it will print the character at index location 2
        System.out.println(name.indexOf('r'));
        //first r jab aayega uske index return kerega
        System.out.println(name.indexOf("rry"));
        //first index of rry that is r will be return
        String modifiedname="harryrry";
        System.out.println(modifiedname.indexOf("y",4));//left to right search kerega
        //it will return the index of y it will start from index 4
        System.out.println(modifiedname.indexOf("kl34"));
        // it will return -1 as the kl34 is not found in modified name string
        System.out.println(modifiedname.lastIndexOf("rry"));//right to left search kerega 
        //or first r ka index return kerega 
        //it will return the last index of rry that is index of first r i.e 5
        System.out.println(modifiedname.lastIndexOf("ry",3));
        //here 3 will be the starting index it will search from right to left and return the index
        System.out.println(modifiedname.equals("hardik"));
        //return false
        System.out.println(name.equalsIgnoreCase("harDIK"));
        //it will return true it will ignore upper and lower case


        //escape sequence character
        //    1) \n  for nextline
        //    2)\t for one tab space
        //    3)\'to insert ' in output eg:-  " this is hardik's code" normal use kerunge error aayega
        //    4)\"to insert " in output
        //    5)\\ to insert single/ in output
    }
}
