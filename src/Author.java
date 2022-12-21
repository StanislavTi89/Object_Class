public class Author {
    //содержит в себе данные об имени и фамилии автора.
    public String name;
    public String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String toString() {
        return "Автор книги: " + getName() + " " + getSurname();
    }
}
