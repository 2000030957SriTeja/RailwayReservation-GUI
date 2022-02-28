package pack1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Sstation implements ActionListener {

	JFrame f;
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Sstation()
	{
		f=new JFrame("TICKET");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		l1=new JLabel("Select a starting station");
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
			Estation E = new Estation();
		}
		if(e.getSource()==b2)
		{
			Estation E = new Estation();
		}
		if(e.getSource()==b3)
		{
			Estation E = new Estation();
		}
		if(e.getSource()==b4)
		{
			Estation E = new Estation();
		}
		if(e.getSource()==b5)
		{
			Estation E = new Estation();
		}
		if(e.getSource()==b6)
		{
			Estation E = new Estation();
		}
		if(e.getSource()==b7)
		{
			Estation E = new Estation();
		}
		if(e.getSource()==b8)
		{
			Estation E = new Estation();
		}
		if(e.getSource()==b9)
		{
			Estation E = new Estation();
		}
		if(e.getSource()==b10)
		{
			Estation E = new Estation();
		}
	}
}
