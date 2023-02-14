import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

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

    // Positive test
    @Test
    public void testRemoveSpaces_HappyPath() {
        //AAA
        //Arrange
        String str = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";

        //Act
        String actualResult = new StringMethods().removeSpaces(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Positive test
    @Test
    public void testNoSpacesBeforeAndAfter_HappyPath() {
        //AAA
        //Arrange
        String str = "Red Rover School";
        String expectedResult = "Пробелов не было";

        //Act
        String actualResult = new StringMethods().removeSpaces(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Positive test
    @Test
    public void StringIsEmpty_HappyPath() {
        //AAA
        //Arrange
        String str = "";
        String expectedResult = "Строка пустая";

        //Act
        String actualResult = new StringMethods().removeSpaces(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 2. Написать алгоритм removeAllAs().
    // С помощью методов из видео1,  написать алгоритм, который принимает
    // на вход строку. Если строка валидная, то метод удаляет все буквы a
    // из строки, если таковые имеются. Метод возвращает обработанную строку.
    // Test Data:
    // “    Red Rover School   “ →  “Red Rover School“
    // “panda   “ → “pnd”
    // “taramasalata” → “trmslt”

    // Positive test
    @Test
    public void testRemoveAllSpaces_HappyPath() {

        //AAA
        //Arrange
        String str = "    Red Rover School   ";

        String expectedResult = "Red Rover School";

        //Act
        String actualResult = new StringMethods().removeAllAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Positive test
    @Test
    public void testRemoveAllAsAndSpaces_HappyPath() {

        //AAA
        //Arrange
        String str = "panda   ";

        String expectedResult = "pnd";

        //Act
        String actualResult = new StringMethods().removeAllAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Positive test
    @Test
    public void testRemoveAllAs_HappyPath() {

        //AAA
        //Arrange
        String str = "taramasalata";

        String expectedResult = "trmslt";

        //Act
        String actualResult = new StringMethods().removeAllAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Negative test
    @Test
    public void testRemoveAllAsStringIsEmpty() {

        //AAA
        //Arrange
        String str = "";

        String expectedResult = "Строка пустая";

        //Act
        String actualResult = new StringMethods().removeAllAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
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

    // Positive test
    @Test
    public void testRemoveAllZerosAndSpaces_HappyPath() {
        //AAA
        //Arrange
        String str = "3504209706040000 ";

        String expectedResult = "35429764";

        //Act
        String actualResult = new StringMethods().removeAllZeros(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // Positive test
    @Test
    public void testRemoveAllZeros_HappyPath() {
        //AAA
        //Arrange
        String str = "0000000111";

        String expectedResult = "111";

        //Act
        String actualResult = new StringMethods().removeAllZeros(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoZeros_HappyPath() {
        //AAA
        //Arrange
        String str = "111";

        String expectedResult = "This is a valid string";

        //Act
        String actualResult = new StringMethods().removeAllZeros(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 4. Написать алгоритм removeAllSpaces.
    //С помощью методов из видео1,  написать алгоритм, который принимает
    // на вход строку. Если строка валидная, то метод удаляет все пробелы из
    // строки, если таковые имеются. Метод возвращает обработанную строку.
    // Test Data:
    // “    R e d     Ro ve    r Sc   h ool   “ →  “RedRoverSchool“
    // “p a     n   d a   “ → “panda”

    //Positive Test
    @Test
    public void testRemoveAllSpacesTwo_HappyPath() {
        //AAA
        //Arrange
        String str = "    R e d     Ro ve    r Sc   h ool   ";

        String expectedResult = "RedRoverSchool";

        //Act
        String actualResult = new StringMethods().removeAllSpaces(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
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

    //Positive Test
    @Test
    public void testCountAs_HappyPath() {
        //AAA
        //Arrange
        String str = "Abracadabra";

        String expectedResult = "5, 6";

        //Act
        String actualResult = new StringMethods().countAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void testCountNoAs_HappyPath() {
        //AAA
        //Arrange
        String str = "Homenum Revelio";

        String expectedResult = "0, 15";

        //Act
        String actualResult = new StringMethods().countAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void testCountAsToLowerCase_HappyPath() {
        //AAA
        //Arrange
        String str = "3 tarAmasAlatA";

        String expectedResult = "6, 8";

        //Act
        String actualResult = new StringMethods().countAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void testCountAsEmptyString_HappyPath() {
        //AAA
        //Arrange
        String str = "";

        String expectedResult = "Пустая строка";

        //Act
        String actualResult = new StringMethods().countAs(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
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

    //Positive Test
    @Test
    public void countJava() {
        //AAA
        //Arrange
        String text = "As of March 2022, Java 18 is the latest version, "
                + "while Java 17, 11 and 8 are the current long-term support ("
                + "LTS) versions. Oracle released the last zero-cost public "
                + "update for the legacy version Java 8 LTS in January 2019 "
                + "for commercial use, although it will otherwise still support "
                + "Java 8 with public updates for personal use indefinitely. "
                + "Other vendors have begun to offer zero-cost builds of "
                + "OpenJDK 8 and 11 that are still receiving security and other "
                + "upgrades.";

        boolean expectedResult = true;

        //Act
        boolean actualResult = new StringMethods().countJava(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void countNoJava() {
        //AAA
        //Arrange
        String text = "99 little bugs in a code. "
                + " 99 little bugs in a code. "
                + " Take one down, and patch it around. "
                + " 235 critical bugs in the code.";

        boolean expectedResult = false;

        //Act
        boolean actualResult = new StringMethods().countJava(text);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 7. Напишите метод insertQuotes(), который принимает слово и возвращает
    // строку, в которой это слово “обернуто” в кавычки:
    // Test Data:
    // “Abracadabra” →  ““Abracadabra””

    //Positive Test
    @Test
    public void insertQuotas() {
        //AAA
        //Arrange
        String str = "Abracadabra";

        String expectedResult = "\"Abracadabra\"";

        //Act
        String actualResult = new StringMethods().insertQuotes(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
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

    //Positive Test
    @Test
    public void testInsertQuotas() {
        //AAA
        //Arrange
        String str1 = "Федор Достоевский писал";
        String str2 = "Надо любить жизнь больше, чем смысл жизни.";

        String expectedResult = "Федор Достоевский писал: "
                + "\"Надо любить жизнь больше, чем смысл жизни.\"";

        //Act
        String actualResult = new StringMethods().insertQuotas(str1, str2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void testInsertQuotasNapoleon() {
        //AAA
        //Arrange
        String str1 = "Наполеон Бонапарт писал";
        String str2 = "В моем словаре нет слова «невозможно».";

        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";

        //Act
        String actualResult = new StringMethods().insertQuotasNapoleon(str1, str2);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 9. Напишите метод, кторый принимает на вход
    // название города и исправляет написание:
    // Test Data:
    //        “ташкент” → “Ташкент”
    //        “ЧикаГО” → “Чикаго”

    //Positive Test
    @Test
    public void testCorrectCityName_HappyPath() {
        //AAA
        //Arrange
        String city = "ташкент";

        String expectedResult = "Ташкент";

        //Act
        String actualResult = new StringMethods().correctCityName(city);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void testCorrectCityNameToLowerCase_HappyPath() {
        //AAA
        //Arrange
        String city = "ЧикаГО";

        String expectedResult = "Чикаго";

        //Act
        String actualResult = new StringMethods().correctCityName(city);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 10. Напишите метод, который принимает на вход строку и букву-параметр,
    // и возвращает все, что находится между первой
    // и последней буквой-параметром:
    // Test Data:
    // “Abracadabra”, “b” → “bracadab”
    // “Whippersnapper”, “p” → “ppersnapp”

    //Positive Test
    @Test
    public void testIndexOfFirstLastLetter_HappyPath() {
        //AAA
        //Arrange
        String str = "Abracadabra";
        String letter = "b";

        String expectedResult = "bracadab";

        //Act
        String actualResult = new StringMethods().indexOfFirstLast(str, letter);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void testIndexOfFirstLastLetter1_HappyPath() {
        //AAA
        //Arrange
        String str = "Whippersnapper";
        String letter = "p";

        String expectedResult = "ppersnapp";

        //Act
        String actualResult = new StringMethods().indexOfFirstLast(str, letter);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 11. Напишите метод, который принимает на вход слово,
    // и возвращает true, если слово начинается и заканчивается
    // на одинаковую букву, и false иначе
    // Test Data:
    //    “Abracadabra” → true
    //    “Whippersnapper” → false

    //Positive Test
    @Test
    public void testSameFirstLastLetter() {
        //AAA
        //Arrange
        String str = "Abracadabra";

        boolean expectedResult = true;

        //Act
        boolean actualResult = new StringMethods().SameFirstLastLetter(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void testOtherFirstLastLetter() {
        //AAA
        //Arrange
        String str = "Whippersnapper";

        boolean expectedResult = false;

        //Act
        boolean actualResult = new StringMethods().SameFirstLastLetter(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void testOtherFirstLastLetterIndexOf() {
        //AAA
        //Arrange
        String str = "Whippersnapper";

        boolean expectedResult = false;

        //Act
        boolean actualResult = new StringMethods().SameFirstLastLetterIndexOf(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 12. Напишите метод, который принимает на вход строку из двух слов,
    // разделенных пробелом, и возвращает последнее слово
    // Test Data:
    //    “Red Rover” → “Rover”

    //Positive Test
    @Test
    public void testReturnLastWord_HappyPath() {
        //AAA
        //Arrange
        String str = "Red Rover";

        String expectedResult = "Rover";

        //Act
        String actualResult = new StringMethods().returnLastWord(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }

    // 13. Написать метод, который принимает строку, и 2 индекса.
    // Метод удаляет все, что находится между двумя индексами включительно
    // Test Data:
    //    “Red rover”, 1, 4 → “Rover”

    //Positive Test
    @Test
    public void testDeleteLetterBetweenTwoIndices_HappyPath() {
        //AAA
        //Arrange
        String str = "Red rover";
        int a = 1;
        int b = 4;

        String expectedResult = "Rover";

        //Act
        String actualResult = new StringMethods().deleteLettersBetweenTwoIndices(str, a, b);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 14. Напишите метод, который принимает на вход предложение и
    // возвращает слова из этого предложения в виде массива слов
    // Test Data:
    // “QA for Everyone” → {“QA”, “for”, “Everyone”}
    // “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}

    //Positive Test
    @Test
    public void stringArray() {
        //AAA
        //Arrange
        String str = "QA for Everyone";

        String[] expectedResult = {"QA", "for", "Everyone"};

        //Act
        String[] actualResult = new StringMethods().stringArray(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void stringArrayTwo() {
        //AAA
        //Arrange
        String str = "Александр Сергеевич Пушкин";

        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};

        //Act
        String[] actualResult = new StringMethods().stringArray(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 15. Написать метод, который принимает на вход предложение,
    // которое состоит из имени, фамилии, отчества и возвращает текст:
    // Test Data:
    // “Александр Сергеевич Пушкин” →
    //
    // “Имя: Александр
    // Отчество: Сергеевич
    // Фамилия: Пушкин”

    //Positive Test
    @Test
    public void testSplitFIO_HappyPath() {
        //AAA
        //Arrange
        String str = "Александр Сергеевич Пушкин";

        String expectedResult = "Имя: Александр\n"
                + "Отчество: Сергеевич\n"
                + "Фамилия: Пушкин";

        //Act
        String actualResult = new StringMethods().splitFIO(str);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);

    }


    // 16. Написать метод, который принимает на вход слово и число n,
    // и возвращает строку, где слово повторяется n раз.
    // Test Data:
    // “one”, 5 → “oneoneoneoneone”

    //Positive Test
    @Test
    public void testRepeatLetter_HappyPath() {
        //AAA
        //Arrange
        String str = "one";
        int n = 5;

        String expectedResult = "oneoneoneoneone";

        //Act
        String actualResult = new StringMethods().repeatString(str, n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 17. Напишите метод, который принимает строку и index,
    // и возвращает численное значение буквы, которая находится
    // на позиции index (использовать только один метод класса String)

    //Positive Test
    @Test
    public void testIndexLetter_HappyPath() {
        //AAA
        //Arrange
        String str = "Redrover shool";
        int n = 2;

        int expectedResult = 100;

        //Act
        int actualResult = new StringMethods().indexPosition(str, n);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    // 18. Написать метод, который принимает 3 слова, и сравнивает их методом,
    // который считает, что прописные и заглавные буквы - это одни и те же
    // буквы. Метод возвращает true, если все слова одинаковы, и метод
    // возвращает false, если слова не одинаковы:
    // Test Data:
    //        “one”, “One”, “ONE”  → true
    //        “one”, “Один”, “ONE” → false

    //Positive Test
    @Test
    public void compareThreeWords_HappyPath() {
        //AAA
        //Arrange
        String word1 = "one";
        String word2 = "One";
        String word3 = "ONE";

        boolean expectedResult = true;

        //Act
        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //Positive Test
    @Test
    public void compareThreeWordsNumberTwo_HappyPath() {
        //AAA
        //Arrange
        String word1 = "one";
        String word2 = "Один";
        String word3 = "ONE";

        boolean expectedResult = false;

        //Act
        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }


}