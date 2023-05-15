import java.util.Scanner;

public class Questions {

    public Questions(Candidate candidate) {
        this.candidate = candidate;
    }

    Candidate candidate;

    public void questions() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        candidate.setFullName(keyboard.nextLine());
        System.out.println("How old are you: ");
        candidate.setAge(keyboard.nextInt());
        keyboard.nextLine();

        System.out.println("What's your level of studies: ");
        candidate.setDegree(keyboard.nextLine());

        System.out.println("Family situation: ");
        candidate.setSituation(keyboard.nextLine());
        System.out.println("Number of children");
        candidate.setNumberOfChildren(keyboard.nextInt());


    }
}

