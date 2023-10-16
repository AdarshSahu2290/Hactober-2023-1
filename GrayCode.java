import java.util.ArrayList;
import java.util.List;

public class GrayCode {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1 << n; i++) {
            result.add(i ^ (i >> 1));
        }
        return result;
    }

    public static void main(String[] args) {
        GrayCode grayCode = new GrayCode();
        int n = 2;
        List<Integer> result = grayCode.grayCode(n);
        System.out.println("Gray Code sequence for n=" + n + ": " + result);
    }
}
