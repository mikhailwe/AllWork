package HomeWork.HomeWork.hw18;

public class Pass {
    public static void main(String[] args) {
        String[] passwords = {
                "MyPassword123",
                "ffffff66",
                "ShlechtPass",
                "aSdf3h",
                "avalanchegt2020"
        };
        for (String password : passwords) {
            String result = checkPassword(password);
            System.out.println(result);
        }
    }

    public static String checkPassword(String password) {
        StringBuilder message = new StringBuilder(password);

        if (password.length() < 8 || password.length() > 20) {
            message.append(" - Пароль должет быть от 8 до 20");
        }
        if (!password.matches(".*[A-Z].*")) {
            message.append(" - Должна быть хоть одна заглавная");
        }
        if (!password.matches(".*[a-z].*")) {
            message.append(" - хотя бы строчную");
        }
        if (!password.matches(".*[0-9].*")) {
            message.append(" - Пароль должен содержать цифру");
        }
        if (password.contains(" ")) {
            message.append(" - не должен содержать пробелов");
        }
        if (message.length() > 0) {
            return message.toString();
        }
        return "Всё работает";
    }
}
