public class FitnessTrackerControl {
    public static void main(String[] args) {
        String userName = "Alex";
        int age = 24;
        double bmi = 22.4;
        long stepsToday = 8500L;
        int workoutDurationMin = 45;
        double heartRate = 152.0;
        char activityLevel = 'M';       
        int dayOfWeek = 3;              
        double caloriesBurned = 369.0;
        System.out.println("===== BMI CHECK =====");
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Category: Normal weight");
        } else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Category: Overweight");
        } else {
            System.out.println("Category: Obese");
        }

        System.out.println("\n===== STEP GOAL =====");
        if (stepsToday >= 10000) {
            System.out.println("Great job! Daily step goal achieved.");
        } else if (stepsToday >= 5000) {
            System.out.println("Halfway there! Keep moving.");
        } else {
            System.out.println("Low activity today. Try to walk more.");
        }

        System.out.println("\n===== HEART RATE ZONE =====");
        if (heartRate > 0) {
            if (heartRate < 100) {
                System.out.println("Zone: Resting");
            } else if (heartRate < 140) {
                System.out.println("Zone: Fat Burn");
            } else if (heartRate < 170) {
                System.out.println("Zone: Cardio");
            } else {
                System.out.println("Zone: Peak / Danger - slow down!");
            }
        } else {
            System.out.println("Invalid heart rate reading.");
        }

        System.out.println("\n===== WORKOUT DURATION FEEDBACK =====");
        if (workoutDurationMin < 15) {
            System.out.println("Too short. Aim for at least 20-30 minutes.");
        } else if (workoutDurationMin <= 45) {
            System.out.println("Good workout duration.");
        } else {
            System.out.println("Excellent! Long and intense session.");
        }


        System.out.println("\n===== ACTIVITY LEVEL =====");
        switch (activityLevel) {
            case 'L':
                System.out.println("Activity Level: Low - Light stretching or walking.");
                break;
            case 'M':
                System.out.println("Activity Level: Medium - Moderate cardio/strength mix.");
                break;
            case 'H':
                System.out.println("Activity Level: High - Intense training session.");
                break;
            default:
                System.out.println("Activity Level: Unknown - Please update input.");
        }
        System.out.println("\n===== TODAY'S WORKOUT PLAN =====");
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday: Chest & Triceps");
                break;
            case 2:
                System.out.println("Tuesday: Back & Biceps");
                break;
            case 3:
                System.out.println("Wednesday: Leg Day");
                break;
            case 4:
                System.out.println("Thursday: Shoulders & Abs");
                break;
            case 5:
                System.out.println("Friday: Full Body / Cardio");
                break;
            case 6:
                System.out.println("Saturday: Active Recovery (Yoga/Walk)");
                break;
            case 7:
                System.out.println("Sunday: Rest Day");
                break;
            default:
                System.out.println("Invalid day entered.");
        }

        System.out.println("\n===== CALORIE BURN RATING =====");
        String burnCategory;
        if (caloriesBurned < 200) {
            burnCategory = "LOW";
        } else if (caloriesBurned < 400) {
            burnCategory = "MEDIUM";
        } else {
            burnCategory = "HIGH";
        }

        switch (burnCategory) {
            case "LOW":
                System.out.println("Calories Burned: " + caloriesBurned + " kcal -> Light session.");
                break;
            case "MEDIUM":
                System.out.println("Calories Burned: " + caloriesBurned + " kcal -> Solid effort!");
                break;
            case "HIGH":
                System.out.println("Calories Burned: " + caloriesBurned + " kcal -> Amazing workout!");
                break;
            default:
                System.out.println("Unable to determine calorie burn rating.");
        }
        System.out.println("\n===== AGE GROUP =====");
        int ageGroup = age / 10;
        switch (ageGroup) {
            case 0:
            case 1:
                System.out.println("Age Group: Teen (Under 20)");
                break;
            case 2:
                System.out.println("Age Group: Young Adult (20-29)");
                break;
            case 3:
                System.out.println("Age Group: Adult (30-39)");
                break;
            case 4:
                System.out.println("Age Group: Middle Aged (40-49)");
                break;
            default:
                System.out.println("Age Group: 50+");
        }

        System.out.println("\nReport generated for user: " + userName);
    }
}