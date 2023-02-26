public class Task1 {
   public static void main(String[] args) {
        String[][] arr = new String[8][8];
        for(int i = 0;i<8;i++){
            for(int j = 0;j<8;j++){
                if(i%2==0 && j%2==0){
                    arr[i][j] = "W";
                }else if(i%2==1 && j%2==1){
                    arr[i][j] = "W";
                }else {
                    arr[i][j] = "B";
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
