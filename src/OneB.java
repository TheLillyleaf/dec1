import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class OneB {
    public static void main(String[] args) throws Exception {
        System.out.println(countIncrease());

    }

    private static int countIncrease() {
        int countIncrease = 0;
        int countDecrease = 0;
        ArrayList<Integer> array = new ArrayList<>();

        try {
            File input = new File("input");

            Scanner scanner = new Scanner(input);

            while (scanner.hasNextLine()) {
                array.add(Integer.parseInt(scanner.nextLine()));

            }
            scanner.close();

        } catch (Exception e) {
            // TODO: handle exception
        }

        int k = 3;
        int n = array.size();

        int start = 0;

        int sum1 = 0;
        int sum2 = 0;

        for (int i = start; i < k; i++) {
            sum1 += array.get(i);

        }
        start++;

        for (int i = 0; i < array.size() - k + 1; i++) {
            int currentSum = 0;
            for (int j = 0; j < k; j++) {
                currentSum += array.get(i + j);

            }
            if (currentSum > sum1) {
                countIncrease++;
            }
            sum1 = currentSum;

        }

        return countIncrease;
    }

    private static int countIntervall(int start, ArrayList<Integer> arr, int k) {

        int sum = 0;

        for (int i = start; i < k; i++) {
            sum += arr.get(i);

        }

        System.out.println("summan i countinterval " + sum);
        return sum;
    }
}
