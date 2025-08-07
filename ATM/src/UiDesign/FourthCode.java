package UiDesign;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FourthCode extends JFrame {

	JLabel l1, l2;
	JTextField f1, f2;
	JButton b1,b2,b3;
	JFrame jf;
	
	FourthCode()
	{
		jf = new JFrame("FlowLayout Example");
		l1 = new JLabel("Enter Name");
		l2 = new JLabel("Enter City");
		
		f1 = new JTextField(15);//default 20
		f2 = new JTextField(15);
		
		b1 = new JButton("Clear");
		b2 = new JButton("Submit");
		b3 = new JButton("Next");
		
		jf.setLayout(new FlowLayout());
		jf.add(l1);
		jf.add(f1);
		
		jf.add(l2);
		jf.add(f2);
		
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		
		jf.setSize(300, 300);
		jf.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FourthCode();
	}

}
