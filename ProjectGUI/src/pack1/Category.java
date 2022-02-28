package pack1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Category implements ActionListener{
	
	JFrame f;
	JLabel l1;
	JButton b1,b2;
	Category()
	{
		f=new JFrame("TICKET");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		l1=new JLabel("Select a category");
		f.add(l1);
		b1= new JButton("AC");
		b1.addActionListener(this);
		f.add(b1);
		b2= new JButton("NON AC");
		b2.addActionListener(this);
		f.add(b2);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Details d = new Details();
		}
		if(e.getSource()==b2)
		{
			Details d = new Details();
		}
	}

}
