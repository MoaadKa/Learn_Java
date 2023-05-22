public class Main {
    public static void main(String[] args) {

        Candidate candidate = new Candidate();
        QuestionService questionService = new QuestionService(candidate);
        questionService.questionGenerator(candidate);
        Results results = new Results(candidate);
        results.resultsDisplay();

        
    }
}
