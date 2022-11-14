public class ContactsManager {
    // Создаем атрибуты
    // Создаем массив для списка контактов
    Contact [] myFriends;
    //Задаем число контактов, чтобы потом добавлять контакты в будущем с определенного места в массиве
    int friendsCount;

    // Создаем конструктор, чтобы проинициализировать аттрибуты выше
    ContactsManager(){
        this.friendsCount = 0;
        // Любой массив задаем с keyword new
        // Зараезервируем в памяти место под 500 контактов
        this.myFriends = new Contact[500];
    }

    // Создаем метод, заносящий контакт-объект в массив myFriends
    void addContact(Contact contact){
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Создаем метод, который ищет контакт в массиве
    Contact searchContact(String searchName){
        for(int i=0; i<friendsCount; i++){
            if (myFriends[i].name.equals(searchName)){
                return myFriends[i];
            }
        }
    return null;
    }

}
