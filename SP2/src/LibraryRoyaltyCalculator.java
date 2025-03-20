public class LibraryRoyaltyCalculator {
    public static void main(String[] args){
//First Author
        Author author = new Author("Locklin Kaste");
        author.addTitle(new AudioBook("The Wandering Potato", "TE", 144, 150));
        author.addTitle(new PrintedBook("The Wandering Potato", "TE", 350,456));

        System.out.println("Locklin Kaste's Royalties are "+ author.calculateTotalPay() + "DKK");

        System.out.println();
//Second Author
        Author author1 = new Author("Lu Wang");
        author1.addTitle(new AudioBook("CyberCity Galore", "TE", 90,100));
        author1.addTitle(new PrintedBook("CyberCity Galore", "TE", 120, 320));

        System.out.println("Lu Wang's Royalties are " + author1.calculateTotalPay() + "DKK");

        System.out.println();
//Third Author
        Author author2 = new Author("Kimmo Dimmo");
        author2.addTitle(new AudioBook("Likelihood of Self-Sabotage", "LYRIK", 500, 200));
        author2.addTitle(new PrintedBook("Likelihood of Self-Sabotage", "LYRIK", 402,180));

        System.out.println("Kimmo Dimmo's Royalties are " + author2.calculateTotalPay() + "DKK");

        System.out.println();
//Fourth Author
        Author author3 = new Author("Olga Ravn");
        author3.addTitle(new AudioBook("Celestine", "SKØN", 140, 192));
        author3.addTitle(new PrintedBook("Celestine", "SKØN", 140, 166));

        System.out.println("Olga Ravn's Royalties are " + author3.calculateTotalPay() + "DKK");

    }
}
