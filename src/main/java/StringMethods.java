public class StringMethods {

    // 1. Написать метод removeSpaces(), который принимает на вход строку.
    // Если строка не пустая (проверить методом класса String), то примените
    // метод по удалению пробелов в начале и в конце строки.
    // Догадаться, каким методом из видео можно проверить, были ли пробелы
    // в строке.
    // Если пробелы были, то метод должен удалить их и вернуть сообщение:
    // “Лишние пробелы удалены”.
    // Если пробелов не было, вернуть сообщение “Пробелов не было”.
    // Если строка пустая (проверить методом класса String),
    // вернуть сообщение “Строка пустая”.
    //
    // Test Data:
    // “    Red Rover School   “ → “Лишние пробелы удалены”
    // “Red Rover School“ → “Пробелов не было”
    // “” → “Строка пустая”

    public String removeSpaces(String str) {
        if (str.isEmpty() != true) {
            String str1 = str.trim();
            if (str.length() != str1.length()) {

                return "Лишние пробелы удалены";
            }

            return "Пробелов не было";
        }

        return "Строка пустая";
    }

    // 2. Написать алгоритм removeAllAs().
    // С помощью методов из видео1,  написать алгоритм, который принимает
    // на вход строку. Если строка валидная, то метод удаляет все буквы a
    // из строки, если таковые имеются. Метод возвращает обработанную строку.
    // Test Data:
    // “    Red Rover School   “ →  “Red Rover School“
    // “panda   “ → “pnd”
    // “taramasalata” → “trmslt”
    public String removeAllAs(String str) {
        if (str.length() != 0) {
            str = str.trim().replace("a", "");

            return str;
        }

        return "Строка пустая";
    }

    // 3. Написать алгоритм removeAllZeros().
    // С помощью методов из видео1,  написать алгоритм, который принимает
    // на вход строку, состоящую из цифр. Если строка валидная, то метод удаляет
    // все пробелы из строки, если таковые имеются. Метод возвращает
    // обработанную строку, в которой нет нулей. Если в строке не было нулей,
    // метод возвращает сообщение “This is a valid string”.
    // Test Data:
    // “3504209706040000 “ →  “35429764“
    // “0000000111“ → “111”
    public String removeAllZeros(String str) {
        if (str.length() != 0) {
            String strNew = str.replace("0", "");
            if (str.length() == strNew.length()) {

                return "This is a valid string";
            }
            strNew = strNew.replace(" ", "");
            return strNew;
        }

        return "Строка пустая";
    }

    // 4. Написать алгоритм removeAllSpaces.
    //С помощью методов из видео1,  написать алгоритм, который принимает
    // на вход строку. Если строка валидная, то метод удаляет все пробелы из
    // строки, если таковые имеются. Метод возвращает обработанную строку.
    // Test Data:
    // “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
    // “p a     n   d a   “ → “panda”
    public String removeAllSpaces(String str) {
        if (str.length() != 0) {
            str = str.replace(" ", "");

            return str;
        }

        return "Пустая строка";
    }

    // 5. Напишите метод countAs(), который принимает на вход строку и считает,
    // сколько букв а или А содержится в строке.
    // Метод возвращает количество букв a/A,  и количество букв/знаков в слове
    // без букв a/A. Итоговый результат должен строится с помощью метода из
    // видео 2.
    // Test Data:
    // “Abracadabra” → “5, 6”
    // “Homenum Revelio” → “0, 15”
    // “3 tarAmasAlatA” → “6, 8”
    public String countAs(String str) {
        if (str.length() != 0) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'a') {
                    count++;
                }
            }

            return count + ", " + (str.length() - count);
        }

        return "Пустая строка";
    }

    // 6. Напишите метод countJava(), который принимает на вход текст и
    // проверяет, содержится ли в тексте хотя бы одно слово Java.
    //Test Data:
    //“As of March 2022, Java 18 is the latest version, while Java 17, 11
    // and 8 are the current long-term support (LTS) versions. Oracle released
    // the last zero-cost public update for the legacy version Java 8 LTS in
    // January 2019 for commercial use, although it will otherwise still support
    // Java 8 with public updates for personal use indefinitely. Other vendors
    // have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still
    // receiving security and other upgrades.” → true
    //
    // “99 little bugs in a code.
    // 99 little bugs in a code.
    // Take one down, and patch it around.
    // 235 critical bugs in the code.” → false

    public boolean countJava(String text) {
        if (text.length() != 0) {
            if (text.contains("Java")) {
                return true;
            }
        }

        return false;
    }

    // 7. Напишите метод insertQuotes(), который принимает слово и возвращает
    // строку, в которой это слово “обернуто” в кавычки:
    // Test Data:
    // “Abracadabra” →  ““Abracadabra””
    public String insertQuotes(String str) {
        return "\"" + str + "\"";
    }

    // 8. Напишите метод insertQuotes(), который принимает на вход две строки,
    // и добавляет знак :  после слова “говорил”,  и оборачивает в кавычки вторую строку
    // (результат строится с помощью метода concat())
    //
    //Test Data:
    //“Федор Достоевский писал”, “Надо любить жизнь больше, чем смысл жизни.” →
    //“Федор Достоевский писал: "Надо любить жизнь больше, чем смысл жизни."”
    // Задание со звездочкой:
    // “Наполеон Бонапарт писал”, “В моем словаре нет слова «невозможно».” →
    // "Наполеон Бонапарт писал: "В моем словаре нет слова "невозможно".""
    public String insertQuotas(String str1, String str2) {

        return str1.concat(": " + "\""+ str2 + "\"");
    }

    public String insertQuotasNapoleon(String str1, String str2) {
        str2 = str2.replace("«", "\"");
        str2 = str2.replace("»", "\"");

        return str1.concat(": " + "\""+ str2 + "\"");
    }

    // 9. Напишите метод, кторый принимает на вход
    // название города и исправляет написание:
    // Test Data:
    //        “ташкент” → “Ташкент”
    //        “ЧикаГО” → “Чикаго”
    public String correctCityName(String city) {
        city = city.substring(0, 1).toUpperCase() + city.substring(1).toLowerCase();

        return city;
    }

    // 10. Напишите метод, который принимает на вход строку и букву-параметр,
    // и возвращает все, что находится между первой
    // и последней буквой-параметром:
    // Test Data:
    // “Abracadabra”, “b” → “bracadab”
    // “Whippersnapper”, “p” → “ppersnapp”
    public String indexOfFirstLast(String str, String letter) {

        return str.substring(str.indexOf(letter), str.lastIndexOf(letter) + 1);
    }

    // 11. Напишите метод, который принимает на вход слово,
    // и возвращает true, если слово начинается и заканчивается
    // на одинаковую букву, и false иначе
    // Test Data:
    //    “Abracadabra” → true
    //    “Whippersnapper” → false
    public boolean SameFirstLastLetter(String str) {
        if ((str.toLowerCase().substring(0, 1)).
                equals(str.substring(str.length() - 1))) {

            return true;
        }

        return false;
    }

    // 12. Напишите метод, который принимает на вход строку из двух слов,
    // разделенных пробелом, и возвращает последнее слово
    // Test Data:
    //    “Red Rover” → “Rover”
    public String returnLastWord(String str) {

        return str.substring(str.lastIndexOf(" ") + 1);
    }

    // 13. Написать метод, который принимает строку, и 2 индекса.
    // Метод удаляет все, что находится между двумя индексами включительно
    // Test Data:
    //    “Red rover”, 1, 4 → “Rover”
    public String deleteLettersBetweenTwoIndices(String str, int a, int b) {

        return str.substring(0, a) + str.substring(b + 1);
    }

    // 14. Напишите метод, который принимает на вход предложение и
    // возвращает слова из этого предложения в виде массива слов
    // Test Data:
    // “QA for Everyone” → {“QA”, “for”, “Everyone”}
    // “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
    public String[] stringArray(String str) {
        String parts[] = str.split(" ");

        return parts;
    }

    // 15. Написать метод, который принимает на вход предложение,
    // которое состоит из имени, фамилии, отчества и возвращает текст:
    // Test Data:
    // “Александр Сергеевич Пушкин” →
    //
    // “Имя: Александр
    // Отчество: Сергеевич
    // Фамилия: Пушкин”
    public String splitFIO(String str) {
        String[] arr = str.split(" ");
        return "Имя: " + arr[0] + "\n"
                + "Отчество: " + arr[1] + "\n"
                + "Фамилия: "  + arr[2];
    }


    // 16. Написать метод, который принимает на вход слово и число n,
    // и возвращает строку, где слово повторяется n раз.
    // Test Data:
    // “one”, 5 → “oneoneoneoneone”
    public String repeatString(String str, int n) {

        return str.repeat(n);
    }

    // 17. Напишите метод, который принимает строку и index,
    // и возвращает численное значение буквы, которая находится
    // на позиции index (использовать только один метод класса String)
    public int indexPosition(String str, int n) {

        return str.charAt(n);
    }

    // 18. Написать метод, который принимает 3 слова, и сравнивает их методом,
    // который считает, что прописные и заглавные буквы - это одни и те же
    // буквы. Метод возвращает true, если все слова одинаковы, и метод
    // возвращает false, если слова не одинаковы:
    // Test Data:
    //        “one”, “One”, “ONE”  → true
    //        “one”, “Один”, “ONE” → false
    public boolean compareThreeWords(String word1, String word2, String word3) {
        if (word1.compareToIgnoreCase(word2) == 0
                && word1.compareToIgnoreCase(word3) == 0) {

            return true;
        }

        return false;
    }

}
