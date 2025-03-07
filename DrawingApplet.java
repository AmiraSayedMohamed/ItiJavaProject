
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DrawingApplet extends Applet implements ActionListener, MouseListener, MouseMotionListener  {
 private static final int CANVAS_WIDTH = 600;
    private static final int CANVAS_HEIGHT = 400;

    private Panel topPanel;
    private Button rectButton, circleButton, ovalButton, lineButton, yellowButton, blueButton, greenButton, fillButton, eraseButton, increaseButton, decreaseButton,clearButton;
    private Color currentColor = Color.BLACK;
    private String currentShape = "";
    private int startX, startY, endX, endY, lineWidth = 1;
    private boolean isDrawing = false;
    private boolean isErasing = false;   
    public void init() 
 {       setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
           //the buttons
        rectButton = new Button("Rectangle");
        circleButton = new Button("Circle");
        ovalButton = new Button("Oval");
        lineButton = new Button("Line");
        yellowButton = new Button();
        yellowButton.setBackground(Color.YELLOW);
        blueButton = new Button();
        blueButton.setBackground(Color.BLUE);
        greenButton = new Button();
        greenButton.setBackground(Color.GREEN);
        fillButton = new Button("Fill");
        eraseButton = new Button("Eraser");
        increaseButton = new Button("Increase Thickness"); // the increase and decrease buttons can cotrol the Thickness of the lines and the eraser also 
        decreaseButton = new Button("Decrease Thickness");  
        clearButton = new Button("Clear"); // this button erases everthing and restore the white background
            // the action listeners
        rectButton.addActionListener(this);
        circleButton.addActionListener(this);
        ovalButton.addActionListener(this);
        lineButton.addActionListener(this);
        yellowButton.addActionListener(this);
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);
        fillButton.addActionListener(this);
        eraseButton.addActionListener(this);
        increaseButton.addActionListener(this);
        decreaseButton.addActionListener(this);
       clearButton.addActionListener(this);

  	// the panel 
  	 topPanel = new Panel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(rectButton);
        topPanel.add(circleButton);
        topPanel.add(ovalButton);
        topPanel.add(lineButton);
        topPanel.add(yellowButton);
        topPanel.add(blueButton);
        topPanel.add(greenButton);
        topPanel.add(fillButton);
        topPanel.add(eraseButton);
        topPanel.add(increaseButton);
        topPanel.add(decreaseButton);
	topPanel.add(clearButton);

        add(topPanel, BorderLayout.NORTH);
        addMouseListener(this);
        addMouseMotionListener(this);
 }
/*ٌ



رويدا



*/


	
/*

 أميرة
 
 */


	
/*
يحيى

*/


	
/*
ياسمين

*/


	
/*
عمر
*/
}
