import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        // Fast input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        StringTokenizer st;

        // Read an integer
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        // Read a float
        st = new StringTokenizer(br.readLine());
        float f = Float.parseFloat(st.nextToken());

        // Read a string
        String s = br.readLine();

        // Example: Print values
        out.println("Integer: " + n);
        out.println("Float: " + f);
        out.println("String: " + s);

        // Flush the output
        out.flush();
    }
}
