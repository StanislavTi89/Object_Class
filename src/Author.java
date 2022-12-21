import java.util.Objects;

public class Author {
    //содержит в себе данные об имени и фамилии автора.
    private String name;
    private String surname;

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
        return getName() + " " + getSurname();
    }


    public boolean equals(Object obj) {
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return name.equals(author.name) && surname.equals(author.surname);
    }


    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
