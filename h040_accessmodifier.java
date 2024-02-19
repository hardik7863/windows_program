//focused on private access modifier ,getter and  setter
class MyEmployee {
private int id;
private String Name;
public String getName(){
    return Name;
}
public void setName(String n){
    Name=n;
}
public int getId(){
    return id;
}
public void setId(int i){
    id=i;

}

    
}

public class h040_accessmodifier {
    public static void main(String[] args) {
         
        MyEmployee h1=new MyEmployee();
        h1.setName("hardik");
        h1.setId(14);
        System.out.println("My name is" + h1.getName());
        System.out.println("My ID is" + h1.getId());
    }

}
