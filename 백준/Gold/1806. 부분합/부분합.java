import java.util.*;
import java.io.*;

class Main{
    public static int n;
    public static int[] arr;
    public static int answer;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        
        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int curCnt = 0;
        int minCnt = 200000;
        int left = 0;
        int right = 0;
        int sum = 0;
        
        while (left != n){
            if(sum<s){
                if(right == n){
                    left++;
                    continue;
                }
                sum += arr[right];
                right++;
                curCnt++;
            } else{
                minCnt = Math.min(minCnt, curCnt);
                sum -= arr[left];
                left++;
                curCnt--;
            }
        }
        
        if(minCnt == 200000){
            answer = 0;
        } else{
            answer = minCnt;
        }
        System.out.println(answer);       
        

        //bw.write(answer);
/*
        for (int i = 0; i < n; i++) {
            bw.write(answer[i] + " ");
        }*/

        //bw.flush();
        //bw.close();
    }
}