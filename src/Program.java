import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de linhas: ");
        int m = sc.nextInt();
        System.out.print("Número de colunas: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j ++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Digite o número a ser encontrado: ");
        int num = sc.nextInt();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j ++){
                if(matrix[i][j] == num){
                    System.out.println("Position: "+ i + ", " + j);
                    int up = i -1;
                    int down = i + 1;
                    int left = j -1;
                    int right = j + 1;
                        if (left >= 0) {
                            System.out.println("Left: " + matrix[i][left]);
                        }
                        if (right < n) {
                            System.out.println("Right: " + matrix[i][right]);
                        }
                        if (up >= 0 ) {
                            System.out.println("Up: " + matrix[up][j]);
                        }
                        if (down < m) {
                            System.out.println("Down: " + matrix[down][j]);
                        }
                    }


                }

            }
        }


    }

