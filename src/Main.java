public class Main {
    public static void printSeparator() {
        System.out.println("******************");
    }

    public static void main(String[] args) {
        printSeparator();
        Author orwell = new Author("Джордж", "Оруэлл");
        Book nineteenEightyFour = new Book("1984", orwell,
                1949);
        nineteenEightyFour.setPublicationYear(2022);
        System.out.println(nineteenEightyFour);
        printSeparator();

        Author dostoevsky = new Author("Фёдор", "Достоевский");
        Book brothersKaramazov = new Book("Братья Карамазовы", dostoevsky, 1982);
        System.out.println(brothersKaramazov);
        printSeparator();

        if (dostoevsky.equals(orwell)) {
            System.out.println("Автор один и тот же.");
        } else {
            System.out.println("Авторы разные.");
        }
        if (nineteenEightyFour.equals(brothersKaramazov)) {
            System.out.println("Книги одинаковые.");
        } else {
            System.out.println("Книги разные.");
        }
    }
}