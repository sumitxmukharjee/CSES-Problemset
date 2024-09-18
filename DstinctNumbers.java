
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class DstinctNumbers{
    public static void main(String[] args) throws IOException {
     
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        // int[] arr = new int[n];
        // st = new StringTokenizer(br.readLine());

        // for(int i=0;i<n;i++){
        //     arr[i] = Integer.parseInt(st.nextToken());
        // }

        // int count = 1;
        // for(int i=1;i<n;i++){
        //     if(arr[i] != arr[i-1]){
        //         count++;
        //     }
        // }
        // System.out.println(count);

        Set<Integer> newSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            newSet.add(Integer.parseInt(st.nextToken()));
        }

        System.out.println(newSet.size());
    }
}