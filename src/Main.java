
class Main{

    // Outputs a matrix in a grid format to the console
    public static void printMatirx(float [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // finds the smallest value in the matrix
    public static float findMinMatirx(float[][] matrix){
        float minVal = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] < minVal){
                    minVal = matrix[i][j];
                }

            }
        }
        return minVal;
    }

    // normalize matrix based on minVal (Subtract each element by minVal)
    public static float[][] normalizeMatirx(float[][] matrix, float minVal){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] - minVal;
            }
        }
        return matrix;
    }

    
    // currently does nothing
    public static void main(String args[]){
        float[][] matrix = {{5,2,5},{7,4,3},{7,8,7}}; // test matrix

    }

}