import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MathDemo extends JFrame implements ActionListener
{
	Label l1 = new Label("Number 1: ");
	Label l2 = new Label("Number 2: ");
	Label l3 = new Label("Result  : ");
	Label l4 = new Label();
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	Button b1 = new Button("ADD");
	public MathDemo() 
	{
		setVisible(true);
		setSize(600,600);
		setLayout(null);
		l4.setBackground(new Color(160,180,50));
		l1.setBounds(100,50,100,40);
		t1.setBounds(220,50,100,40);
		l2.setBounds(100,110,100,40);
		t2.setBounds(220,110,100,40);
		l3.setBounds(100,170,100,40);
		l4.setBounds(220,170,100,40);
		b1.setBounds(150,240,80,30);
		l1.setBackground(new Color(200,200,50));
		l2.setBackground(new Color(200,200,50));
		l3.setBackground(new Color(200,200,50));
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b1)
		{
			double x = Double.parseDouble(t1.getText());
			double y = Double.parseDouble(t2.getText());
			double z= x+y;
			l4.setText(""+z);
		}
	}
    public static void main(String[] args)
	{
		MathDemo obj = new MathDemo();
	}
}