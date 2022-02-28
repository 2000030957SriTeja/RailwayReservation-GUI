package pack1;
import javax.swing.*;
import java.io.FileWriter;
import java.awt.*;
import java.awt.event.*;

public class Details implements ActionListener {
	JFrame f;
	JLabel l1,l2,l3,l4,l5,l6;
	JButton b1,b2;
	JTextField t1,t2,t3,t4,t5;
	
	Details()
	{
		f=new JFrame("TICKET");
		f.setVisible(true);
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());
		l1=new JLabel("Enter your name");
		f.add(l1);
		t1 = new JTextField(15);
		f.add(t1);
		l2=new JLabel("Enter your age");
		f.add(l2);
		t2 = new JTextField(15);
		f.add(t2);
		l3=new JLabel("Enter your gender");
		f.add(l3);
		t3 = new JTextField(15);
		f.add(t3);
		l4=new JLabel("Enter your train name");
		f.add(l4);
		t4 = new JTextField(15);
		f.add(t4);
		l5=new JLabel("Enter your seatno");
		f.add(l5);
		t5 = new JTextField(15);
		f.add(t5);
		b1= new JButton("submit");
		b1.addActionListener(this);
		f.add(b1);
		b2= new JButton("cancel");
		b2.addActionListener(this);
		f.add(b2);
	}
	public void actionPerformed(ActionEvent e)
	{
		String n,g,tn;
		int a,sn,price;
		if(e.getSource()==b1)
		{
			n = t1.getText();
			g=t3.getText();
			tn = t4.getText();
			a = Integer.parseInt(t2.getText());
			sn = Integer.parseInt(t5.getText());
			if(a>=18)
			{
				price=600;
			}
			else
			{
				price=300;
			}
			try
			{
				FileWriter f1 = new FileWriter("C:\\Users\\91995\\Desktop\\java\\ProjectGUI\\passengerlist.txt",true);
				f1.write(""+n);f1.write(" "+a);f1.write(" "+g);f1.write(" "+tn);f1.write(" "+price);f1.write(" "+sn+"\n");
				f1.close();
			}
			catch(Exception ex)
			{
				
			}
			
			System.out.printf("Name :%s%nAge:%d%nGender:%s%nTrainName :%s%nSeatno:%d%n",n,a,g,tn,sn);
			
			System.out.println("BOOKING CONFIRMED");
		}
		if(e.getSource()==b2)
		{
			System.out.println("TRY AGAIN");
		}
	}

	

}
