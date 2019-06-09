import java.awt.*;
import java.awt.event.*;
public class SmileFaceFrame extends Frame{
	
	
	
	public SmileFaceFrame() {
		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.blue);
		
		g.drawRect(40, 40, 200, 200);
		
		g.drawOval(90, 70, 80, 80);//Face
		
		g.drawOval(110, 95, 5, 5);//Eyes
		g.drawOval(145,95,5,5);
		
		g.drawLine(130, 95, 130, 115);//Nose
		
		g.drawArc(113, 115, 35, 20, 0, -180);//Mouth
		
		
	}
	

	public static void main(String[] args) {
		SmileFaceFrame f=new SmileFaceFrame();
		
		
        f.setTitle("My Drawing");
		f.setSize(400, 400);
		f.setVisible(true);

	}

}
