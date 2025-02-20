public class Main {
    public static void main(String[] args) {


        Book book = new Book("How to write a code", 2025, new Author("Dmitrii", "Sokolov", 7), 501);


        System.out.println("Is this book big?  " + book.isBig());

        System.out.println("Does this books name or authors name/surname contains a word 'Dmitrii'? " + book.matches("Dmitrii"));

        System.out.println("The estimated book's price is: " + book.estimatePrice());


    }


}
