package hw31_05_24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class HW_filtraciya {

    public static void main(String[] args) {
        //1// 1 уровень сложности: //Задание 1: Фильтрация списка целых чисел на нечетные числа
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers);
        //2//Задание 2: Фильтрация четных чисел и умножение на 2.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> processedNumbers = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println(processedNumbers);
        //3//Задание 3: Фильтрация чисел больше 50 и вывод их квадратов.
        List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        List<Integer> squaredNumbers = numbers2.stream()
                .filter(n -> n > 50)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squaredNumbers);
        //4//Задание 4: Удаление дубликатов из списка строк.
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
        List<String> uniqueStrings = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueStrings);
        //5//Задание 5: Пропуск первых двух элементов и вывод оставшихся.
        List<String> strings1 = Arrays.asList("one", "two", "three", "four", "five");
        List<String> skippedStrings = strings1.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skippedStrings);
        //6//Задание 6: Преобразование списка строк в список чисел
        List<String> strings2 = Arrays.asList("1", "2", "3", "4", "5");
        List<Integer> numbers3 = strings2.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(numbers3);
        //7//Задание 7: Суммирование списка чисел
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers4.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum);
        //8 //Задание 8: Определение максимального значения в списке
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> max = numbers5.stream()
                .max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Max: " + value));
        //9//Задание 9: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
        List<String> strings3 = Arrays.asList("apple", "banana", "avocado", "apricot", "berry");
        List<String> filteredStrings = strings3.stream()
                .filter(s -> s.startsWith("A") || s.startsWith("a"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredStrings);
        //10//Задание 10: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
        List<Integer> numbers6 = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        List<Integer> topThreeNumbers = numbers6.stream()
                .sorted((a, b) -> b - a)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(topThreeNumbers);
        //11//Задание 11: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        List<String> strings4 = Arrays.asList("apple", "banana", "avocado", "apricot", "berry");
        char filterChar = 'a'; // или 'A', если требуется регистронезависимая фильтрация
        List<String> filteredStrings4 = strings4.stream()
                .filter(s -> s.toLowerCase().startsWith(String.valueOf(filterChar).toLowerCase()))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(filteredStrings4);
        //12//Задание 12: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        List<String> strings5 = Arrays.asList("apple", "banana", "avocado", "berry", "cherry", "banana", "apple");
        List<String> uniqueLongWords = strings5.stream()
                .filter(s -> s.length() > 4)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueLongWords);
        //13//Задание 13:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
        List<Integer> numbers7 = Arrays.asList(15, 30, 45, 60, 75, 90, 105);
        int sum7 = numbers7.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum: " + sum7);
    }

}
