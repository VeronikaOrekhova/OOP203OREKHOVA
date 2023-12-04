public class Reader {
    private String fullName;
    private int libraryNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int libraryNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.libraryNumber = libraryNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numBooks) {
        System.out.println(fullName + " взял " + numBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (String title : bookTitles) {
            System.out.print(title + ", ");
        }
        System.out.println();
    }

    public void returnBook(int numBooks) {
        System.out.println(fullName + " вернул " + numBooks + " книги");
    }

    public static class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    public static void main(String[] args) {
        Reader.Book book1 = new Reader.Book("Приключения", "Автор1");
        Reader.Book book2 = new Reader.Book("Словарь", "Автор2");
        Reader.Book book3 = new Reader.Book("Энциклопедия", "Автор3");

        Reader reader = new Reader("Петров В. В.", 12345, "Факультет", "01.01.2000", "1234567890");
        reader.takeBook(3);
        reader.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader.takeBook(book1, book2, book3);

        reader.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader.returnBook(3);
    }
}

