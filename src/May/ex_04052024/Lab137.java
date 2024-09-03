package May.ex_04052024;

public class Lab137 {
    public static void main(String[] args) {

        int[] array_1d = {20, 30, 450, 321};

        //2D Arrays
        // Matrix - Rows and Columns

        //Rows - Horizontal
        //Columns - Vertical

        int[][] array_2D = {
                {34, 12, 11},
                {34, 12, 34},
                {11, 23, 98}
        };
        int[][] array_2d_2 = new int[3][3];
        // |0,0,0|
        // |0,0,0|
        // |0,0,0|
        array_2d_2[0][0] = 34;
        // |34,0,0|
        // |0,0,0|
        // |0,0,0|
        array_2d_2[0][1] = 12;
        // |34,12,0|
        // |0,0,0|
        // |0,0,0|

        for (int i = 0; i < array_2D.length; i++) { // Row
            for (int j = 0; j < array_2D[i].length; j++) { // Column
                System.out.println(array_2D[i][j]);
            }
        }
    }




}
