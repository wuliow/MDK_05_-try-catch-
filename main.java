public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
    try {
        if (login.length() > 20 || !login.matches("\\w+")) {
            throw new WrongLoginException("Wrong login format");
        }
        if (password.length() > 20 || !password.matches("\\w+")) {
            throw new WrongPasswordException("Wrong password format");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirm password do not match");
        }
        return true;
    } catch (WrongLoginException | WrongPasswordException e) {
        System.err.println(e.getMessage());
        return false;
    }
}