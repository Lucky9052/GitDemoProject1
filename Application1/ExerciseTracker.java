import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseTracker {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Exercise> exercises = new ArrayList<>();
	        ArrayList<User> users = new ArrayList<>();

	        while (true) {
	            System.out.println("\nMenu Options:");
	            System.out.println("1. Add a new exercise");
	            System.out.println("2. Display available exercises");
	            System.out.println("3. Select an exercise to complete");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume the newline character

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter exercise name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter difficulty level (1-5): ");
	                    int difficultyLevel = scanner.nextInt();
	                    System.out.print("Enter duration (in minutes): ");
	                    int durationMinutes = scanner.nextInt();
	                    scanner.nextLine(); // Consume the newline character
	                    System.out.print("Enter exercise description: ");
	                    String description = scanner.nextLine();

	                    Exercise newExercise = new Exercise(name, difficultyLevel, durationMinutes, description);
	                    exercises.add(newExercise);
	                    System.out.println("Exercise added successfully!");
	                    break;

	                case 2:
	                    System.out.println("Available Exercises:");
	                    for (int i = 0; i < exercises.size(); i++) {
	                        Exercise exercise = exercises.get(i);
	                        System.out.println("Exercise " + (i + 1) + ": " + exercise.getName());
	                        System.out.println("Difficulty Level: " + exercise.getDifficultyLevel());
	                        System.out.println("Duration: " + exercise.getDurationMinutes() + " minutes");
	                        System.out.println("Description: " + exercise.getDescription());
	                    }
	                    break;

	                case 3:
	                    if (exercises.isEmpty()) {
	                        System.out.println("No exercises available. Please add exercises first.");
	                    } else {
	                        System.out.print("Enter your username: ");
	                        String username = scanner.nextLine();
	                        User currentUser = findUser(username, users);

	                        if (currentUser == null) {
	                            System.out.println("User not found. Creating a new user.");
	                            System.out.print("Enter your age: ");
	                            int age = scanner.nextInt();
	                            scanner.nextLine(); // Consume the newline character
	                            currentUser = new User(username, age);
	                            users.add(currentUser);
	                        }

	                        System.out.print("Select an exercise (enter the exercise number): ");
	                        int exerciseNumber = scanner.nextInt();
	                        scanner.nextLine(); // Consume the newline character

	                        if (exerciseNumber >= 1 && exerciseNumber <= exercises.size()) {
	                            Exercise selectedExercise = exercises.get(exerciseNumber - 1);
	                            currentUser.completeExercise(selectedExercise);
	                        } else {
	                            System.out.println("Invalid exercise number.");
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.println("Exiting the application.");
	                    scanner.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                    break;
	            }
	        }
	    }
}
