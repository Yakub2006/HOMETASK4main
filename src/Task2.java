import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[][][] arr = new int[3][3][3];
        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 3;j++){
                for(int n = 0;n < 3;n++){
                    arr[i][j][n] =(int)(Math.random()*10);
                    System.out.print(arr[i][j][n] + " ");
                    arr[i][j][n] += x;
                    System.out.print("||- result " + arr[i][j][n] + " ");
                }
                System.out.println();
            }

        }
    }
}
