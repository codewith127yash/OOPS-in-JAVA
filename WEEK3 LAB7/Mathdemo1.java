import java.awt.*;
import java.awt.event.*;
public class Mathdemo1 extends Frame implements ActionListener
{
	Label l1 = new Label("Enter The Number 1 : ");
	TextField t1 = new TextField();
	Label l2 = new Label("Enter The Number 2 : ");
	TextField t2 = new TextField();
	Label l3 = new Label("Result : ");
	Label l4 = new Label ();
	Button b1 = new Button("ADD");
	Button b2 = new Button("SUB");
	Button b3 = new Button("DIV");
	Button b4 = new Button("MUL");
	public Mathdemo1()
	{
		setVisible(true);
		setLayout(null);
		setSize(600,400);
		l1.setBounds(100,50,100,40);
		t1.setBounds(220,50,100,40);
		l2.setBounds(100,110,100,40);
		t2.setBounds(220,110,100,40);
		l3.setBounds(100,170,100,40);
		l4.setBounds(220,170,100,40);
		b1.setBounds(100,240,40,40);
		b2.setBounds(160,240,40,40);
		b3.setBounds(220,240,40,40);
		b4.setBounds(280,240,40,40);
		setBackground(new Color(255,100,0));
		l1.setBackground(new Color(0,255,255));
		l2.setBackground(new Color(0,255,255));
		l3.setBackground(new Color(0,255,255));
		t1.setBackground(new Color(255,0,255));
		t2.setBackground(new Color(255,0,255));
		l4.setBackground(new Color(255,0,0));
		l1.setForeground(new Color(255,0,0));
		l2.setForeground(new Color(255,0,0));
		t1.setForeground(new Color(0,0,255));
		t2.setForeground(new Color(0,0,255));
		b1.setBackground(new Color(0,255,0));
		b2.setBackground(new Color(250,255,250));
		b3.setBackground(new Color(0,255,255));
		b4.setBackground(new Color(255,255,0));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		Double x = Double.parseDouble(t1.getText());
		Double y = Double.parseDouble(t2.getText());
		Double z;
		if(a.getSource()==b1)
		{
			z=x+y;
			l4.setText(""+z);
		}
		if(a.getSource()==b2)
		{
			z=x-y;
			l4.setText(""+z);
		}
		if(a.getSource()==b3)
		{
			
			if(y>0)
			{
				z=x/y;
				l4.setText(""+z);
			}
			else
			{
				l4.setText("Error");
			}
		}
		if(a.getSource()==b4)
		{
			z=x*y;
			l4.setText(""+z);
		}
	}
	public static void main(String args[])
	{
		Mathdemo1 obj = new Mathdemo1();
	}
}