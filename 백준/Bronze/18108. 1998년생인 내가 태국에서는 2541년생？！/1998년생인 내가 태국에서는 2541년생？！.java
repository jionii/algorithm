import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int buddhaYear = Integer.parseInt(bf.readLine());
        int adYear = buddhaYear - 543;
        System.out.println(adYear);
    }
}