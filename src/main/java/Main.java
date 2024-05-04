public class Main {
    public static void main(String[] args) {
        String login = "denis!";
        String password = "111222";
        String confirmPassword = "111222";
        AuthService.validate(login, password, confirmPassword);
    }
}
