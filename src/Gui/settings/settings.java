package gui.settings;

import logic.logic;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;

// creates a second window that allows end users to edit the settings of the gui

public class settings {
    /**
     * 
     * @param frame
     *  
     * Defines frame attributes for main display.
     */
    public static void screenSettings(JFrame frame, int dimension) {
        frame.setSize(dimension+13, dimension+37);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setTitle("Matrix Display");
        frame.setResizable(false);
    }

    // creates a button object on the frame
    public static JButton button(JFrame frame, String text){
        JButton button = new JButton(text);
        button.setBounds(50, 50, 150, 50);
        frame.add(button);
        return button;
    }
    



    public static void main(String args[]){
        int dimension = 500;
        JFrame frame = new JFrame();

        screenSettings(frame, dimension);
        button(frame, "Show Elevation");

    }

}
