// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        String mood = args[1];

        for (int i = 1; i <= n; i++) {
            int newnum = i;
            int count = 1;

            if (mood.equals("v")) {
                System.out.print(i + " ");
            }

            while (newnum != 1) {
                if (newnum % 2 == 0) {
                    newnum = newnum / 2;
                } else {
                    newnum = newnum * 3 + 1;
                }

                count++;

                if (mood.equals("v")) {
                    System.out.print(newnum + " ");
                }
            }

            if (mood.equals("v")) {
                System.out.println("(" + count + ")");
            }
        }

        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}
