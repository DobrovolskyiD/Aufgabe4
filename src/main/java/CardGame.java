public class CardGame {
    public static void main(String[] args) {
        System.out.println("Zehn zufällige Karten:");
        for (int i = 0; i < 10; i++) {
            Card randomCard = Card.random();
            System.out.println(randomCard.name());
        }
        }
}
