import java.awt.*;
import java.awt.event.*;
public class MyText extends Frame{

	MyText(){
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
	}
	public void paint(Graphics g) {
		this.setBackground(new Color(100,20,20));
		
		Font f=new Font("Arial",Font.BOLD+Font.ITALIC,30);
		g.setFont(f);
		
		g.setColor(Color.green);
		
		g.drawString("Hello,How Are You ?", 100, 100);
	}
	
	public static void main(String[] args) {
		MyText t=new MyText();
		t.setSize(500, 200);
		t.setTitle("My Text");
		t.setVisible(true);

	}

}
