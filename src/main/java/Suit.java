public enum Suit {
    CLUBS("Kreuz"), DIAMONDS("Karo"), HEARTS("Herz"), SPADES("Pik");

    private String germanName;

    Suit(String germanName) {
        this.germanName = germanName;
    }

    public static Suit fromInt(int suitNr) {
        switch (suitNr) {
            case 0:
                return CLUBS;
            case 1:
                return DIAMONDS;
            case 2:
                return HEARTS;
            case 3:
                return SPADES;
            default:
                return null;
        }
    }

    public String getGermanName() {
        return germanName;
    }
}
