package DrawingBasics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Simple drawing color. Will show predetermined fonts in color.
 */
public class Simple extends JFrame {
	Simple()
	{
		setSize(600,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g)
	{
		super.paint(g);

		//Color color = null;
		Color color = Color.red;
		//Color color = new Color(255,80, 80);
		//Color color = new Color(1.0f,0.4f, 0.4f);
		//String s = "FF8080";
		//int c = Integer.parseInt(s, 16);
		//Color color =new color(c);
		g.setColor(color);
		//g.drawRect(10, 35, 400, 150);
		//g.fillRect(10, 200, 400, 150);
		//g.drawOval(10, 35, 400, 150);
		//g.fillOval(10, 200, 400, 150);

		//g.drawLine(10, 170, 400, 170);
		//g.drawString("Michael's artwork",50, 100);

		//g.drawRoundRect(110, 55, 200, 100, 45, 15); 
		//g.fillRoundRect(110, 255, 200, 100, 15, 45);

		//g.draw3DRect(110, 55, 200, 100, false); 
		//g.draw3DRect(350, 55, 200, 100, true);
		//g.fill3DRect(110, 200, 200, 100, false); 
		//g.fill3DRect(350, 200, 200, 100, true);

		g.setColor(Color.red);
		//g.drawArc(100, 100, 180, 180, 20, 60);
		//g.fillArc(300, 100, 180, 180, 20, 60);

		//g.setColor(Color.blue);
		//g.drawRect(100, 100, 180, 180);
		//g.drawRect(300, 100, 180, 180);

		//int[] x={100, 200, 300};
		//int[] y={50, 150, 90};
		//int[] x2={100, 200, 300, 250, 150};
		//int[] y2={300, 200, 300, 380, 380};

		//Polygon p = new Polygon(x, y, x.length);
		//Polygon p2 = new Polygon(x2, y2, x2.length);
		//g.drawPolygon(p);
		//g.fillPolygon(p2); 

		Font font = new Font(Font.SERIF, Font.BOLD, 16);
		g.setFont(font);
		g.drawString("SERIF", 30, 80);

		font = new Font("SansSerif", Font.BOLD, 16);
		g.setFont(font);
		g.drawString("SansSerif", 30,130);

		font = new Font(Font.MONOSPACED, Font.BOLD, 16);
		g.setFont(font);
		g.drawString("MONOSPACED", 30,180);

		font = new Font("Poor Richard", Font.BOLD, 16);
		g.setFont(font);
		g.drawString("Poor Richard", 30,230);
	}

	//	void button(Graphics g, int x, int y, int w, int h, int thickness, boolean raised)
	//{
	//for (int i=0; i < thickness; i++)
	//{
	//    g.fill3DRect(x+i, y+i, w-2*i, h-2*i, raised);
	//  }
	//}
	//public void paint(Graphics g) {       
	//  super.paint(g);

	///g.setColor(Color.red);
	//button(g,110, 55, 200, 100, 10, true);
	//button(g,110, 200, 200, 100, 10, false);
	//}

	public static void main(String[] args) {
		Simple f = new Simple();

	}

}
