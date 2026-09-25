public class FitnessTracker{

    public static void main(String[] args) {

        
        String userName = "Alex";
        int[] dailySteps = {8500, 10200, 4300, 9800, 12000, 6700, 3000};       
        double[] caloriesBurned = {320.5, 410.0, 180.2, 390.0, 455.8, 275.0, 150.0}; 
        double[] workoutDurations = {45, 60, 20, 50, 65, 35, 15}; 
        String[] dayNames = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        double[] weeklyWeightLog = {70.5, 70.3, 70.4, 70.1, 69.9, 69.8, 69.7}; 

       
        System.out.println("===== WEEKLY FITNESS REPORT for " + userName + " =====\n");

        printDailyLog(dayNames, dailySteps, caloriesBurned, workoutDurations);

        int totalSteps = sumArray(dailySteps);
        double totalCalories = sumArray(caloriesBurned);
        double totalDuration = sumArray(workoutDurations);

        double avgSteps = average(dailySteps);
        double avgCalories = average(caloriesBurned);

        int maxStepsIndex = indexOfMax(dailySteps);
        int minStepsIndex = indexOfMin(dailySteps);

        int daysGoalMet = countDaysGoalMet(dailySteps, 10000);

        double weightChange = weeklyWeightLog[weeklyWeightLog.length - 1] - weeklyWeightLog[0];

        System.out.println("\n===== WEEKLY SUMMARY =====");
        System.out.println("Total Steps: " + totalSteps);
        System.out.printf("Total Calories Burned: %.2f kcal%n", totalCalories);
        System.out.println("Total Workout Duration: " + totalDuration + " minutes");
        System.out.printf("Average Daily Steps: %.2f%n", avgSteps);
        System.out.printf("Average Daily Calories: %.2f kcal%n", avgCalories);
        System.out.println("Best Step Day: " + dayNames[maxStepsIndex] + " (" + dailySteps[maxStepsIndex] + " steps)");
        System.out.println("Lowest Step Day: " + dayNames[minStepsIndex] + " (" + dailySteps[minStepsIndex] + " steps)");
        System.out.println("Days Step Goal (10,000) Met: " + daysGoalMet + " / " + dailySteps.length);
        System.out.printf("Weight Change This Week: %.2f kg%n", weightChange);

        System.out.println("\n===== SORTED STEP COUNTS =====");
        int[] sortedSteps = sortAscending(dailySteps);
        System.out.println(Arrays.toString(sortedSteps));

        System.out.println("\n===== SEARCH EXAMPLE =====");
        int searchValue = 9800;
        int foundIndex = linearSearch(dailySteps, searchValue);
        if (foundIndex != -1) {
            System.out.println(searchValue + " steps found on " + dayNames[foundIndex]);
        } else {
            System.out.println(searchValue + " steps not found in this week's log.");
        }
    }

   

    
    public static void printDailyLog(String[] days, int[] steps, double[] calories, double[] durations) {
        System.out.println("Day  | Steps  | Calories | Duration(min)");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < days.length; i++) {
            System.out.printf("%-4s | %-6d | %-8.1f | %-5.1f%n",
                    days[i], steps[i], calories[i], durations[i]);
        }
    }

   
    public static int sumArray(int[] arr) {
        int total = 0;
        for (int value : arr) {
            total += value;
        }
        return total;
    }

   
    public static double sumArray(double[] arr) {
        double total = 0;
        for (double value : arr) {
            total += value;
        }
        return total;
    }

    
    public static double average(int[] arr) {
        return sumArray(arr) / (double) arr.length;
    }

    
    public static double average(double[] arr) {
        return sumArray(arr) / arr.length;
    }

   
    public static int indexOfMax(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

   
    public static int indexOfMin(int[] arr) {
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

 
    public static int countDaysGoalMet(int[] steps, int goal) {
        int count = 0;
        for (int value : steps) {
            if (value >= goal) {
                count++;
            }
        }
        return count;
    }

    
    public static int[] sortAscending(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < copy.length - 1; i++) {
            for (int j = 0; j < copy.length - 1 - i; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
        }
        return copy;
    }

    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}