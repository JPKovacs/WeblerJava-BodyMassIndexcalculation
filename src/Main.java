import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BMI - Body Mass Index calculation for Men and Women in SI Metric Units");

        // The input fields with input validation
        Scanner myObj = new Scanner(System.in);

        int age;
        do {
            System.out.print("Enter your age (in year): ");
            age = myObj.nextInt();
            if (age >= 1 && age <= 125) {
                System.out.println(" The age is valid!");
            } else {
                System.out.println(" The age is NOT valid!");
            }
        } while (age < 1 || age > 125);

        // Check the age. For children, we need another application. This app is valid only for adults.
        if (age > 20) {

            int weight;
            do {
                System.out.print("Enter your weight (in kg): ");
                weight = myObj.nextInt();
                if (weight >= 1 && weight <= 300) {
                    System.out.println(" The weight is valid!");
                } else {
                    System.out.println(" The weight is NOT valid!");
                }
            } while (weight < 1 || weight > 300);

            float height;
            do {
                System.out.print("Enter your height (in cm): ");
                height = myObj.nextInt();
                if (height >= 1 && height <= 300) {
                    System.out.println(" The weight is valid!");
                } else {
                    System.out.println(" The weight is NOT valid!");
                }
            } while (height < 1 || height > 300);

            // The BMI calculation
            float bmiIndex = weight / ((height / 100) * (height / 100));

            // The BMI classification
            String classification = "";
            if (bmiIndex < 16) {
                classification = "Severe Thinness";
            } else if (bmiIndex < 17) {
                classification = "Moderate Thinness";
            } else if (bmiIndex < 18.5) {
                classification = "Mild Thinness";
            } else if (bmiIndex < 25) {
                classification = "Normal";
            } else if (bmiIndex < 30) {
                classification = "Overweight";
            } else if (bmiIndex < 35) {
                classification = "Obese Class I";
            } else if (bmiIndex < 40) {
                classification = "Obese Class II";
            } else {
                classification = "Obese Class III";
            }

            // Displaying the results
            System.out.println("Your age: " + age);
            System.out.println("Your weight: " + weight);
            System.out.println("Your height: " + height);
            System.out.println("Your BMI index: " + bmiIndex + " and its classification is: " + classification);
        }
        else {
            System.out.println("The Centers for Disease Control and Prevention (CDC) recommends Percentile Range BMI categorization for children and teens under age 20. Please check it in a relevant other application!");
        }
    }
    }
