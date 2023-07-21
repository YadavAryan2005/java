//accept student information and display using awt and actionlistener 
//GUI
import java.awt.*;
import java.awt.event.*;

public class info extends Frame implements ActionListener
{
    Label l1,l2,l3,l4,l5;
    TextField t1;
    TextArea ta1,ta2;
    CheckboxGroup cg1;
    Checkbox c1,c2,c3,c4,c5,c6;
    List li1;
    Button b1,b2;
    info()
    {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());  
        l1=new Label("name");
        t1=new TextField(10);
        l2=new Label("adress");
        ta1=new TextArea();
        l3=new Label("gender");
        cg1=new CheckboxGroup();
        c1=new Checkbox("male",cg1,false);
        c2=new Checkbox("female",cg1,false);
        l4=new Label("subject");
        c3=new Checkbox("python");
        c4=new Checkbox("cpp");
        c5=new Checkbox("java");
        c6=new Checkbox("php");
        li1=new List(1);
        li1.add("fy");
        li1.add("sy");
        li1.add("ty");
        b1=new Button("submit");
        b2=new Button("clear");
        l5=new Label("info");
        ta2=new TextArea();
        add(l1); 
        add(t1);
        add(l2);
        add(ta1);
        add(l3);
        add(c1);
        add(c2);
        add(l4);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(li1);
        add(b1);
        add(b2);
        add(l5);
        add(ta2);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }
    String name="name=",add="adress=",ge="age=",sub="subject=",clas="class";
    public void actionPerformed(ActionEvent ae)
    {   
        if(ae.getSource()==b1)
        {
          name+=t1.getText();
          add+=ta1.getText();
          if(c1.getState())
            ge+=c1.getLabel();
          if(c2.getState())
            ge+=c2.getLabel();
          if(c3.getState())
            sub+=c3.getLabel();
          if(c4.getState())
            sub+=c4.getLabel();
          if(c5.getState())
            sub+=c5.getLabel();
          if(c6.getState())
            sub+=c6.getLabel();
        clas=li1.getItem(li1.getSelectedIndex());
        ta2.setText(name);
        ta2.append("\n"+add);
        ta2.append("\n"+ge);
        ta2.append("\n"+sub);
        ta2.append("\n"+clas);
        }
    }
    public static void main(String[] args) {
        new info();
    }
}
