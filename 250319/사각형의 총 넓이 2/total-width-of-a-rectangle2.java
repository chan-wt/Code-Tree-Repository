import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[201][201];
        int offset = 100;
        int cnt = 0;

        for (int k = 0; k < n; k++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int i = x1; i < x2; i++) { //사각형 채우기
                for (int j = y1; j < y2; j++) {
                    arr[i + offset][j + offset] = 1;
                }
            }
        }
        
        for (int l = 0; l < 201; l++) {
            for (int o = 0; o < 201; o++) {
                if(arr[l][o]>0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
