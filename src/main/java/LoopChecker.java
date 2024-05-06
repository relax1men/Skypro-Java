public class LoopChecker implements Checker {
    public final String validCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_";

    @Override
    public void check(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        checkLength(login, true);
        checkLength(password, false);
        checkCharacters(login, true);
        checkCharacters(password, false);
        checkPassword(password, confirmPassword, confirmPassword);
    }

    private void checkCharacters(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        if (s == null) {
            throwException(login, "null");
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!validCharacters.contains(Character.toString(chars[i]))) {
                continue;
            }
            throwException(login, "НЕкорректный символ");
        }
    }

    private void checkLength(String s, boolean login) throws WrongLoginException, WrongPasswordException {
        if (s.length() <= 20) {
            return;
        }
        throwException(login, "Некорректная длина");
    }

}

