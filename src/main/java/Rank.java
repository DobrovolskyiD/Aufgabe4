public enum Rank {
    TWO("Zwei"), THREE("Drei"), FOUR("Vier"), FIVE("Fünf"), SIX("Sechs"),
    SEVEN("Sieben"), EIGHT("Acht"), NINE("Neun"), TEN("Zehn"), JACK("Bube"),
    QUEEN("Dame"), KING("König"), ACE("Ass");

    private String germanName;

    Rank(String germanName) {
        this.germanName = germanName;
    }

    public static Rank fromInt(int rankNr) {
        switch (rankNr) {
            case 0:
                return TWO;
            case 1:
                return THREE;
            case 2:
                return FOUR;
            case 3:
                return FIVE;
            case 4:
                return SIX;
            case 5:
                return SEVEN;
            case 6:
                return EIGHT;
            case 7:
                return NINE;
            case 8:
                return TEN;
            case 9:
                return JACK;
            case 10:
                return QUEEN;
            case 11:
                return KING;
            case 12:
                return ACE;
            default:
                return null;
        }
    }

    public String getGermanName() {
        return germanName;
    }
}
