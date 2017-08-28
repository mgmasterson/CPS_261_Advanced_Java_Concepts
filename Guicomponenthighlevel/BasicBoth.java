package Guicomponenthighlevel;

import java.awt.*;
import javax.swing.*;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Simple GUI
 */
public class BasicBoth extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() { 
		setLayout(new FlowLayout());     
		add(new JButton("HI There")); 
	}

	public static void main(String[] args) { 
		BasicBoth applet = new BasicBoth(); 
		JFrame aFrame = new JFrame("Basic"); 

		aFrame.add(applet); 
		aFrame.setSize(600,150); 
		// Normally the following call comes from the Browser
		applet.init(); 

		aFrame.setVisible(true); 
	} // end of main
}
