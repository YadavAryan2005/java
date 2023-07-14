// Write a Java program to keep the count of object created of a class. Display the count
// each time when the object is created
class count{
    static int a;
    count()
    { 
      System.out.print(a++);
    }   
}
class demo
{
    public static void main(String[] args) {
        count ob =new count();
        count ob1 =new count();
        count ob2 =new count();
        count ob3 =new count();
    }
}
