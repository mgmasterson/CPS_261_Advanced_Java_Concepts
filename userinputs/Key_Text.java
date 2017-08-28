package userinputs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Getting to know how to use userinputs to paints dots with mousepressed and JFrame. Will paint dots.
 */
public class Key_Text extends JFrame
implements KeyListener{
	private static final long serialVersionUID = 1L;
	String text2Display="Hi";

	public Key_Text(String name)
	{
		super(name);
		setVisible(true); 
		setSize(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		addKeyListener(this);
	}

	public void paint(Graphics g)
	{ 
		super.paint(g);
		Dimension d = getSize();
		// find out how big our drawing area is
		int frameWidth = d.width;
		int frameHeight = d.height;


		// Font Font names to try: Serif, SansSerif, Courier
		// Font types to try Font.BOLD, Font.ITALIC
		Font myFont;
		FontMetrics fm;
		int height;
		int width;
		int nextSize = 72;
		boolean continueFlag;

		do
		{
			continueFlag=false;

			myFont = new Font("TimesRoman", Font.PLAIN, nextSize);

			fm = getFontMetrics(myFont);

			height = fm.getHeight();
			width = fm.stringWidth(text2Display);
			if (width >= frameWidth)
			{
				nextSize -= 2;
				continueFlag=true;
			}
		}while (continueFlag);

		System.out.println("Frame("+frameWidth+") width("+width+")");

		// Num pixels for font above "line"
		int maxAscent = fm.getMaxAscent();
		// Num pixels for font below "line"
		int maxDescent = fm.getMaxDescent();
		// Num pixels between lowest point of one line and highest point of next line
		int leading = fm.getLeading();
		System.out.println("FontSize="+ nextSize+" Height="+height+" maxAscent="+maxAscent+
				" maxDescent="+maxDescent+ " leading="+leading);

		// Attempt to center text horizontally
		int xStart = frameWidth/2 - width/2;
		int yStart = frameHeight/2 - height/2;
		g.setColor(Color.yellow);
		g.fillRect(xStart, yStart, width, height);

		g.setColor(Color.black);
		g.setFont(myFont);
		g.drawString(text2Display, xStart, yStart+maxAscent);
		g.drawLine(xStart, yStart+maxAscent, xStart+width, yStart+maxAscent);


		System.out.println("Paint:"+text2Display+ "-fontsize="+nextSize + " x,y="+xStart+","+yStart);    
	} 

	public void keyTyped(KeyEvent e)
	{
		char c = e.getKeyChar();
		System.out.println("Char type="+c);
		int len = text2Display.length();
		switch (c)
		{
		case KeyEvent.VK_BACK_SPACE:
			if (len > 0)
				text2Display = text2Display.substring(0,len-1);
			break;

		case KeyEvent.VK_ENTER:
			text2Display="Enter";
			break;

		case KeyEvent.VK_ESCAPE:
			text2Display="";
			break;

		default:
			text2Display += c;            
			break;
		}
		repaint();

	} 
	public void keyPressed(KeyEvent e)
	{

	} 
	public void keyReleased(KeyEvent e)
	{

	}


	public static void main(String[] args) { 
		Key_Text keyTextFrame = new Key_Text("My Key and Text Program");
	} // end of main


}