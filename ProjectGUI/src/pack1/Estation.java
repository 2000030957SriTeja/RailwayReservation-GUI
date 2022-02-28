package pack1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Estation implements ActionListener {
	JFrame f;
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Estation()
	{
		f=new JFrame("TICKET");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		l1=new JLabel("Select a Ending station");
		f.add(l1);
		b1= new JButton("Vijayawada");
		b1.addActionListener(this);
		f.add(b1);
		b2= new JButton("Chennai");
		b2.addActionListener(this);
		f.add(b2);
		b3= new JButton("Banglore");
		b3.addActionListener(this);
		f.add(b3);
		b4= new JButton("Vizag");
		b4.addActionListener(this);
		f.add(b4);
		b5= new JButton("kolkata");
		b5.addActionListener(this);
		f.add(b5);
		b6= new JButton("NewDelhi");
		b6.addActionListener(this);
		f.add(b6);
		b7= new JButton("Nellore");
		b7.addActionListener(this);
		f.add(b7);
		b8= new JButton("Tirupati");
		b8.addActionListener(this);
		f.add(b8);
		b9= new JButton("Hyderabad");
		b9.addActionListener(this);
		f.add(b9);
		b10= new JButton("Manglore");
		b10.addActionListener(this);
		f.add(b10);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Train t = new Train();
		}
		if(e.getSource()==b2)
		{
			Train t = new Train();
		}
		if(e.getSource()==b3)
		{
			Train t = new Train();
		}
		if(e.getSource()==b4)
		{
			Train t = new Train();
		}
		if(e.getSource()==b5)
		{
			Train t = new Train();
		}
		if(e.getSource()==b6)
		{
			Train t = new Train();
		}
		if(e.getSource()==b7)
		{
			Train t = new Train();
		}
		if(e.getSource()==b8)
		{
			Train t = new Train();
		}
		if(e.getSource()==b9)
		{
			Train t = new Train();
		}
		if(e.getSource()==b10)
		{
			Train t = new Train();
		}
	}

}
