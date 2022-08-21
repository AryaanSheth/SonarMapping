package logic;

import javax.swing.JPanel;

public class logic {
    
    /**
     * @param matrix
     * 
     * Prints the matrix in a more readable way.
     */
    public void printMatrix(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param matrix
     * 
     * Prints the matrix in a more readable way.
     */
    public void printMatrixObject(JPanel[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * @param matrix
     * @return float
     * 
     * Returns the value of the matrix at the given row and column.
     */
    public float findMaxMatrix(float[][] matrix) {
        float maxVal = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxVal) { // reassigin maxVal if current value is larger
                    maxVal = matrix[i][j];
                }
            }
        }
        return maxVal;
    }

    /**
     * @param matrix
     * @return matrix
     * 
     * normalizes the matrix by dividing each value by the max value.
     */
    public float[][] normalizeMatrix(float[][] matrix, float maxVal) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.round((matrix[i][j] / maxVal) * 100) / 100.0f; // normalize value and round to 2
                                                                                   // decimal places
            }
        }
        return matrix;
    }   

}
