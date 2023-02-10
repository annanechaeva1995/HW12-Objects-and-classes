public class Main {
    public static void printSeparator() {
        System.out.println("******************");
    }

    public static void main(String[] args) {
        printSeparator();
        Author orwell = new Author("Джордж", "Оруэлл");
        System.out.println("Author = " + orwell.getName() + " " + orwell.getLastName());

        Book nineteenEightyFour = new Book("1984", new Author(orwell.getName(), orwell.getLastName()),
                1949);
        nineteenEightyFour.setPublicationYear(2022);
        System.out.println("nineteenEightyFour.getTitle() = " + nineteenEightyFour.getTitle());
        System.out.println("nineteenEightyFour.getAuthor() = " + nineteenEightyFour.getAuthor());
        System.out.println("nineteenEightyFour.getPublicationYear() = " + nineteenEightyFour.getPublicationYear());
        printSeparator();

        Author dostoevsky = new Author("Фёдор", "Достоевский");
        System.out.println("Author = " + dostoevsky.getName() + " " + dostoevsky.getLastName());

        Book brothersKaramazov = new Book("Братья Карамазовы", new Author(dostoevsky.getName(),
                dostoevsky.getLastName()), 1982);
        System.out.println("brothersKaramazov.getTitle() = " + brothersKaramazov.getTitle());
        System.out.println("brothersKaramazov.getAuthor() = " + brothersKaramazov.getAuthor());
        System.out.println("brothersKaramazov.getPublicationYear() = " + brothersKaramazov.getPublicationYear());
        printSeparator();
    }
}