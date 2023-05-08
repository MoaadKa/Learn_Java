public class Candidate extends User{

    private String fullName;
    private int age;
    private String situation;
    private int numberOfChildren;
    private String degree;

    public Candidate() {
    }

    public Candidate(String fullName, int age, String situation, int numberOfChildren, String degree) {
        this.fullName = fullName;
        this.age = age;
        this.situation = situation;
        this.numberOfChildren = numberOfChildren;
        this.degree = degree;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>45){
            System.out.println("You're not qualified");
        }
        this.age = age;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", situation='" + situation + '\'' +
                ", numberOfChildren=" + numberOfChildren +
                ", degree='" + degree + '\'' +
                '}';
    }

    @Override
    public void authorities() {
        System.out.println("You don't have access");
    }
}
