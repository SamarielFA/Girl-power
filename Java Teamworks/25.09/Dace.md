
# ROTATE IMAGE Task
## Medium
### You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

https://leetcode.com/problems/rotate-image/description/

```java
public class RotateImage {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: matrix transposition
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];// swap matrix to  flip it along it`s diagonal
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row in the matrix to achieve a 90-degree clockwise rotation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }
        // get result in readable format
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix);

        System.out.println("\nMatrix Rotated  by 90 degrees clockwise:");
        printMatrix(matrix);
    }
}
```

![image](https://github.com/user-attachments/assets/3acf9c40-7ddc-44ff-a9a3-00471d01b0b6)


