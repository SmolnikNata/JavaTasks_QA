package hw21_06_24;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern_metasymbol {
    public static void main(String[] args) {


        //1.1. Написать регулярное выражение для проверка email (например my_25@domen-38.de).
        // Регулярное выражение для проверки email
        String emailUser = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

        // Компилируем регулярное выражение
        Pattern pattern = Pattern.compile(emailUser);

        // Примеры email-адресов для проверки
        String[] emails = {
                "my_25@domen-38.de",    // правильный email
                "example@example.com",  // правильный email
                "invalid-email@",       // неправильный email
                "user@sub.example.co.uk", // правильный email
                "example@.com"          // неправильный email
        };

        // Проверяем каждый email
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            boolean matchFound = matcher.matches();
            System.out.println("Email: " + email + " is " + (matchFound ? "valid" : "invalid"));
        }
        //2.* Написать регулярное выражение для проверки корректности нового пароля,
        //который соответствует определенным критериям
        //- состоять минимум из 8 символов;
        //- должен обязательно включать хотя бы одну маленькую букву;
        //- должен обязательно включать хотя бы одну большую букву;
        //- должен обязательно включать хотя бы одну цифру;
        //- должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&*_+-=);

        System.out.println();

        String passwordUser = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*_+\\-=])[A-Za-z\\d!@#$%^&*_+\\-=]{8,}$";
        Pattern pattern1 = Pattern.compile(passwordUser);
        String[] passwords = {
                "Ilona29_08Kill",
                "TOM#MARK+ANNI1919",
                "2302",
                "Maria*Derlin%18081004"
        };
        for (String password : passwords) {
            Matcher matcher = pattern1.matcher(password);
            boolean matchFound = matcher.matches();
            System.out.println("Password: " + password + "is " + (matchFound ? "valid " : " invalid "));
        }

        String text = "Летом можно и купаться и загорать и только летом!";
        text = "^[а-яА-Я]\\w";
    }
}

//3.* Разбить текст на слова с помощью шаблона регулярного выражения и расчитать
//словарь встречающихся слов для этого текста
//(подсчитать количество одинаковых слов, встречающихся в этом тексте).
