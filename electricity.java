//create a class electricity that accept old reading and new reading gorm usags calculat total unit
//units<100 than rate per unit:5rs
//units between 100 to 200 then rate per unit 10rs
//units gerter than 300 than rate 15rs unit
//add merer charge 140rs
//bill amount greater than 1000then add tax 10% calculat total bill amount and display
import java.util.*;
public class electricity{
    Scanner sc=new Scanner(System.in);
    int new_reading,old_reading;
        int amt=0;
    void accept()
    {
      System.out.println("enter new reading :");
      new_reading=sc.nextInt();
      System.out.println("enter old reading");
      old_reading=sc.nextInt();
    }
    void calculate()
    {
        int unit=new_reading-old_reading;
        if(unit<100){
         amt=unit*5;}
        else if(unit>100 && unit<300)
        {amt=unit*10;}
        else if(unit>300)
        {amt=unit*15;}
        else
        {System.out.println("invalid unit");}
        
        amt=amt+140;
        if(amt>1000)
        {
            int tex=amt/10;
            amt=amt+tex;
        }
        System.out.println("total amount of bill="+amt);
    }
    public static void main(String arg[])
    {
        electricity ob=new electricity();
        ob.accept();
        ob.calculate();

    }
    
}
