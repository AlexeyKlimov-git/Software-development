// импортируем пакет, чтобы открыть и прочитать внешний файл
import java.io.File;
// Импортируем библиотеку Scanner для реализации ввода данных поьзователем
import java.util.Scanner;

// создаем оснвоной класс
public class WordCount {
    // создаем main метод для обозначения точки старта работы программы
    // "бросаем" ошибк, если метод не в состоянии обработать импортируемый файл
    public static void main(String[] args) throws Exception {
        //создаем объект file
        File file = new File("ataleoftwocities.txt");
        // создаем объект scanner
        Scanner scanner = new Scanner(file);

        // считываем число слов в импортируемом файле
        int count = 0;
        while (scanner.hasNext()) {
            count++;
            scanner.next();
        }
        // выводим количество слов в импортируемом файле
        System.out.println("The total number of words: " + count);
    }
}