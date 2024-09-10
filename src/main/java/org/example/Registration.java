package org.example;

public class Registration {

    private static String email;
    private static String userName;
    private static String password;

    public Registration (String email, String userName, String password){
        Registration.email=email;
        Registration.userName=userName;
        Registration.password=password;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        boolean valid = true;
        if (email.contains("yahoo.com")){
            Registration.email = email;
        } else {
            System.out.println("Please enter the correct email address");
        }
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        if (userName.isEmpty() || userName.length()<=6){
            System.out.println("Username cannot be empty and has to be more than 6 characters");
        } else{
            Registration.userName = userName;
        }
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        if (password.isEmpty() || password.length()<=6 || password.contains(getUserName())){
            System.out.println("Password cannot be empty and has to be more than 6 characters. It cannot contain user name");
        } else{
            Registration.password = password;
        }
    }

    public static void main(String[] args) {

        setEmail("syntax123@yahoo.com");
        setUserName("SyntaxUser");
        setPassword("Password12345");
        System.out.println("Email: " + getEmail());
        System.out.println("User name: " + getUserName());
        System.out.println("Password: " + getPassword());

    }
}
