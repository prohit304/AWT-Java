import java.awt.*;
import java.awt.event.*;
public class MyFrame extends Frame{
	public static void main(String args[]) {
		MyFrame f=new MyFrame();
		f.setTitle("My Frame");
		f.setSize(400, 350);
		f.setVisible(true);
		f.addWindowListener(new MyClass());
		
	}
}
class MyClass implements WindowListener{
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}