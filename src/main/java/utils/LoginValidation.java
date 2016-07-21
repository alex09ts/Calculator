package utils;

public class LoginValidation {

    private static final String login = "admin";
    private static final String password = "pass";

    private static final String login2 = "a";
    private static final String password2 = "p";

    public static boolean logIn(String log, String pass) {

        return (log.equals(login) && pass.equals(password)) || (log.equals(login2) && pass.equals(password2));

    }
}
