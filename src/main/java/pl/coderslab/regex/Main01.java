package pl.coderslab.regex;

public class Main01 {

    public static void main(String[] args) {

    }

    static boolean verifyEmail(String email) {
        String regex = "^[a-zA-Z0-9]+[\\.[a-zA-Z0-9]*@[a-zA-Z0-9]+[\\.[a-zA-Z0-9]*\\.[a-z]{2,}$";
        return email.matches(regex);
    }
}
