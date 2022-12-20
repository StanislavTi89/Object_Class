public class Main {
    public static void main(String[] args) {
        System.out.println("Объекты_И_Классы");

        Author author = new Author("Айзек", "Азимов");
        System.out.println(author.getName()+" "+author.getSurname()+" ");
        Book book = new Book("Двухсотлетний человек", author,1976);
        System.out.println(book.getTitle() +" ," + book.getAuthor() +" ,"+ book.getPublished());
    }
}