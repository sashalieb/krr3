import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        // Подсчет повторений имени
        Map<String, Integer> nameCount = new HashMap<>();
        for (String fullName : employees) {
            String firstName = fullName.split(" ")[0];
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }

        // Сортировка по убыванию количества повторений
        List<Map.Entry<String, Integer>> list = new ArrayList<>(nameCount.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // Вывод результатов
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
