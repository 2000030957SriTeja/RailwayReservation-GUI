package pack1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Type implements ActionListener{
	
	JFrame f;
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Type()
	{
		f=new JFrame("TICKET");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		l1=new JLabel("Select a category");
		f.add(l1);
		b1= new JButton("Express");
		b1.addActionListener(this);
		f.add(b1);
		b2= new JButton("Passenger");
		b2.addActionListener(this);
		f.add(b2);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Category c1 = new Category();
		}
		if(e.getSource()==b2)
		{
			Category c1 = new Category();
		}
	}
}
