import java.util.Scanner;

public class CanadaApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int age=0, children=0, score = 0;
        String fullName, degree, situation;

        System.out.println("Enter your full name: ");
        fullName = keyboard.nextLine();
        System.out.println("How old are you: ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        if (age>45){
            System.out.println("Sorry, you can't apply for this!");
        }else {
            if (age>40){
                score += 0;
            } else if (age>30) {
                score +=5;
            } else if (age>25) {
                score += 7;
            } else if (age>20) {
                score += 10;
            } else if (age>17) {
                score += 15;
            }else {
                score += 20;
            }
            System.out.println("What's your level of studies: ");
            degree = keyboard.nextLine();

            System.out.println("Family situation: ");
            situation = keyboard.nextLine();
            System.out.println("Number of children");
            children = keyboard.nextInt();



            if (degree.equals("PhD")){
                score += 20;
            } else if (degree.equals("Master")){
                score +=15;
            } else if (degree.equals("Licence")){
                score += 10;
            } else if (degree.equals("Bac+2")){
                score += 7;
            } else if (degree.equals("Bac")){
                score += 5;
            }else{
                score += 0;
            }

            if (situation.equals("Single")){
                score += 20;
            } else if (situation.equals("Divorced")){
                score +=10;
            } else if (situation.equals("Married")){
                score += 5;
            }else{
                score += 0;
            }

            if (children<1){
                score += 20;
            } else if (children<2){
                score +=15;
            } else if (children<3){
                score += 10;
            }else{
                score += 0;
            }

            System.out.println("Your score is: " + score);
        }






    }
}
