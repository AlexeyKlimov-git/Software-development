public class Person {
    private String userName;
    private String SSN;

    // Создаем private метод, формирующий Id человека с системе
    // Этот метод только "помогает" формировать Id
    private String getId(){
        return SSN + "-" + userName;
    }

    // Создаем public метод, позволяющий считывать имя человека
    public String getUserName(){
        return userName;
    }

    // Создаем public метод, позволяющий сравнивать Id людей в системе
    public boolean isSamePerson(Person p){
        if(p.getId().equals(this.getId()) {
            return true;
        }
        else{
            return false;
        }
    }
    }

    /**
     * Set all your classes to public
     * Set all your fields to private
     * Set any of your methods to public that are considered actions
     * Set any of your methods to private that are considered helper methods
     */