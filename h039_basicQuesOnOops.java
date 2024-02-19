class employee{
   int salary;
   String name;
   public int getsalary(){
    return salary;
   }
   public String getname(){
    return name;
   }
    public void setname(String n){
        name=n;

  }
}

class cellphone{
    public void ringing(){
        System.out.println("ringing");
    }
    public void vibrating(){
        System.out.println("vibrating");
    }
}

class square{
     float side;
     public float area(float n){
            side=n;
            return side*side;
     }
     public float perimeter(float n){
        side=n;
        return 4*side;
     }
}

class rectangle{
    float l;
    float b;
    public float area(float ln, float bt){
       l=ln;
       b=bt;
       return l*b;
    }
    public float perimeter(float ln,float bt){
        l=ln;
        b=bt;
        return 4*(l+b);
    }
}
class TommyVecetti{
    public void firing(){
        System.out.println("firing");
    }
    public void hiting(){
        System.out.println("hiting");
    }
    public void running(){
        System.out.println("running");
    }
}
class circle{
    float r;
    public void circ(float radius){
    r= radius;
    }
    public float area(){
        return (3.14f)*r*r;
    }
    public float perimeter(){
        return 2*(3.14f)*r;
    }
}

public class h039_basicQuesOnOops {
    public static void main(String[] args) {
         //Chapter -8 Practice Set
       //Q1. Create a class employee with following properties and methods:
       //1)Salary(property)(int)
       //2)getsalary(method returning int)
       //3)name(property)(string)
       //4)getname(method returning string)
       //5)setname(method changing name)
  
       //     My way :=
    //    employee hardik =new employee();
    //    hardik.name="hardik";
    //    hardik.salary=12345;
    //    int salary=hardik.getsalary();
    //    System.out.println(salary);
    //    String name=hardik.getname();
    //    System.out.println(name);
    //    hardik.setname("hardik");
    //    System.out.println(hardik.name);
      

    //     Harry way:=
        //    employee harry =new employee();
        //    harry.setname("code with harry");//incase this line of code is commented out then answer will be null
        //    harry.salary=123;
        //    System.out.println(harry.getname());
        //    System.out.println(harry.getsalary());
  
     
    //Q2.create a class cellphone with methods to print "ringing","vibrating...",etc
        //  cellphone redmi=new cellphone();
        //  redmi.vibrating();
        //  redmi.ringing();
  


    //Q3. create a class square with a method to initialize its side,calculating area,perimeter,etc
        //   square s1= new square();
        //   System.out.println("the area of square is:"+ s1.area(5.6f));
        //   System.out.println("the perimeter of Square is:" + s1.perimeter(4.9f));
      
    //Q4.create a class rectangle with above 3 methods
            //  rectangle r1=new rectangle();
            //  System.out.println("the area of perimeter is:" + r1.area(10.2f, 11.4f));
            //  System.out.println("the area of perimeter is:" + r1.perimeter(10.2f, 11.4f));
    

    //Q5.Create  a class TommyVecetti for rockstar games capable of hiting(print hitting),running ,firing,etc
    //    TommyVecetti t1=new TommyVecetti();
    //    t1.hiting();
    //    t1.firing();
    //    t1.running();
    
    //Q6. create a class rectangle with above 3 methods same as in square
     circle c1=new circle();
     c1.circ(5.4f);
     System.out.println("the area of circle is: "+ c1.area());
     //c1.perimeter(); on writing this nothing will get print
     System.out.println("the perimeter of circle is: "+c1.perimeter());
      
}

}
