import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(bf.readLine());
        String B = bf.readLine();

        int one = A * (B.charAt(2) - '0');
        int ten = A * (B.charAt(1) - '0');
        int hundred = A * (B.charAt(0) - '0');

        int result = one + (ten * 10) + (hundred * 100);

        System.out.println(one);
        System.out.println(ten);
        System.out.println(hundred);
        System.out.println(result);
    }
}