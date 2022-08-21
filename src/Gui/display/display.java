package gui.display;

import logic.logic;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class display {
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


    /**
     * 
     * @param matrix 
     * 
     * Creates an instance of a JPanel object for each entry in the matrix that defines the window.
     */
    public static JPanel[][] objectMatrix(float[][] matrix){
        JPanel panels[][] = new JPanel[matrix.length][matrix[0].length]; // initilizes a 2D array of each element as a JPanel obj

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                JPanel panel = new JPanel(); // creates a new JPanel object
                panels[i][j] = panel; // assigns the JPanel object to the 2D array
            }
        }

        return panels; // after the loops are done and the whole matrix is parsed
    }


    public static void generatePanels(float[][] matrix, JFrame frame, JPanel[][] panel, int dimension){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                panel[i][j] = new JPanel();
                // defines the size and position of the JPanel object based on the dimensions of the input matrix and the dimensions of the window
                panel[i][j].setBounds(j*(dimension/matrix.length), i*(dimension/matrix.length), dimension / matrix[i].length, dimension / matrix.length);
                panel[i][j].setBackground(new Color((int) (matrix[i][j] * 150), (int) (matrix[i][j] * 50), (int) (matrix[i][j] * 90)));
                frame.add(panel[i][j]);
            }
        }
    }


    public static void main(String[] args) {
        logic logic = new logic(); // instantiate logic object from the logic package
        JFrame frame = new JFrame(); // instantiate frame object from the javax.swing packag

        int dimension = 500;

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

