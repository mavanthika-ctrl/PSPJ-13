public class FitnessTracker {
    public static void main(String[] args) {
        String userName = "Alex";             
        int age = 24;                         
        double weightKg = 68.5;              
        double heightM = 1.75;               
        float bodyFatPercent = 18.5f;           
        long stepsToday = 8500L;              
        boolean goalAchieved = false;          
        char activityLevel = 'M';            
        int workoutDurationMin = 45;
        double caloriesBurnedPerMin = 8.2;
        int setsCompleted = 4;
        int repsPerSet = 12;
        double weightLiftedKg = 40.0;
        double bmi = weightKg / (heightM * heightM);             
        double totalCaloriesBurned = workoutDurationMin * caloriesBurnedPerMin; 
        int totalReps = setsCompleted * repsPerSet;               
        double totalVolumeLifted = totalReps * weightLiftedKg;     
        double avgCaloriesPerRep = totalCaloriesBurned / totalReps; 
        double weightRemainingToGoal = weightKg - 65.0;           
        int stepsRemaining = 10000 - (int) stepsToday;             
        double calorieSurplus = totalCaloriesBurned % 100;        
        boolean isStepGoalMet = stepsToday >= 10000;
        boolean isBmiNormal = (bmi >= 18.5) && (bmi <= 24.9);     
        boolean isUnderweight = bmi < 18.5;
        boolean isOverweight = bmi > 24.9;
        boolean isAdult = age >= 18;     
        boolean isHealthyRoutine = isBmiNormal && isStepGoalMet;  
        boolean needsAttention = isUnderweight || isOverweight;    
        boolean isNotGoalAchieved = !goalAchieved;               
        int totalWorkoutsThisWeek = 0;
        totalWorkoutsThisWeek += 1;  
        totalWorkoutsThisWeek += 1;
        totalWorkoutsThisWeek += 1;
        double weeklyCalorieTotal = 0;
        weeklyCalorieTotal += totalCaloriesBurned;
        int currentStreak = 5;
        currentStreak++;              
        int missedDaysBuffer = 3;
        missedDaysBuffer--;        
        String bmiCategory = isBmiNormal ? "Normal" : (isUnderweight ? "Underweight" : "Overweight");
        String stepStatus = isStepGoalMet ? "Goal Achieved" : "Keep Going";
        int workoutFlags = 0b0000; 
        workoutFlags |= 0b0001;   
        workoutFlags |= 0b0010;  
        boolean isCardioDone = (workoutFlags & 0b0001) != 0;
        System.out.println("===== FITNESS TRACKER REPORT =====");
        System.out.println("User: " + userName + " | Age: " + age + " | Activity Level: " + activityLevel);
        System.out.println("Weight: " + weightKg + " kg | Height: " + heightM + " m");
        System.out.printf("BMI: %.2f (%s)%n", bmi, bmiCategory);
        System.out.println("Body Fat: " + bodyFatPercent + "%");
        System.out.println();

        System.out.println("--- Today's Activity ---");
        System.out.println("Steps Taken: " + stepsToday + " | " + stepStatus);
        System.out.println("Steps Remaining to Goal: " + Math.max(stepsRemaining, 0));
        System.out.println();

        System.out.println("--- Workout Summary ---");
        System.out.println("Duration: " + workoutDurationMin + " min");
        System.out.println("Sets x Reps: " + setsCompleted + " x " + repsPerSet + " = " + totalReps + " total reps");
        System.out.println("Total Volume Lifted: " + totalVolumeLifted + " kg");
        System.out.printf("Calories Burned: %.2f kcal (avg %.2f kcal/rep)%n", totalCaloriesBurned, avgCaloriesPerRep);
        System.out.println("Calorie Surplus (mod 100): " + calorieSurplus);
        System.out.println();

        System.out.println("--- Weekly Stats ---");
        System.out.println("Workouts Completed This Week: " + totalWorkoutsThisWeek);
        System.out.println("Current Streak: " + currentStreak + " days");
        System.out.println("Missed Days Buffer: " + missedDaysBuffer);
        System.out.println();

        System.out.println("--- Health Checks ---");
        System.out.println("Is BMI Normal? " + isBmiNormal);
        System.out.println("Is Healthy Routine (BMI normal AND step goal met)? " + isHealthyRoutine);
        System.out.println("Needs Attention (under/overweight)? " + needsAttention);
        System.out.println("Goal Not Yet Achieved? " + isNotGoalAchieved);
        System.out.println("Cardio Done Today? " + isCardioDone);
    }
}
