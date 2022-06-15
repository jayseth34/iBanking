

import java.awt.*;
import java.awt.event.*;

public class Exam_126 extends Frame implements ActionListener
{
  Menu iplaces,iloc,bandra;
  public Exam_126()
  {			
    MenuBar mb = new MenuBar();		       
    setMenuBar(mb);				

    iplaces = new Menu("INDIAN STATES ");	
    iloc = new Menu("MAHARASHTRA");
    bandra = new Menu("BANDRA");	
    	
    mb.add(iplaces);				
    iplaces.add(iloc);
    iplaces.add(new MenuItem("RAJASTHAN"));
    iplaces.add(new MenuItem("KARNATAKA"));
    iplaces.add(new MenuItem("KERALA"));
    
    
    iloc.add(bandra);
    iloc.add(new MenuItem("THANE"));
    iloc.add(new MenuItem("BORIVALI"));
    
    
    iplaces.addActionListener(this);
    bandra.addActionListener(this);


    bandra.add(new MenuItem("THADOMAL SHAHANI ENNG COLLEGE"));    	   

    setTitle("Selector Menu Program");		
    setSize(300, 300);
    setVisible(true);
      
  }
  public void actionPerformed(ActionEvent e)
  {
    String str = e.getActionCommand();		
    System.out.println("So You want To Visit!!  " + str);
  }
 public static void main(String args[])
  {
    new Exam_126();
  }
}