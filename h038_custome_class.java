class employee{//yha public lekha toh error aya wwe will understand in access specifiers chapter
int id;
int salary;
String name;
public void  printDetails(){
    System.out.println("my id is "+ id);
    System.out.println("my name is "+ name);
}
public int getsalary(){
    return salary; 
}
};



public class h038_custome_class {

    public static void main(String[] args) {
        //instantiating a new employee object
        employee harry =new employee();
        employee john =new employee();
        //setting the attributes for harry
        harry.id=12;
        harry.name="codewithharry";
        harry.salary=326;
        //setting the attributes for harry
        john.id=13;
        john.name="john";
        john.salary=874;

        //printing the attributes
        System.out.println(harry.id);
        System.out.println(harry.name);
        //printing the methods
       //wrong way it will show error
       // System.out.println(harry.printDetails());
       //instead we will use 
       harry.printDetails();   
       john.printDetails();
       int salary=john.getsalary();
       System.out.println(salary);
    
    }
}