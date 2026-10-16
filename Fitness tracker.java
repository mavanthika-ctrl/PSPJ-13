
    class FitnessTracker {
    static int totalSteps(int[] steps) {
        int total = 0;

        for (int s : steps) {
            total += s;
        }

        return total;
    }

    public static void main(String[] args) {
        int[] steps = {2000, 3000, 4000};
        int total = totalSteps(steps);
        System.out.println("Total steps: " + total);
     }
    }
 
