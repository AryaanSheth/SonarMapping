package Gui;

import LogicPkg.Logic;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class gui {

    public static void screenSettings(JFrame frame, int dimension) {
        frame.setSize(dimension + 13, dimension + 37);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set default close operation
        frame.setVisible(true); // make the fram visible
        frame.setTitle("Matrix");
        // frame.setLayout(null);
        frame.setResizable(false);
    }

    public static void generatePanels(float[][] matrix, JFrame frame, JPanel[][] panel, int dimension) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                panel[i][j] = new JPanel();
                panel[i][j].setBounds(j * (dimension / matrix[i].length), i * (dimension / matrix.length),
                        dimension / matrix[i].length, dimension / matrix.length);
                        // removed sum values for initial colors, caused bug that made matrix colors freeze if the elements werent in increasing order
                panel[i][j].setBackground(new Color((int) (matrix[i][j] * 150), (int) (matrix[i][j] * 50), (int) (matrix[i][j] * 90)));
                frame.add(panel[i][j]);
            }
        }
    }

    public static JPanel[][] objectMatrix(float[][] matrix) {
        JPanel panels[][] = new JPanel[matrix.length][matrix[0].length]; // create a 2D array of JPanels
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                JPanel panel = new JPanel(); // creates a new JPanel obj for each element in the matrix
                panels[i][j] = panel; // sets current JPanel to current index of matrix
            }
        }
        return panels;
    }

    public static void main(String[] args) {
        Logic logic = new Logic(); // instantiate logic object from the logic package
        JFrame frame = new JFrame(); // instantiate frame object from the javax.swing package

        int dimension = 500; // set dimension of frame

        float[][] matrix = { {1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12 }, {13, 14, 15, 16}}; // test matrix
        logic.printMatrix(matrix);

        float[][] normMatrix = logic.normalizeMatrix(matrix, logic.findMaxMatrix(matrix));
        // logic.printMatirx(matrix);
        System.out.println(objectMatrix(matrix));
        objectMatrix(matrix);

        screenSettings(frame, dimension); // call screenSettings method to set up the screen
        generatePanels(normMatrix, frame, objectMatrix(matrix), dimension); // call generatePanels method to generate
                                                                            // the panels
    }
}