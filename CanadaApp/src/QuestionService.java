import java.util.Scanner;

public class QuestionService {

    Candidate candidate;

    public QuestionService(Candidate candidate) {
        this.candidate = candidate;
    }

    Scanner scanner = new Scanner(System.in);
    public void fullName(){
        System.out.println(ConstantQuestions.FULLNAMEQUESTION);
        candidate.setFullName(scanner.nextLine());
    }

    public void age(){
        System.out.println(ConstantQuestions.AGEQUESTION);
        candidate.setAge(scanner.nextInt());
        scanner.nextLine();
    }

    public void situation(){
        System.out.println(ConstantQuestions.SITUATIONQUESTION);
        candidate.setSituation(scanner.nextLine());
    }

    public void degree(){
        System.out.println(ConstantQuestions.DEGREEQUESTION);
        candidate.setDegree(scanner.nextLine());
    }

    public void numberOfChildren(){
        System.out.println(ConstantQuestions.NUMBEROFCHILDRENQUESTION);
        candidate.setNumberOfChildren(scanner.nextInt());
    }

    public void questionGenerator(Candidate candidate){
        fullName();
        age();
        situation();
        degree();
        numberOfChildren();
    }
}
