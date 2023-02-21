package level;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _2798_blackJack {
    public static void main(String[] str) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    static int search(int[] arr, int N, int M) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            if (arr[i] > M) continue;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] > M) continue;
                for (int k = j + 1; k < arr.length; k++) {
                    sum = arr[i]+arr[j]+arr[k];
                    if(sum==M)
                        return M;
                    if(sum<=M){
                        result = sum;
                    }
                }
            }
        }
        return result;
    }
}
