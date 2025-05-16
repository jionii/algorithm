import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine().trim();
        String[] parts = input.split(" ");

        int sum1 = Integer.parseInt(parts[0]) + Integer.parseInt(parts[1]);
        int sum2 = Integer.parseInt(parts[0]) - Integer.parseInt(parts[1]);
        int sum3 = Integer.parseInt(parts[0]) * Integer.parseInt(parts[1]);
        int sum4 = Integer.parseInt(parts[0]) / Integer.parseInt(parts[1]);
        int sum5 = Integer.parseInt(parts[0]) % Integer.parseInt(parts[1]);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
        System.out.println(sum5);
    }
}