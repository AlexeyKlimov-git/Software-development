// В Java лучше все атрибуты делать private
public class Book {
    private String title;
    private  String author;
    private boolean isBorrowed;

    // Чтобы вывести или задать значение скрытого атрибута нужно создать public метод
    public Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Создаем Setter конструктор
    public void borrowBook(){
        isBorrowed = true;
    }
    // Создаем Setter конструктор
    public void returnBook(){
        isBorrowed = false;
    }
    // Создаем Getter конструктор
    public boolean isBookBorrowed(){
        return isBorrowed;
    }

    }
