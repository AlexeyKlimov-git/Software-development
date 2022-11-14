/**
 * Создаем Main класс
 */
public class Main {

    /**
     * Создаем main метод
     */
    public static void main (String [] args){
        // При запуске программы создается объект myContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        // Создаем новый объект для пользователя Олег
        Contact friendOleg = new Contact();
        // Задаем атрибуты
        friendOleg.name = "Oleg";
        friendOleg.phoneNumber = "79045432656";
        // Добавлям объект пользователя Олег в ContactsManager
        myContactsManager.addContact(friendOleg);

        // Создаем новый объект для пользователя Ирина
        Contact friendIrina = new Contact();
        // Задаем атрибуты
        friendIrina.name = "Irina";
        friendIrina.phoneNumber = "79085432656";
        // Добавлям объект пользователя  в ContactsManager
        myContactsManager.addContact(friendIrina);

        // Создаем новый объект для пользователя Лариса
        Contact friendLarisa = new Contact();
        // Задаем атрибуты
        friendLarisa.name = "Larisa";
        friendLarisa.phoneNumber = "79505432656";
        // Добавлям объект пользователя  в ContactsManager
        myContactsManager.addContact(friendLarisa);

        // Ищем контакт по имени и выводим телефон контакта
        Contact result = myContactsManager.searchContact("Irina");
        System.out.println(result.phoneNumber);
    }

}
