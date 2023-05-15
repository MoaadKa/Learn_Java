import java.util.Scanner;

public class Questions {

    private String fullNameQuestion = "What's your name?";
    private String ageQuestion = "How old are you?";
    private String situationQuestion = "What's your family situation?";
    private String degreeQuestion = "What's your level of studies?";
    private String numberOfChildrenQuestion = "How many children you have?";

    public Questions() {
    }

    public Questions(String fullNameQuestion,
                     String ageQuestion,
                     String situationQuestion,
                     String degreeQuestion,
                     String numberOfChildrenQuestion) {
        this.fullNameQuestion = fullNameQuestion;
        this.ageQuestion = ageQuestion;
        this.situationQuestion = situationQuestion;
        this.degreeQuestion = degreeQuestion;
        this.numberOfChildrenQuestion = numberOfChildrenQuestion;
    }

    public String getFullNameQuestion() {
        return fullNameQuestion;
    }

    public String getAgeQuestion() {
        return ageQuestion;
    }

    public String getSituationQuestion() {
        return situationQuestion;
    }

    public String getDegreeQuestion() {
        return degreeQuestion;
    }

    public String getNumberOfChildrenQuestion() {
        return numberOfChildrenQuestion;
    }
}

