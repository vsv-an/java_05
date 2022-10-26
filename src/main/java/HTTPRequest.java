public class HTTPRequest {

//    Greek "el": "Λονδίνο"
//    Persian (Farsi) "fa": "لندن"
//    Hindi "hi": "लंदन"
//    French "fr": "Londres"
//    English "en": "London"


    //В классе HTTPRequest:
    //
    // 8. Создать переменные типа String с названиями города Лондон
    // на перечисленных выше языках.
    String londonGreek = "Λονδίνο";
    String londonPersianFarsi = "لندن";
    String londonHindi = "लंदन";
    String londonFrench = "Londres";
    String londonEnglish = "London";

    // 9. Создать метод createRequest(), который принимает на вход параметры:
    // String cityName
    // String apiKey
    // Метод возвращает строку запроса по названию города
    // (шаблон запроса нужно взять в документации),
    // вставляя необходимые параметры в шаблон.
    // Метод так же печатает созданные запросы на разных языках.
    //
    // Скопируйте полученные строки запросов, сделайте запросы в браузере,
    // и сравните ответы, совпадают ли они или нет.

    public String createRequest(String cityName, String apiKey) {

        return "London";

    }

}
