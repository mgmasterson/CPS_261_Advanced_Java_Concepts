package userinputs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Getting to know how to use userinputs to paints dots with mousepressed and JFrame. Will paint dots.
 */

public class Spots2 extends JFrame
{

	private static final long serialVersionUID = 1L;
	Point clickPoint=new Point(-1,-1);
	int radius = 7;

	// Inner Class *************************************
	class MyMouseHandler implements MouseListener
	{        
		public void mousePressed(MouseEvent e)
		{
			clickPoint.x = e.getX();
			clickPoint.y = e.getY();
			// Note that nothing happens unless I tell java to repaint my screen
			repaint();
		}

		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}       
	}
	//**************** End of Inner Class 

	public Spots2(String name)
	{
		super(name);
		setSize(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		MyMouseHandler mmh = new MyMouseHandler();
		addMouseListener(mmh);
	}

	public void paint(Graphics g)
	{
		super.paint(g);
		Color color = new Color(1.0f, 0.0f, 0.0f);

		if (clickPoint.x >= 0)
		{
			g.setColor(color);
			g.fillOval(clickPoint.x - radius,    clickPoint.y - radius,
					2*radius, 2*radius);
		}
	}

	public static void main(String[] args) { 
		Spots spots = new Spots("My Spots Program");
		spots.setVisible(true);
	} // end of main


}