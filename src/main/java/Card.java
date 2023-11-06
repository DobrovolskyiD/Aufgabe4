import java.util.Random;
public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String name() {
        return rank.getGermanName() + " von " + suit.getGermanName();
    }

    public static Card random() {
        Random randomGenerator = new Random();
        Suit randomSuit = Suit.fromInt(randomGenerator.nextInt(4));
        Rank randomRank = Rank.fromInt(randomGenerator.nextInt(13));
        return new Card(randomSuit, randomRank);
    }
}
