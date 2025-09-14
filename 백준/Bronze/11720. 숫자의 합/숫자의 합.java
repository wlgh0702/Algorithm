import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.valueOf(br.readLine());
        String num = br.readLine();
        int sum = 0;
        
        for(int i = 0; i < N; i++) {
            sum += num.charAt(i) - 48;
        }
        System.out.println(sum);
     }
}