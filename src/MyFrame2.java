import java.awt.*;
import java.awt.event.*;
public class MyFrame2 extends Frame{
	public static void main(String args[]) {
	
		MyFrame2 f=new MyFrame2();
		f.setTitle("My Frame");
		f.setSize(400, 350);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}