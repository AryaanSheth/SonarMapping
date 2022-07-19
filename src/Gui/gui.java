package Gui;

import LogicPkg.Logic;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui{

    public static void screenSettings(JFrame frame, JPanel panel, int dimension){
        frame.setSize(dimension, dimension);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation
        frame.setVisible(true); // make the fram visible
        frame.setTitle("Matrix");
        frame.setLayout(null);
        frame.setResizable(false);
    }

    public static void generatePanels(float[][] matrix, JFrame frame, JPanel panel, int dimension){
        panel.setBackground(Color.CYAN);
        panel.setBounds(0, 0, dimension/matrix.length, dimension/matrix.length);
        panel.add(panel);
    }

    public static void main(String[] args){
        Logic logic = new Logic();  // instantiate logic object from the logic package
        JFrame frame = new JFrame(); // instantiate frame object from the javax.swing package
        JPanel panel = new JPanel(); // instantiate panel object from the javax.swing package

        final int dimension = 500;

        float[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        logic.printMatirx(matrix);

        screenSettings(frame, panel, dimension); // call screenSettings method to set up the screen
        generatePanels(matrix, frame, panel, dimension); // call generatePanels method to generate the panels
    }
}