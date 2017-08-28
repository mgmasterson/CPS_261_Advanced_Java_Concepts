package userinputs;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Getting to know how to use userinputs to paints dots with mousepressed and JFrame. Will paint dots.
 */

public class SpotsArt extends JFrame
implements MouseListener, MouseMotionListener{

	private static final long serialVersionUID = 1L;
	Point clickPoint=new Point(-1,-1);
	int radius = 7;
	Color color;
	boolean first=true;

	public SpotsArt(String name)
	{
		super(name);
		setSize(800, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Our JFrame is a Component.  We want to register it to
		// fire MouseEvents according to the MouseListener interface
		// The class which will handle this interface in the JFrame itself.
		// This implies our JFrame must implement the MouseListener interface.

		addMouseListener(this);
		// MouseMotionListener interface gives us the Drag capability

		addMouseMotionListener(this);
	}

	public void paint(Graphics g)
	{ 
		Dimension d = getSize();
		Insets insets = getInsets(); 
		int left=insets.left;
		int right = insets.right;
		int top = insets.top;
		int bottom = insets.bottom;

		if (first)
		{      
			super.paint(g);
			g.setColor(Color.white);
			g.fillRect(0,0, d.width, d.height);
			first = false;
		}

		g.setColor(Color.red);    
		g.drawRect(left, top,d.width -1 -left -right , d.height -1 -top -bottom); // draw boundary


		if (clickPoint.x >= 0)
		{
			g.setColor(color);
			g.fillOval(clickPoint.x - radius,    clickPoint.y - radius,
					2*radius, 2*radius);
		}
	}    
	public void mousePressed(MouseEvent e)
	{
		clickPoint.x = e.getX();
		clickPoint.y = e.getY();

		color = new Color(
				(float)Math.random(), (float)Math.random(), (float)Math.random());
		// Note that nothing happens unless I tell java to repaint my screen
		repaint();
	}

	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

	public void mouseDragged(MouseEvent e)
	{
		clickPoint.x = e.getX();
		clickPoint.y = e.getY();
		// Note that nothing happens unless I tell java to repaint my screen
		repaint();
	}
	public void mouseMoved(MouseEvent e){} // part of MouseMotionListener

	public static void main(String[] args) { 
		SpotsArt spots = new SpotsArt("My Spots Art Program"); 
	} // end of main


}
