public class Main {
    public static void main(String[] args) {
        System.out.println("Объекты_И_Классы");

        Author author = new Author("Айзек","Азимов");
        System.out.println(author.getName()+" "+author.getSurname()+" ");

        Book book = new Book("Двухсотлетний человек", author,1976);
        System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getPublished());

        //Методы объектов
        System.out.println("Методы_объектов");
        Author author1 = new Author("Наталья", "Иосифовна");
        Author author2 = new Author("Мария", "Иосифовна");
        System.out.println(author1.equals(author2));
        System.out.println(author2);
        Book book1 = new Book("Тут все написано", author1, 1971);
        System.out.println(book1);
    }

}