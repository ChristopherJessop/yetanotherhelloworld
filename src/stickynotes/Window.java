package stickynotes;

/**

 * 
 */



// Import all Swing components
import javax.swing.*;

/**
 * To demonstrate how to make a window.
 * <br>
 * Date: 2018-04-02
 * @version 1.0
 * @author cwfietz
 *
 */
public class Window extends JFrame {

	// static final long serialVersionUID; <-- Not mentioned in text but a warning from Eclips

	// Create a JPanel container object.
	JPanel pnl = new JPanel();
	
	/**
	 * Constructor for Window class.
	 * Specifies window requirements and 
	 * adds the JPanel object to the JFrame.
	 * Creates a window of 500 by 200 pixels.
	 * 
	 */
	public Window() {
		super("Swing Window");
		setSize( 500, 200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add( pnl );
		setVisible( true );
	}
	
	/**
	 * Creates a blank window
	 * by creating a new Window object
	 * @param args Not used. 
	 */
	public static void main(String[] args) {
		Window gui = new Window();
		
	}

}
