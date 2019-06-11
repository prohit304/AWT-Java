package AWT;
import java.awt.*;
import java.awt.event.*;

public class PushButton extends Frame implements ActionListener {
	Button b1,b2,b3;
	
	PushButton(){
		this.setLayout(null);
		
		b1=new Button("Yellow");
		b2=new Button("Blue");
		b3=new Button ("Pink");
		
		this.add(b1);
		this.add(b2);
		this.add(b3);
		
		
		b1.setBounds(100, 100, 70, 40);
		b2.setBounds(100, 160, 70, 40);
		b3.setBounds(100, 220, 70, 40);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent wc) {
				System.exit(0);
			}
		});
	}
		@Override
		public void actionPerformed(ActionEvent ae) {
			String str=ae.getActionCommand(); //Know the Lebel of the button clicked by user
			
			if(str.equals("Yellow")) this.setBackground(Color.yellow);
			if(str.equals("Blue")) this.setBackground(Color.blue);
			if (str.equals("Pink")) this.setBackground(Color.pink);
			
			
		}
		
		
	

	public static void main(String[] args) {
		PushButton pb=new PushButton(); 
		pb.setSize(400, 400);
		pb.setTitle("PushButtons");
		pb.setVisible(true);
		

	}

	


}
