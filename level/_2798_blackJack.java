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
            sum += arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum += arr[j];
                    for (int k = 0; k < arr.length; k++) {
                        if(j!=k){
                            sum += arr[k];
                            if(sum>result&&M>=sum){
                                result = sum;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
