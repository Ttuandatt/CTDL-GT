import java.util.Random;
import java.util.Scanner;

public class Matrix {
        int n;
        int[][] matrixA, matrixB;

        public Matrix(int n){
            this.n = n;
            matrixA = new int[n][n];
            matrixB = new int[n][n];
        }

        public void initializeMatrix(){
            Random rand = new Random();
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    matrixA[i][j] = rand.nextInt(10);
                }
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    matrixB[i][j] = rand.nextInt(10);
                }
            }
        }

        public void printMatrix(int[][] matrix){
            System.out.println("Matrix: ----------------");
            for(int i=0; i<matrix.length; i++){
                for(int j=0; j<matrix.length; j++){
                    System.out.print(matrix[i][j] + "    ");
                }
                System.out.println("\n");
            }
        }

        public void printMatrixA(){
            printMatrix(matrixA);
        }
        public void printMatrixB(){
            printMatrix(matrixB);
        }
        public int[][] sumMatrix(){
            int[][] sum = new int[n][n];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    sum[i][j]=matrixA[i][j]+matrixB[i][j];
                }
            }

            return sum;
        }

        public int[][] mulMatrix(){
            int[][] mul = new int[n][n];

            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    mul[i][j] = 0;
                    for(int k=0;k<n;k++){
                        mul[i][j]+=(matrixA[i][k]) * (matrixB[k][j]);
                    }
                }
            }

            return mul;
        }


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = Integer.parseInt(sc.nextLine());

            Matrix matrix = new Matrix(n);

            matrix.initializeMatrix();
            matrix.printMatrixA();
            matrix.printMatrixB();

            System.out.println("Matrix A + Matrix B = ");
            matrix.printMatrix(matrix.sumMatrix());

        }



}