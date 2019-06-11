import java.awt.*;
import java.awt.event.*;
public class MyFrame1 extends Frame{

	public static void main(String[] args) {
		
		
		MyFrame1 f=new MyFrame1();
		f.setTitle("My Frame");
		f.setSize(400, 350);
		f.setVisible(true);
		f.addWindowListener(new MyClasss());
		

	}

}
class MyClasss extends WindowAdapter{
	public void WindowClosing(WindowEvent e) {
		System.exit(0);
	}
}
