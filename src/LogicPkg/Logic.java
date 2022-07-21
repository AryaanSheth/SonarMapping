package LogicPkg;

public class Logic {

    // Outputs float matrix in a grid format to the console
    public void printMatrix(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Outputs object matrix in a grid format to the console
    public void printMatrixObject(Object[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Finds the largest value in the matrix
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

    // finds the smallest value in the matrix
    // public static float findMinMatirx(float[][] matrix){
    // float minVal = matrix[0][0];
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[i].length; j++) {
    // if(matrix[i][j] < minVal){
    // minVal = matrix[i][j];
    // }
    // }
    // }
    // return minVal;
    // }

    // normalize matrix relative to 1
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