package userinputs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Getting to know how to use userinputs to paints dots with mousepressed and JFrame. Will paint dots.
 */
public class Spots3 extends JFrame
{
	private static final long serialVersionUID = 1L;
	Point clickPoint=new Point(-1,-1);
	int radius = 7;



	public Spots3(String name)
	{
		super(name);
		setSize(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				clickPoint.x = e.getX();
				clickPoint.y = e.getY();
				repaint();
			}    
		}

				);
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
