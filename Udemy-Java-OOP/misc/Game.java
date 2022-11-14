public class Game {
    // объявляем атрибут
    int score;
    // Описание конструктора-метода
    Game (){
        //задаем значение по умолчанию
        score=0;
    }
    //Параметризируем конструктор
    Game(int startingScore){
        score = startingScore;
    }
}
