public class PavelYatskevich_1_5 {
    public static boolean
    isLowerTriangularMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        int rows = 3, columns = 3;
        if (rows == columns) {
            int Matrix[][]
                    = {{1, 0, 0}, {2, 3, 0}, {5, 6, 7}};
            System.out.println("Матрица : ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(Matrix[i][j] + " ");
                }
                System.out.println();
            }
            boolean result
                    = isLowerTriangularMatrix(Matrix);
            if (result == true) {
                System.out.println(
                        "Является нижней треугольной матрицей");
            } else {
                System.out.println(
                        "Не является нижней треугольной матрицей");
            }
        } else {
            System.out.println(
                    "Количество строк и количество столбцов должны быть равны");
        }
    }
}

