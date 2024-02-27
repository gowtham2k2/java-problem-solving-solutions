import java.util.Scanner;

public class LookNSay {
    public static void main(String[] args) {

        int base = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println(base);
            base = calcNext(base);

        }
    }

    // 1
    // 11
    // 21
    // 1211
    // 111221

    public static int calcNext(int base) {

        int temp = 0;
        int newNum = 0;
        int multiplier = 1;
        while (base > 0) {

            int count = 0;
            do {
                temp = base % 10;
                base /= 10;
                count++;
            } while (temp == (base % 10));

            newNum = newNum + (count * 10 + temp) * multiplier;
            multiplier *= 100;
        }

        return newNum;

    }
}