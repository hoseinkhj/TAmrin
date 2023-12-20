package exeercise;

import java.util.Arrays;
import java.util.Scanner;

public class Tamrin {
    // -------------------------------------------- gereftan matrix
    public static int[][] get_matrix(int n) {
        System.out.println("---------------------------");
        System.out.println("Moalefe hara vared koni:  ");
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    // ---------------------------------------- khod maghloob
    public static String maghloob(int y, int l) {
        int n2 = y;
        int m = 0;
        int s = 0;
        String sl = "";
        while (y > 0) {
            m = y % 10;
            s = (s * 10) + m;
            y = y / 10;
        }
        if (n2 == s) {
            sl = "True";
        }
        return sl;
    }

    // --------------------------------------------- show array
    public static void showArray(int[][] m) {
        System.out.println("---------------------------");
        System.out.println("Your input array is :");
        for (int[] i : m) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println("---------------------------");
    }

    // -----------------------------------------andis gozari
    public static int[][] showspiralArray(int dimension) {
        int[][] spiralArray = new int[dimension][dimension];
        int numConcentricSquares = (int) Math.ceil((dimension) / 2.0);
        int j;
        int sideLen = dimension;
        int currNum = 0;
        for (int i = 0; i < numConcentricSquares; i++) {
            for (j = 0; j < sideLen; j++) {
                spiralArray[i][i + j] = currNum++;
            }
            for (j = 1; j < sideLen; j++) {
                spiralArray[i + j][dimension - 1 - i] = currNum++;
            }
            for (j = sideLen - 2; j > -1; j--) {
                spiralArray[dimension - 1 - i][i + j] = currNum++;
            }
            for (j = sideLen - 2; j > 0; j--) {
                spiralArray[i + j][i] = currNum++;
            }
            sideLen -= 2;
        }
        return spiralArray;
    }

    // ---------------------------final mohasebati
    public static void nahayi(int tedad_line, int[][] showSprial, int[][] matrix) {
        Scanner input = new Scanner(System.in);
        int z = 0;
        int count = 0;
        System.out.println("khane mored nazar ra vared konid:  ");
        int x = input.nextInt();
        System.out.println("--------------------------------------");
        int[][] arrayAdadi = showspiralArray(tedad_line);
        // mitonim mosavi bezarim vali eror mide------------------------------
        for (int i = 0; i < arrayAdadi.length; i++) {
            for (int j = 0; j < arrayAdadi.length; j++) {
                for (int l = 0; l < x; l++) {
                    if (l == arrayAdadi[i][j]) {
                        z += matrix[i][j];
                        ;
                        if (maghloob(z, l) == "True") {
                            System.out.println("Adad " + z + " dar andis " + l + " maghloob ast.");
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("Tedad kol maghloob ha barabar ast ba : " + count);
    }

    // ------------------------------------------------ main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tedad satr va soton ra benevisid:  ");
        int n = input.nextInt();
        int[][] matrix = get_matrix(n);
        int[][] show = showspiralArray(n);
        showArray(matrix);
        nahayi(n, show, matrix);

    }
}
