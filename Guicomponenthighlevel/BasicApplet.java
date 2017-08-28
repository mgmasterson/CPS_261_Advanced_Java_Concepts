package Guicomponenthighlevel;

import java.awt.*;
import javax.swing.*;
/**
 * @author Michael Masterson
 * CPS 261
 * 
 * Simple GUI
 */
public class BasicApplet extends JApplet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init() {      
		setLayout(new FlowLayout());   
		add(new JButton("HI There")); 
	}  
}