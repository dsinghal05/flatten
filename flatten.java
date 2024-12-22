public class flatten { //takes a 2 dimensional array and converts it into a 1 dimension array
    public static void main(String[] args) {
    
    
    int[][] a = {
        {0, 1, 2, 3},
        {4, 5, 6, 7},
        {8, 9, 10, 11}
    };

    int rows = a.length;
    int cols = a[0].length;

    for (int y = 0; y < a.length; y++) {
        for (int x = 0; x < a[y].length; x++) {
            System.out.print(a[y][x] + " ");
        }
        System.out.println();
    }

    int[] tmp = new int[rows*cols];
    int z = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            tmp[z] = a[i][j];
            z++;
        }
    }
    for (int i = 0; i < tmp.length; i++) {
        System.out.print(tmp[i] + " ");
    }
}
}
