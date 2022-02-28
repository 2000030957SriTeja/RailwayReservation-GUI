package pack1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Train implements ActionListener {
	
	JFrame f;
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	Train()
	{
		f=new JFrame("TICKET");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		l1=new JLabel("Select a train");
		f.add(l1);
		b1= new JButton("pinakini");
		b1.addActionListener(this);
		f.add(b1);
		b2= new JButton("Krishna");
		b2.addActionListener(this);
		f.add(b2);
		b3= new JButton("Godavari");
		b3.addActionListener(this);
		f.add(b3);
		b4= new JButton("janmabhoomi");
		b4.addActionListener(this);
		f.add(b4);
		b5= new JButton("vishaka");
		b5.addActionListener(this);
		f.add(b5);
		b6= new JButton("Godavari");
		b6.addActionListener(this);
		f.add(b6);
		b7= new JButton("Gangotri");
		b7.addActionListener(this);
		f.add(b7);
		b8= new JButton("AP Express");
		b8.addActionListener(this);
		f.add(b8);
		b9= new JButton("Satavahana");
		b9.addActionListener(this);
		f.add(b9);
		b10= new JButton("Ratnachal");
		b10.addActionListener(this);
		f.add(b10);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b2)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b3)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b4)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b5)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b6)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b7)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b8)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b9)
		{
			Type ty = new Type();
		}
		if(e.getSource()==b10)
		{
			Type ty = new Type();
		}
	}

}
