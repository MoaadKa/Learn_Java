public class Results {

    Candidate candidate;
    int score = 0;

    public Results(Candidate candidate) {
        this.candidate = candidate;
    }

    public int scoreTotal(){
        int age = candidate.getAge();
        String degree = candidate.getDegree();
        String situation = candidate.getSituation();
        int children = candidate.getNumberOfChildren();

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
        return score;
    }

    public void resultsDisplay(){
        score = scoreTotal();
        System.out.println("your score is " + score);
    }


}
