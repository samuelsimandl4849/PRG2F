package multipleArrays;

public class MultipleArrays {
    public static void main(String[] args) {
        int[] simpleArray = new int[5];
        int[] simplerArray = {1,2,36,6,98};

        int[][] matrix = {
                {1,2,3},
                {6,8,7},
                {3,99,64}
        };

        int[][] uglyMatrix = {{3,3,3,3,3,}, {123,456,123,456,456,123}, {5}};

        System.out.println(matrix[1][2]);

        int[][] generatedMatrix = new int[5][];
        int[][][] something = new int[10][][];

        //nepouziva se
        generatedMatrix[3] = new int[2];
        generatedMatrix[1] = new int[6];

        
    }
}
