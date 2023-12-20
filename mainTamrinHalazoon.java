package exeercise;

import java.util.Scanner;

public class mainTamrinHalazoon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tedad satr va soton ra benevisid:  ");
        int n = input.nextInt();
        int[][] matrix =  Tamrin.get_matrix(n);
        int[][] show =  Tamrin.showspiralArray(n);
        Tamrin.showArray(matrix);
        Tamrin.print2dArray(Tamrin.showspiralArray(n));
        Tamrin.nahayi(n,show,matrix);
    }
}
