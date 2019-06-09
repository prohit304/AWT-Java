import java.awt.*;
import java.awt.event.*;
public class HomeFrame extends Frame {
	 HomeFrame(){
		 this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	 
	 public void paint(Graphics g) {
		 
		 //Co-ordinates
		 int x[]= {375,275,475};
		 int y[]= {125,200,200};
		 int n=3;//no. pairs
		 
		 this.setBackground(Color.gray);
		 
		 //House
		 g.setColor(Color.yellow);
		 g.fillRect(300, 200, 150, 100);
		 
		 //Door
		 g.setColor(Color.blue);
		 g.fillRect(350, 210, 50, 60);
		 
		 //Steps below the Door
		 g.drawLine(350, 280, 400, 280);
		 
		 //Roof-polygon
		 g.setColor(Color.DARK_GRAY);
		 g.fillPolygon(x,y,n);
		 
		 //Moon
		 g.setColor(Color.CYAN);
		 g.fillOval(100, 100, 60, 60);
		 
		 //Grass-arc
		 g.setColor(Color.green);
		 g.fillArc(50, 250, 150, 100, 0, 180);
		 g.fillArc(150, 250, 150, 100, 0, 180);
		 g.fillArc(450, 250, 150, 100, 0, 180);
		 
		 g.drawLine(50, 300, 600, 300);
		 
		 //Some Text
		 g.drawString("My Happy Home", 275, 350);
		 
		 
		 
	 }


	public static void main(String[] args) {
		HomeFrame h=new HomeFrame();
		h.setTitle("My Home");
		h.setSize(700, 400);
		h.setVisible(true);
		

	}

}
