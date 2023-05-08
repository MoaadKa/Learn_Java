public class Admin extends User{
    @Override
    public void authorities() {
        System.out.println("Access approved");
    }
}
