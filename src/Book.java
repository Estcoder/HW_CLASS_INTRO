public class Book {

    private String title;
    private int releaseYear;
    private Author author;
    private int pages;


    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;


    }

    public boolean isBig() {
        return pages > 500;
        }  // The same method can be written in more simple way like:
        // return pages > 500;  instead of IF statement




    public int estimatePrice() {
        double priceX = 3 * (pages * Math.sqrt(author.getRating()));
        int price = (int) Math.floor(priceX);
        return Math.max(price, 250);

//        int price = pages * 3;
//        return Math.max(price, 250);
    }


    public boolean matches(String word) {


        if (author.getName().contains(word) || author.getSurname().contains(word) || title.contains(word)) {
            return true;
        } else {
            return false;
        }

//        if (title.contains(word) || author.contains(word)) {
//            return true;
//        } else {
//            return false;
//            // Code could be easier, but for understanding better I write this way
//            // return title.contains(word) || author.contains(word);
    }


}
