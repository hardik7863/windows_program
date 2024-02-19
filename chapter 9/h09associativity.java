public  class h09associativity {
    public static void main(String[] args) {
       //Precedence &Associativity
       // int a=6*5-34/2;
        //System.out.println(a);
    /* Highest precedence goes to * and /.They are then evaluated on the basis
    of left to right associativity
       =30-34/2
     * =30-17
     * =13
     */
       //int b=60/5-34*2;
       /*
        * =12-34*2
        =-56
        */
       // System.out.println(b);
    //quick quiz
    int x=6;
    int y=1;
    int k=x*y/2;
    int a=5;
    int c=4;
    int b=1;
    System.out.println(k);
    int l=b*b-(4*a*c)/(2*a);
    System.out.println(l);
    //assignment operator (++,=)right to left hota hai baki sab left to right
    
  }
}
