// Demonstrates the Collatz conjecture.
public class Collatz {
    
    public static void main(String[] args) {
        
        int N = Integer.parseInt(args[0]);
        String mood = args[1];
        for (int seed = 1; seed <= N; seed++) {
            long current = seed;
            int steps = 0;
            StringBuilder sequenceOutput = new StringBuilder();
            while (current != 1) {
                if (mood.equals("v")) { 
                    sequenceOutput.append(current).append(" ");
                }
                
                // חישוב הצעד הבא
                if (current % 2 == 0) {
                    current = current / 2;
                } else {
                    current = (current * 3) + 1;
                }
                
                steps++;
            }
            if (mood.equals("v")) {
                sequenceOutput.append(1); 
                System.out.println(seed + " " + sequenceOutput.toString().trim() + " (" + steps + ")");
            }
        }
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}